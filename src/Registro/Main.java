package Registro;
public class Main {
    public static void main(String[] args) {
        // Creiamo un registro degli studenti
        RegistroStudenti registro = new RegistroStudenti();

        // Creiamo alcuni studenti
        Studente studente1 = new Studente("Mario", "Rossi", 20, "Italia");
        Studente studente2 = new Studente("Anna", "Verdi", 22, "Francia");
        Studente studente3 = new Studente("Luca", "Bianchi", 21, "Germania");
        Studente studente4 = new Studente("Mario", "Rossi", 20, "Italia");
        Studente studente5 = new Studente("Anna", "Verdi", 22, "Francia");
    
        // non e possibile aggiungere uno studente in piu

        // Aggiungiamo gli studenti al registro
        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);
        registro.aggiungiStudente(studente3);
        registro.aggiungiStudente(studente4);
        registro.aggiungiStudente(studente5);
      
       

        // Stampiamo il registro per verificarne il contenuto
        registro.stampaRegistro();
    }
}