public class Eb {

	private Noeud racine;
	private final int k = 5;

	public Eb() {
		setRacine(new Noeud());
	}

	public Eb(Noeud racine) {
		this.setRacine(new Noeud(racine.getContenu()));
	}

	public Eb(Eb eb) {
		this.setRacine(eb.getRacine());
	}

	public Noeud getRacine() {
		return racine;
	}

	public void setRacine(Noeud racine) {
		this.racine = racine;
	}

	public int getk() {
		return k;
	}

	public Eb EBVide() {
		return new Eb();
	}

	public static boolean estVide(Eb e) {
		if (e.getRacine() == null)
			return true;
		return false;
	}

	public static Eb singleton(char s) {
		Eb res = new Eb();
		res.racine.setContenu(s);
		return res;
	}

	public static Eb disjonction(Eb eb1, Eb eb2) {
		Eb res = new Eb();
		res.racine.setContenu('v');
		res.racine.setNoeudGauche(eb1.getRacine());
		res.racine.setNoeudDroit(eb2.getRacine());
		return res;
	}

	public static Eb conjonction(Eb eb1, Eb eb2) {
		Eb res = new Eb();
		res.racine.setContenu('^');
		res.racine.setNoeudGauche(eb1.getRacine());
		res.racine.setNoeudDroit(eb2.getRacine());
		return res;
	}

	public static Eb negation(Eb eb) {
		Eb res = new Eb();
		res.racine.setContenu('!');
		res.racine.setNoeudDroit(eb.getRacine());
		return res;
	}

	/* méthode d'affichage */
	public String afficher() {
		return afficherRec(racine);
	}

	private String afficherRec(Noeud racine) {
		if (racine == null) {
			return " ";
		}
		if (racine.getContenu() == 'v') {
			return "(" + afficherRec(racine.getNoeudGauche()) + " v " + afficherRec(racine.getNoeudDroit()) + ")";
		} else if (racine.getContenu() == '^') {
			return "(" + afficherRec(racine.getNoeudGauche()) + " ^ " + afficherRec(racine.getNoeudDroit()) + ")";
		} else if (racine.getContenu() == '!') {
			return "!" + afficherRec(racine.getNoeudDroit());
		} else {
			return String.valueOf(racine.getContenu());
		}
	}

	/* méthode d'évaluation */
	public static boolean evaluer(Eb e, boolean[] bVect) throws Exception {

		if (estVide(e)) {
			throw new Exception("expression booleene vide ! ");
		} else {
			return evaluerRec(e.getRacine(), bVect);
		}
	}

	private static boolean evaluerRec(Noeud racine, boolean[] bVect) {

		boolean res = false;

		if (racine.getContenu() == 'v') {
			res = evaluerRec(racine.noeudGauche, bVect) || evaluerRec(racine.noeudDroit, bVect);
			return res;
		} else if (racine.getContenu() == '^') {
			res = evaluerRec(racine.noeudGauche, bVect) && evaluerRec(racine.noeudDroit, bVect);
			return res;
		} else if (racine.getContenu() == '!') {
			res = !evaluerRec(racine.noeudDroit, bVect);
			return res;
		} else if (racine.getContenu() == 'a') {
			return bVect[0];
		} else if (racine.getContenu() == 'b') {
			return bVect[1];
		} else if (racine.getContenu() == 'c') {
			return bVect[2];
		} else if (racine.getContenu() == 'd') {
			return bVect[3];
		} else if (racine.getContenu() == 'e') {
			return bVect[4];
		}
		return res;
	}

}
