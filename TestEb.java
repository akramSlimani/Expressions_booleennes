
public class TestEb {

	public static void main(String[] args) {

		/*Noeud n1 = new Noeud ('^');
		Noeud n2 = new Noeud ('v');
		Noeud n3 = new Noeud ('!');
		Noeud a = new Noeud ('a');
		Noeud b = new Noeud ('b');
		Noeud c = new Noeud ('c');
		Noeud d = new Noeud ('d');
		Noeud e = new Noeud ('e');*/
		
		/*Exemple 1*/
		/*Eb e1 = Eb.singleton('a');
		Eb e2 = Eb.negation(Eb.singleton('c'));
		Eb e3 = Eb.disjonction(e1, e2);*/
	
		/*Exemple 2*/
		/*Eb e1 = new Eb();
		Eb e2 = new Eb();
		Eb e3 = new Eb();
		e1= Eb.disjonction(Eb.negation(Eb.singleton('a')),  Eb.conjonction(  Eb.singleton('b'), Eb.singleton('c')   )    );
		e2= Eb.negation(Eb.singleton('c'));
		
		e3 = Eb.conjonction(e1,e2);*/
		
		
		/*Exemple 3*/
		Eb e1 = Eb.negation(Eb.singleton('a'));
		Eb e2 = Eb.disjonction(Eb.singleton('b'),  Eb.negation(Eb.singleton('c')));
		Eb e3 = Eb.conjonction(Eb.singleton('a'),  Eb.singleton('c'));
		
		Eb e4 = Eb.disjonction(e1, Eb.disjonction(e2, e3));
		
		 boolean [] bVect = new boolean [3];
			
			bVect[0]=true;
			bVect[1]=false;
			bVect[2]=false;
		
	   
			System.out.println("Eb e1 : " + e1.afficher());
			System.out.println("Eb e2 : " + e2.afficher());
			System.out.println("Eb e3 : " + e3.afficher());
			System.out.println("Eb e4 : " + e4.afficher());
			
			try {   
				
				System.out.println("Résultat de l'évaluation de e4 : " + Eb.evaluer(e4, bVect));
		   
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
}

