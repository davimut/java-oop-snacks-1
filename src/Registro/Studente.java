package Registro;

public class Studente {

    private String name;
    private String surname;
    private int age;
    private String nazione;

    public Studente(String name, String surname, int age, String nazione) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nazione = nazione;
    }

    public String datiStudente() {
        return name + " " + surname + ", " + age + " anni, " + nazione;
    }
}