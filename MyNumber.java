public class MyNumber {
    private double liczba;

    public double getLiczba() {
        return liczba;
    }

    public MyNumber(double liczba) {
        this.liczba = liczba;
    }

    public boolean isOdd(){
        if(liczba%2==0) return true;
        else return false;
    }

    public boolean isEven(){
        if(liczba%2!=0) return true;
        else return false;
    }

    public double sqrt(){
        return Math.sqrt(liczba);
    }

    public double pow(MyNumber x){
        return Math.pow(liczba, x.getLiczba());
    }

    public double add(MyNumber x){
        return liczba+x.getLiczba();
    }

    public double subtract(MyNumber x){
        return liczba-x.getLiczba();
    }

}
