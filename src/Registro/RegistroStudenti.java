package Registro;


/*
 * Crea una classe RegistroStudenti che rappresenti 
 * un registro di studenti. Utilizza un array privato 
 * per memorizzare oggetti Studente. 
 * Implementa un costruttore senza parametri per 
 * inizializzare il registro vuoto e 
 * un metodo pubblico per aggiungere studenti al registro. 
 * Aggiungi un metodo che stampi la lista degli studenti.
 */


public class RegistroStudenti {

    private Studente[] studenti; // Array per memorizzare gli studenti
    private int numeroStudenti; // Numero di studenti attualmente nel registro

    // Costruttore senza parametri per inizializzare il registro vuoto
    public RegistroStudenti() {
        this.studenti = new Studente[5]; // dimensione di 5 per l'array
        this.numeroStudenti = 0; // valore per preimpostare l'array vuoto all inizio 
                                 //dell esecuzione del metodo aggiungiStudente 
    }

    // Metodo per aggiungere uno studente al registro
    public void aggiungiStudente(Studente nuovoStudente) {
        if (numeroStudenti < studenti.length) { // Verifica se c'è spazio nell'array
            studenti[numeroStudenti] = nuovoStudente; // Aggiunge lo studente all'array
            numeroStudenti++; // Incrementa il numero di studenti nel registro
        } else {
            System.out.println("Impossibile aggiungere lo studente. Il registro è pieno.");
        }
    }

    // Metodo per stampare la lista degli studenti nel registro
    public void stampaRegistro() {
        System.out.println("Lista degli studenti nel registro:");
        for (int i = 0; i < numeroStudenti; i++) {
            System.out.println(studenti[i].datiStudente());
        }
    }
}