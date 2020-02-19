package pl.sda.javabasics.zus.bok;

import java.util.Scanner;

public class BokZus {

    private static final String WELCOME_MESSAGE =
            "$$\\      $$\\ $$\\   $$\\                               $$\\                               $$\\       $$\\       $$\\ $$\\                               $$\\                 $$$$$$$$\\ $$\\   $$\\  $$$$$$\\  $$\\ \n" +
                    "$$ | $\\  $$ |\\__|  $$ |                              $$ |                              \\__|      $$ |      $$ |\\__|                              \\__|                \\____$$  |$$ |  $$ |$$  __$$\\ $$ |\n" +
                    "$$ |$$$\\ $$ |$$\\ $$$$$$\\    $$$$$$\\  $$\\        $$$$$$$ | $$$$$$\\   $$$$$$\\   $$$$$$\\  $$\\       $$ |  $$\\ $$ |$$\\  $$$$$$\\  $$$$$$$\\   $$$$$$$\\ $$\\  $$$$$$\\            $$  / $$ |  $$ |$$ /  \\__|$$ |\n" +
                    "$$ $$ $$\\$$ |$$ |\\_$$  _|   \\____$$\\ \\__|      $$  __$$ |$$  __$$\\ $$  __$$\\ $$  __$$\\ $$ |      $$ | $$  |$$ |$$ |$$  __$$\\ $$  __$$\\ $$  _____|$$ |$$  __$$\\          $$  /  $$ |  $$ |\\$$$$$$\\  $$ |\n" +
                    "$$$$  _$$$$ |$$ |  $$ |     $$$$$$$ |$$\\       $$ /  $$ |$$ |  \\__|$$ /  $$ |$$ /  $$ |$$ |      $$$$$$  / $$ |$$ |$$$$$$$$ |$$ |  $$ |$$ /      $$ |$$$$$$$$ |        $$  /   $$ |  $$ | \\____$$\\ \\__|\n" +
                    "$$$  / \\$$$ |$$ |  $$ |$$\\ $$  __$$ |$$ |      $$ |  $$ |$$ |      $$ |  $$ |$$ |  $$ |$$ |      $$  _$$<  $$ |$$ |$$   ____|$$ |  $$ |$$ |      $$ |$$   ____|       $$  /    $$ |  $$ |$$\\   $$ |    \n" +
                    "$$  /   \\$$ |$$ |  \\$$$$  |\\$$$$$$$ |$$ |      \\$$$$$$$ |$$ |      \\$$$$$$  |\\$$$$$$$ |$$ |      $$ | \\$$\\ $$ |$$ |\\$$$$$$$\\ $$ |  $$ |\\$$$$$$$\\ $$ |\\$$$$$$$\\       $$$$$$$$\\ \\$$$$$$  |\\$$$$$$  |$$\\ \n" +
                    "\\__/     \\__|\\__|   \\____/  \\_______|$$ |       \\_______|\\__|       \\______/  \\____$$ |\\__|      \\__|  \\__|\\__|\\__| \\_______|\\__|  \\__| \\_______|\\__| \\_______|      \\________| \\______/  \\______/ \\__|\n" +
                    "                               $$\\   $$ |                                    $$\\   $$ |                                                                                                                \n" +
                    "                               \\$$$$$$  |                                    \\$$$$$$  |                                                                                                                \n" +
                    "                                \\______/                                      \\______/                                                                                                                 ";

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Podaj imię:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (!NameValidator.validateName(name)) {
            System.out.println("Nieprawidłowy format imienia, wpisz ponownie!");
            name = scanner.nextLine();
        }

        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        while (!NameValidator.validateLastName(lastName)) {
            System.out.println("Nieprawidłowy format nazwiska, wpisz ponownie!");
            name = scanner.nextLine();
        }

        System.out.println("Podaj numer PESEL:");
        String pesel = scanner.nextLine();

        System.out.printf("Imię: %s, nazwisko: %s, PESEL: %s", name, lastName, pesel);
    }
}
