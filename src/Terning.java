public class Terning {

    private int verdi;

    //Triller terning
    public int trill() {
        verdi = (int) (Math.random() * 6) - 1); //Tilfeldig verdi fra 1 til 6
        return verdi;
    }
}
