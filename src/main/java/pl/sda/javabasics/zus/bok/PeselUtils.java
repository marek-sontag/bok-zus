package pl.sda.javabasics.zus.bok;

class PeselUtils {

    static boolean validate(String pesel) {
        return pesel.matches("[0-9]{11}");
    }

}
