public class Table {
    private float longeur;
    private float largeur;
    private String etat;
    private String couleur;

    public float getLargeur() {
        return largeur;
    }

    public float getLongeur() {
        return longeur;
    }

    public String getEtat() {
        return etat;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setLongeur(float longeur) {
        this.longeur = longeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    private float getSurface(){
        return longeur * largeur;
    }

}
