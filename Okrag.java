public class Okrag {
    private Punkt punkt;
    private int promien;

    public Okrag(){
        this.punkt = new Punkt(0,0);
        this.promien = 0;
    }

    public Okrag(Punkt punkt, int promien) {
        this.punkt = punkt;
        this.promien = promien;
    }

    public int getPromien() {
        return promien;
    }

    public double getPowierzchnia(){
        return Math.PI*Math.pow(promien, 2);
    }

    public double getSrednica(){
        return 2*promien;
    }

    public boolean wSrodku(Punkt p){
        double d= Math.sqrt(Math.pow(p.getX() - punkt.getX() ,2)+Math.pow(p.getY() - punkt.getY() ,2));
        if(d<=getSrednica()) return true;
        else return false;
    }
}
