package aufgabe0;

public class Main {
    public static void main(String[] args) {

        Job maler=new Job();
        String aufgabeMaler=maler.kunstErstellen("Ich male ein Bild!");
        System.out.println(aufgabeMaler);

        Job sanger=new Job();
        String aufgabeSanger= sanger.kunstErstellen("Ich singe einen Song!");
        System.out.println(aufgabeSanger);

    }
}






/* Aufgabe 0 (Basics)
 * Erstellen Sie die abstrakte Klasse "Künstler" mit einer abstrakten Methode "kunstErstellen()".
 *
 * Im Main erzeugen Sie zwei Objekte vom Typ Künstler, wobei Sie die kunstErstellen()-Methode überschreiben.
 * Ein Maler soll auf der Konsole "Ich male ein Bild" und ein Sänger soll "Ich singe einen Song" ausgeben.
 * Rufen Sie in der Main für beide Objekte die Methode auf.
 */