import java.util.Scanner;

/**
 * Na sam koniec zastosowaliśmy prosty operator arytmetyczny
 * Było to odejmowanie (-)
 */
public class Calculation {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat(); // pobraliśmy zmienną typu float
        short b = (short) a; // wykonaliśmy rzutowanie do mniej pojemnego typu
        double c = a - b; // różnicę wartości przypisaliśmy do nowej zmiennej
        String aString = String.valueOf(a); // konwertowaliśmy float na String
        String bString = String.valueOf(b); // short na string
        String cString = String.valueOf(c); // oraz wynik przypisany do double na String
        String message = "Wynik %a - %b = %c" // przećwiczyliśmy ponownie metodę replace
                .replace("%a", aString) // wywołaliśmy zamianę %a na String referencjonowany przez zmienną aString
                .replace("%b", bString) // wywołaliśmy zamianę %b na String referencjonowany przez zmienną bString
                .replace("%c", cString); // wywołaliśmy zamianę %c na String referencjonowany przez zmienną cString
        // następnie wyświetliliśmy wartość zmiennej message powstałej w wyniku tych kilku replace
        System.out.println(message);
        /*
            Celem programu było zatem wykonanie różnicy na wartości pobranej i zrzutowanej do mniej pojemnego typu.
            Ponadto przypomnieliśmy sobie wywoływanie metod na obiekcie klasy String
         */
    }
}
