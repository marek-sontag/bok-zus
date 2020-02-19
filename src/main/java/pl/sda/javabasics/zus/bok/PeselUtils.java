package pl.sda.javabasics.zus.bok;

import java.time.LocalDate;

public class PeselUtils {

    private PeselUtils() {}

    static boolean validate(String pesel) {
        return pesel != null && pesel.matches("[0-9]{11}");
    }

    public static char readSex(String pesel) {
        if (validate(pesel)) {
            String sexDigitAsString = pesel.substring(9, 10);
            int sexAsNumber = Integer.parseInt(sexDigitAsString);
            return sexAsNumber % 2 == 0 ? 'F' : 'M';
        } else {
            return 0;
        }
    }

    public static LocalDate readDateOfBirth(String pesel) {
        if (!validate(pesel)) {
            return LocalDate.MIN;
        } else {
            String yearAsString = pesel.substring(0, 2);
            String codedMonthAsString = pesel.substring(2, 4);
            String dayAsString = pesel.substring(4, 6);

            int year, month;
            int day = Integer.parseInt(dayAsString);

            int codedMonth = Integer.parseInt((codedMonthAsString));
            if (codedMonth < 20) {
                // years: 1900 - 1999
                year = 1900 + Integer.parseInt(yearAsString);
                month = codedMonth;
            } else {
                // years: 2000 - 2099
                year = 2000 + Integer.parseInt(yearAsString);
                month = codedMonth - 20;
            }
            return LocalDate.of(year, month, day);
        }
    }
}
