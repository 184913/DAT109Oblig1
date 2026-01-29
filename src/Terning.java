public class Terning {

    private int verdi;

    //Triller terning
    public int trill() {
        //Tilfeldig verdi fra 1 til 6
        verdi = (int) (Math.random() * 6) - 1;
        return verdi;
    }


}
