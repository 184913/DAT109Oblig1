package dat109;

public  class Terning {

    /**
     * Triller en terning som returnerer et tall mellom 1 til 6.
     * @Return Tilfeldig tall mellom 1-6
     */
    public static int trill() {

        //Tilfeldig verdi fra 1 til 6
        return (int) (Math.random() * 6) + 1;
    }
}
