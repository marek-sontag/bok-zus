package pl.sda.javabasics.zus.bok;

class NameValidator {

    private static final String PL_CHARACTERS = "[a-zA-ZąćęłńóźżĄĘĆŁŃÓŹŻ]";

    private NameValidator() {}

    static boolean validateName(String name) {
        return name != null && name.matches(PL_CHARACTERS + "+");
    }

    static boolean validateLastName(String lastName) {
        return lastName != null && lastName.matches(PL_CHARACTERS + "+-?" + PL_CHARACTERS + "*");
    }
}
