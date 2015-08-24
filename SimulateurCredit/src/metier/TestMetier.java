package metier;

public class TestMetier {
	
	public static void main(String[] args) {
		//test du simulateur 2
		CreditMetier metier = new CreditMetier();
		double m = metier.calculMensualite(200000, 240, 4.5);
		System.out.println(m);
	}

}
