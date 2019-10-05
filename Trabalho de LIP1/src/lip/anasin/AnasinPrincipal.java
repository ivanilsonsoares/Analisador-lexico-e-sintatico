package lip.anasin;

public class AnasinPrincipal {
	public static void main(String[] args) {
		String exp;
		//exp = "y = 6 *(mult1 + mult2) ** 2.5";
		//exp = "y = a + 2";
		exp = "{ x = 5.2 / (divi1 ** 10); y = a + 2 }";
		AnasinSimples anasin = new AnasinSimples(exp);
		anasin.anasint();


	}
}


 