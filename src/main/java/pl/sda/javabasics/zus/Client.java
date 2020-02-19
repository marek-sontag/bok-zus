package pl.sda.javabasics.zus;

import pl.sda.javabasics.zus.bok.PeselUtils;

import java.time.LocalDate;

public class Client {

    private String name;
    private String lastName;
    private String pesel;
    private char sex;
    private LocalDate dateOfBirth;

    public Client(String name, String lastName, String pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.sex = PeselUtils.readSex(pesel);
        this.dateOfBirth = PeselUtils.readDateOfBirth(pesel);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
