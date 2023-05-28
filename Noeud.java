public class Noeud {

    protected char contenu;
    protected Noeud noeudGauche;
    protected Noeud noeudDroit;


    public Noeud() {
        contenu = ' ';
        noeudGauche = null;
        noeudDroit = null;
    }

    public Noeud(char _contenu) {
        contenu = _contenu;
        noeudGauche = null;
        noeudDroit = null;
    }

    public Noeud getNoeudGauche() {
        return noeudGauche;
    }
    
    public Noeud getNoeudDroit() {
        return noeudDroit;
    }

    public void setNoeudGauche(Noeud _n) {
    	noeudGauche = _n;
    }
    
    public void setNoeudDroit(Noeud _n) {
    	noeudDroit = _n;
    }

    public void setNoeudGauche(char _o) {
    	noeudGauche = new Noeud(_o);
    }
    
    public void setNoeudDroit(char _o) {
    	noeudDroit = new Noeud(_o);
    }

    public char getContenu() {
        return contenu;
    }

    public void setContenu(char _c) {
        contenu = _c;
    }
    
    public String toString() {
    	return " "+ getContenu();
    }
    
}

