package TP2;

public class Maison {
	private String type;
    private String adr;
    private int nbchambre;
    private float surface;

    public Maison(String adr, String t, int n) {
        this.adr = adr;
        this.type = t;
        this.nbchambre = n;
    }

    public Maison(String adr, String t, int n, float s) {
        this.adr = adr;
        this.type = t;
        this.nbchambre = n;
        this.surface = s;
    }

    public void setSurface(float s) {
        this.surface = s;
    }

    public float calculPrix(float pmc) {
        return pmc * surface;
    }

    public float calculPrix() {
        return 2100 * surface;
    }

    public String toChaine() {
        return "un " + type + " de " + surface + "m² à  " + adr + " avec " + nbchambre + " chambres";
    }

    public static void main(String[] args) {
        Maison m1 = new Maison("Tunis", "duplex", 4, 210);
        Maison m2 = new Maison("Nabeul", "villa", 5);
        System.out.println(m1.toChaine());
        System.out.println(m2.toChaine());
        m2.setSurface(230);
        System.out.println("Prix de m1 = " + m1.calculPrix(2500));
        System.out.println("Prix de m2 = " + m2.calculPrix());
    }
}
