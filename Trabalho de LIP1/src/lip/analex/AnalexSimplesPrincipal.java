package lip.analex;

public class AnalexSimplesPrincipal {

	public static void main(String[] args) {
		String exp ;
		//exp = "x = ((soma2 + 3.4)) ** (fator1 / 2)";
		exp = "y = 5 * mult1 + mult2) ** 2.3";
		//exp = "y = 5.5 *(mult1 + mult2) ** 2";
		AnalexSimples analexSimples = new AnalexSimples(exp);
		analexSimples.analex();
		System.out.println(analexSimples);
	}



}
