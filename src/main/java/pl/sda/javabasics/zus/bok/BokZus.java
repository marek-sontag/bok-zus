package pl.sda.javabasics.zus.bok;

import pl.sda.javabasics.zus.Client;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
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
            lastName = scanner.nextLine();
        }

        System.out.println("Podaj numer PESEL:");
        String pesel = scanner.nextLine();
        while (!PeselUtils.validate(pesel)) {
            System.out.println("Nieprawidłowy format numeru PESEL, wpisz ponownie!");
            pesel = scanner.nextLine();
        }
        System.out.printf("Imię: %s, nazwisko: %s, PESEL: %s\n", name, lastName, pesel);

        Client client = new Client(name, lastName, pesel);

        System.out.println(client);

        Period clientLifespan = Period.between(client.getDateOfBirth(), LocalDate.now());
        if (clientLifespan.getYears() >= 65) {
            System.out.println("Pakuj swojego campera i ruszaj w świat, emerycie!");
        } else {
            long clientDaysTo65 = ChronoUnit.DAYS.between(client.getDateOfBirth(), client.getDateOfBirth().plusYears(65));
            long clientLiefespanDays = ChronoUnit.DAYS.between(client.getDateOfBirth(), LocalDate.now());
            System.out.printf("Oj! jeszcze musisz popracować %d dni!", clientDaysTo65 - clientLiefespanDays);
        }
    }
}
