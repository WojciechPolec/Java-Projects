public class Prostokat {
    private double dlugosc, szerokosc;

    double pole(){
        return dlugosc*szerokosc;
    }

    double obwod(){
        return 2*dlugosc+2*szerokosc;
    }

    double przekatna(){
        return Math.sqrt(Math.pow(dlugosc,2)+Math.pow(szerokosc,2));
    }
}
