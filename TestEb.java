package eb;

public class TestEb {

	public static void main(String[] args) {

		
		Eb e1 = Eb.negation(Eb.singleton('a'));
		Eb e2 = Eb.conjonction(Eb.singleton('b'),  Eb.singleton('c'));
		Eb e3 = Eb.negation(Eb.singleton('c'));
		
		Eb e4 = Eb.disjonction(e1, e2);
		Eb e = Eb.conjonction(e4, e3);
		
		Eb e5 = Eb.singleton('a');
		Eb e6 = Eb.negation(Eb.singleton('d'));
		Eb d = Eb.disjonction(e5,e6);
		
		 boolean [] bVect = new boolean [5];
			
			bVect[0]=true;
			bVect[1]=true;
			bVect[2]=true;
			bVect[2]=true;
			bVect[2]=true;
		
		boolean [] bVect2 = new boolean [2];
			
			bVect2[0]=true;
			bVect2[1]=true;
		
		
			System.out.println("Eb e1 : " + e1.afficher());
			System.out.println("Eb e2 : " + e2.afficher());
			System.out.println("Eb e3 : " + e3.afficher());
			System.out.println("Eb e4 : " + e4.afficher());
			System.out.println("Eb e : " + e.afficher());
			
			System.out.println("********************************" );
			System.out.println("Eb e5 : " + e5.afficher());
			System.out.println("Eb e6 : " + e6.afficher());
			System.out.println("Eb d : " + d.afficher());
			
			
			try {   
				
				System.out.println("Résultat de l'évaluation de E : " + Eb.evaluer(e, bVect));
				System.out.println("Résultat de l'évaluation de D : " + Eb.evaluer(d, bVect2));

		   
			
			} catch(Exception ex){
				ex.printStackTrace();
			}
	}
}
