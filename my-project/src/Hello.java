/*
    Tak jak i w przypadku SQL pokazuję tu jak wygląda komentarz
    blokowy.
 */
// oraz jak wygląda komentarz liniowy

/**
 *  Klasa Hello była pierwszym programem, który stworzyliśmy
 *  w ramach sesji live coding.
 *  Celowo prezentuję tu inny rodzaj komentarza, którego dodanie
 *  spowoduje, że wykonując skrót ctrl+q zobaczymy go w pop-up
 *  Nazywamy to komentarzem Javadoc. Można go umieścić nad klasą,
 *  metodą lub polem klasy.
 */
public class Hello {
    /**
     * Tu jest przykład komentarza Javadoc nad metodą.
     * Zwykle znajduje się tu opis o zachowaniu metody.
     * W tym przypadku metoda ma na celu wydrukowanie na ekran
     * następujących tekstów:
     *  Witaj w programie!
     *  Witaj w programie!
     *  Witaj w programie!Witaj w programie!
     * Następnie pobierane ustwiane są 2 zmienne:
     *  String name;
     *  String surname;
     * Ostatecznie wynik dziłania programu spowoduje wyświetlenie:
     *  Witaj w programie!
     *  Witaj w programie!
     *  Witaj w programie!Witaj w programie!Tomasz Lis
     *  Tomasz Lis
     *  Koniec!
     * Poniżej można zobaczyć przykład opisu parametru metody:
     * @param args W przypadku programu Hello, argumenty
     *             są pomijane, co kolwiek się znajdzie
     *             w parametrze args nie ma wpływu na działanie
     *             programu
     */
    public static void main(String[] args) {
        // przykłady wywołania metody println
        System.out.println("Witaj w programie!");
        System.out.println("Witaj w programie!");
        // przykładny wywołania metody print
        System.out.print("Witaj w programie!");
        System.out.print("Witaj w programie!");
        /* wszystkie cztery metody powyżej wywoływane są na
            statycznej referencji do strumienia wyjściowego.
             Referencja ta pochodzi z klasy System.
             Metoda println wykona dokładnie to samo co metoda
             print z tą różnicą, że println dodaje znak
             zakończenia lini.
         */
        // W ramach ćwiczenia można wywołać ctrl+1 lub
        // ctrl+lewy przycisk myszy aby przeczytać więcej
        String name = "Tomasz"; // tu jest przykład przypisania zmiennej
        String surname = "Lis"; // tu jest drugi przykład
        /* mały komentarz co do tego z czego składa się przypisanie
             String to klasa
             name i surname to nazwy zmiennych
             "Tomasz" oraz "Lis" to obiekty klasy String
           ostatecznie interpretujemy powyższe linie następująco
           Przypisuję obiekt "Tomasz" do zmiennej referencyjnej name
           Zmienna reprezentuje referencję obiektu klasy String.

           Przypisuję obiekt "Lis" klasy String do zmiennej surname
           reprezentującej wskazanie na obiekt klasy String.
         */
        System.out.println(name + " " + surname); // wypisanie
        System.out.println(name + " " + surname); // wypisanie
        /* obie linie powyżej wykonują konkatenację (złączenie)
            obietów klasy String:
                name - referencja do obiektu "Tomasz"
                " " - obiekt klasy String przechowujący pojedynczą spację
                surname - referencja do obiektu "Lis"
            Wynik tych działań to wydruk
                Tomasz Lis\n
            Gdzie \n oznacza zakończenie lini
         */
        System.out.println("Koniec!");
    }
}
