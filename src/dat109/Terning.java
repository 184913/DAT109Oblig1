package dat109;

public  class Terning {

    /**
     * Metode for å trille en terning
     */
    public static int trill() {

        //Tilfeldig verdi fra 1 til 6
        return (int) (Math.random() * 6) + 1;
    }
}
