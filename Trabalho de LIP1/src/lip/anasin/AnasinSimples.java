package lip.anasin;

import java.util.List;

import lip.analex.AnalexSimples;
import lip.analex.Token;
import lip.analex.TokenLexema;

public class AnasinSimples {

	private List<TokenLexema> tokenLexemaList;
	private int contador = 0;

	public AnasinSimples(String cadeia) {
		AnalexSimples analex = new AnalexSimples(cadeia);
		this.tokenLexemaList = analex.analex();
	}

	public void anasint() {
		if(this.tokenLexemaList!=null) {
			this.program();
			if(this.contador!=tokenLexemaList.size()) {
				//ERRO NO ANALISADOR SINTATICO
				this.msg("ERRO NO ANALISADOR SINTATICO");
			}
		}
		else {
			//ERRO NO ANALISADOR LEXICO
			this.msg("ERRO NO ANALISADOR LEXICO");
		}

	}
	//completo
	private void  program() {
		this.msg("Entrou program| " + this.nextToken());
		if(this.nextToken().getToken() == Token.BEGIN) {
			this.lex();
			this.stmt_list();
			if(this.nextToken().getToken() == Token.END) {
				this.lex();
				this.msg("Fim de expressão "+ this.nextToken());
			}
		}
			
		this.msg("Saiu program | " + this.nextToken());
	}
	//completo
	private void stmt_list() {
		this.msg("Entrou stmt_list() | token: " + this.nextToken());
		this.stmt();
		if(this.nextToken().getToken() ==  Token.PONTO_VIRGULA) {
			this.lex();
			this.stmt_list();

		}
		this.msg("Saiu stmt_list(), token: " + this.nextToken());
	}
	// concluido
	private void stmt() {
		this.msg("Entrou stmt(), token: " + this.nextToken());
		//this.lex();
		this.exp();
		if(this.nextToken().getToken() == Token.OPERADOR_ATRIB) {
			this.lex();
			this.expression();
			//this.exp();
		}
		this.msg("Saiu stmt(), token: " + this.nextToken());
	}
	//concluido
	private void expression() {
		this.msg("Entrou expression() " + this.nextToken());
		this.term();
		//this.lex();
		while(this.nextToken().getToken() == Token.OPERADOR_SOMA || this.nextToken().getToken() == Token.OPERADOR_SUBT ) {
			this.lex();
			this.term();
		}	
		this.msg("Saiu expression(), token: " + this.nextToken());

	}

	private void term() {
		this.msg("Entrou term(), token: " + this.nextToken());
		this.factor();
		//this.lex();
		while(this.nextToken().getToken() == Token.OPERADOR_MULT || this.nextToken().getToken() == Token.OPERADOR_DIVI) {
			this.lex();
			this.factor();	
		}
		this.msg("Saiu expression(), token: " + this.nextToken());
	}

	private void factor() {
		this.msg("Entrou factor(), token: " + this.nextToken());
		this.exp();
		if(this.nextToken().getToken() == Token.OPERADOR_EXP) {
			if(this.nextToken().getToken() == Token.OPERADOR_EXP) {
				this.lex();
				this.factor();

			}
		}

		this.msg("Saiu factor(), token: " + this.nextToken());
	}
	private void exp() {

		this.msg("Entrou exp(), token: " + this.nextToken());
		if(this.nextToken().getToken() == Token.IDENTIFICADOR) {
			this.lex();
		}else if(this.nextToken().getToken() == Token.OPERADOR_ATRIB) {
			this.lex();
		}else if(this.nextToken().getToken() == Token.LITERAL_INTEIRO){
			this.lex();
				
		}else if(this.nextToken().getToken() == Token.PONTO_FLUTUANTE) {
			this.lex();
		}else if(this.nextToken().getToken() == Token.PARENTESIS_ESQ) {
			this.lex();
			this.expression();
			if(this.nextToken().getToken() == Token.PARENTESIS_DIR) {
				this.lex();
			}else {
				//ERROR
				this.msg("***ERRO: PARENTESIS_DIR esperado***");
			}
		}else {
			//ERROR
			this.msg("***ERRO: IDENTIFICADOR, LITERAL_INTEIRO, PARENTESIS_ESQ  esperados***");
		}
		this.msg("Saiu exp(), token: " + this.nextToken());
	}

	
	private void msg(String cadeia) {
		System.out.println(cadeia);
	}

	private void lex() {
		if(this.contador==this.tokenLexemaList.size()) return;
		this.contador++;
	}

	private TokenLexema nextToken() {
		if(this.contador==this.tokenLexemaList.size()) return new TokenLexema(Token.FIM, Token.FIM.getValor()+"");
		return this.tokenLexemaList.get(this.contador);
	}

	@Override
	public String toString() {
		return "AnasinSimples tokenLexemaList = \n" + tokenLexemaList +"\n";
	}

}


