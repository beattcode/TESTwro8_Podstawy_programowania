/**
 * Nasz drugi program.
 * Program przyjmuje dokładnie dwa parametry oraz drukuje ich
 * konkatenację rozdzieloną spacją.
 * W przypadku podania ilości argumentów innej niż dwa,
 * program zakończy się błędem mówiącym:
 *      Wymagana ilość argumentów 2
 */
public class SecondProgram {
    /**
     * Metoda drukuje wartości argumentów na pozycji 0 i 1
     * W przypadku innej ilości argumentów kończy się błędem
     * @param args - oczekiwana tablica dokładnie 2 argumentów
     */
    public static void main(String... args) {
        // asercja zadziała tylko gdy program uruchomimy z VM options -ea
        assert args.length == 2 :
                "Wymagana ilość argumentów 2";
        String arg1 = args[0]; // przypisanie pierwszego elementu tablicy do zmiennej arg1 klasy String
        String arg2 = args[1]; // przypisanie drugiego argumentu do zmiennej arg2 klasy String
        String join = arg1.concat(" "); // przykład wywołania metody konkat na zmiennej arg1 klasy String
        /* Wywołanie metody concat na obiekcie klasy string spowoduje utworzenie
            nowego obiektu klasy String z dołączonym członem pobranym wynikającym
            z pierwszego parametru metody.
            W tym przypadku arg1 zawiera referencję do pierwszego argumentu programu
            W wyniku wywołania programu z następującymi parametrami:
                "Tomasz" "Lis"
            do zmiennej join przypisany będzie następujący string:
                "Tomasz "
         */
        System.out.println(join.concat(arg2));
        /* W ostatniej lini wywołujemy złączenie obiektu referencjonowanego przez
            zmienną join z drugim argumentem programu.
            W przypadku uruchomienia programu z parametrami:
                "Tomasz" "Lis"
            wynik złączenia będzie następujący:
                String arg2 = "Lis"; <- wiemy że jeśli "Lis" jest drugim argumentem
                                        to zostanie podstawiony pod arg2
                String join = "Tomasz "; <- wiemy, że taki obiekt przechowuje zmienna join
                "Tomasz Lis" - będzie wynikiem złącznia z arg2
            Taki też tekst będzie wyświetlony na ekranie:
                Tomasz Lis
         */
    }
}
