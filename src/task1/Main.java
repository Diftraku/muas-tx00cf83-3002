package task1;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus spurgu = new Spurgu();
        opettaja.aterioi();
        opiskelija.aterioi();
        spurgu.aterioi();
    }
}
