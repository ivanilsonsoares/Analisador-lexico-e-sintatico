package lip.analex;

public enum Token {
	
	PARENTESIS_ESQ('('),
	PARENTESIS_DIR(')'),
	OPERADOR_SOMA('+'),
	OPERADOR_MULT('*'),
	OPERADOR_EXP('*'),
	OPERADOR_DIVI('/'),
	OPERADOR_SUBT('-'),
	OPERADOR_ATRIB('='),
	PONTO_VIRGULA(';'),
	PONTO_FLUTUANTE('.'),
	BEGIN('{'),
	END('}'),
	FIM('F'),
	
	IDENTIFICADOR('I'),
	LITERAL_INTEIRO('L');
	
	
	private char valor;
	
	Token(char valor) {
		this.valor = valor;
	}
	
	public char getValor() {
		return this.valor;
	}

}
