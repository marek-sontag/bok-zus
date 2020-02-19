package pl.sda.javabasics.zus.bok;

class PeselUtils {

    private PeselUtils() {}

    static boolean validate(String pesel) {
        return pesel != null && pesel.matches("[0-9]{11}");
    }

}
