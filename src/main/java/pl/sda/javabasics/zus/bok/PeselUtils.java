package pl.sda.javabasics.zus.bok;

class PeselUtils {

    private PeselUtils() {}

    static boolean validate(String pesel) {
        return pesel != null && pesel.matches("[0-9]{11}");
    }

    static char readSex(String pesel) {
        if (validate(pesel)) {
            String sexDigitAsString = pesel.substring(9, 10);
            int sexAsNumber = Integer.parseInt(sexDigitAsString);
            return sexAsNumber % 2 == 0 ? 'F' : 'M';
        } else {
            return 0;
        }
    }
}
