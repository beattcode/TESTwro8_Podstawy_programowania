import java.util.InputMismatchException;
/* poraz pierwszy musieliśmy wykonać import
    na zajęciach 18.07 będziemy konstruowali własne klasy
    wtedy też omówimy dokładniej składowe klasy oraz pliku i pakietu w której się ona znajduje.
 */
import java.util.Scanner;

/** Trzeci program jaki napisaliśmy wykonaliśmy dlatego
 * aby dowiedzieć się jak pobrać jakiś parametr w czasie życia
 * programu. W tym celu wykorzystaliśmy obiekt klasy Scanner.
 * Program wyświetli:
 *  Witaj w programie
 * Następnie skonstruuje obiekt klasy Scanner przy użyciu parametru System.in
 * System.in mówi nam, że wykorzystujemy referencje do standardowego wejścia, innymi słowy inputu z konsoli
 *
 * Skonstruowany obiekt klasy Scanner zostanie przypisany
 * do zmiennej o nazwie scanner
 * przechowywującej referencję obiektu klasy Scanner
 *
 * Następnie wydrukowany zostanie tekst:
 *  Podaj ciąg znaków
 *
 * Kolejna linia ma na celu przypisanie wyniku metody next
 * wywołanej na wcześniej stworzonym obiekcie klasy Scanner
 *
 * Metoda next w ramach działania poczeka aż wpiszemy w konsoli
 * dowolny tekst i zatwierdzimy go enterem
 *
 * Po wpisaniu i zatwierdzeniu tekstu w konsoli
 * zobaczymy tekst
 *  Podaj pozycję znaku
 *
 * Ponownie będzie wywołana metoda na obiekcie klasy Scanner
 * tym razem jest to metoda nextInt
 *
 * W przypadku gdy wpiszemy w kosoli liczbę i zatwierdzimy ją
 * program przypisze ją do zmiennej index przechowującej wartość typ int
 *
 * Ostatnia linia programu jest stosunkowo złożona.
 * W przypadku jeśli wartość zmiennej index będzie mniejsza niż długość
 * wprowadzonego tekstu na ekranie zobaczymy coś rodzaju:
 *
 * Znak na pozycji 1  to e
 *
 * jeśli wprowadzony tekst był równy Test
 *
 * Jeśli podamy index mniejszy 0 albo większy lub równy długości tekstu
 * otrzymamy wiadomość typu:
 *
 * Znak na pozycji 10  nie istnieje
 *
 * w ciele metody skomentuję to dla większej jasności.
 */
public class ScannerTest {
    /**
     * Metoda w czasie życia programu pobierze 2 parametry
     * Pierwszy tekst przypisze do zmiennej String
     * Drugi int przypisze do zmiennej przechowywującej wartość typu int
     * @param args program nie obsługuje argumentów wejściowych
     * @throws InputMismatchException w przypadku podania drugiego parametru innego niż cyfra
     */
    public static void main(String... args) throws InputMismatchException {
        System.out.println("Witaj w programie");
        Scanner scanner = new Scanner(System.in); // tworzenie obiektu skanera
        System.out.println("Podaj ciąg znaków");
        String string = scanner.next(); // wywołanie metody next - powoduje oczekiwanie na wartość typu String z konsoli
        System.out.println("Podaj pozycję znaku");
        int index = scanner.nextInt(); // wywołanie metody nextInt - oczekuje podania cyfry

        /*
            wyniki scanner.next() oraz scanner.nextInt
            są już przypisane odpowiednio do zmiennych:
            String string;
            int index;

         */

        // na zajęciach oczywiście mieliście prostszą wersję
        // wystarczyło wyświetlić "Znak na pozycji {a} to {b}" gdzie pod {a} podstawiliście index
        // a  pod {b} znak na danej pozycji przy użyciu string.charAt(index)

        // Jako ciekawostkę zostało podane rozwiązanie, które obsługiwało sytuację podania błędnego indeksu
        // Na tym etapie traktujemy to jako wiedzę rozszerzejącą
        // Na zajęciach 18.07 poznamy instrukcje warunkowe
        // Dla ciekawych opisuję zachowanie lini poniżej
        System.out.println("Znak na pozycji {} " // "Znak na pozycji {} " to obiekt klasy String
                .replace("{}", // wywołujemy na nim metodę replace o pierwszym parametrze "{}" klasy String
                        String.valueOf(index)) // oraz drugim równym wynikowi rzutowania index do obiektu klasy String przy pomocy
                                                // metody statycznej String.valueOf(int) - przyjmuje parametr int i
                                                // zamienia go na obiekt klasy String
                + (
                        (string.length() > index && index >= 0) ?  // ta linia powoduje spradzenie warunku
                                //warunek ten brzmi długość tekstu jest większa od indeksu
                                // indeks jest większy lub równy od 0
                            " to " + string.charAt(index)  // konkatenacja " to " oraz znaku na pozycji index w tekście
                                : // w przeciwnym razie " nie istnieje"
                                " nie istnieje"));
    }
}

