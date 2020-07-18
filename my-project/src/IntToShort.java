import java.util.Scanner;

/**
 * Program 4 był dość prosty miał na celu zbudowanie świadomości co powoduje rzutowanie
 * Tu zachęcam do ćwiczenia w domu.
 */
public class IntToShort {
    public static void main(String... args) {
        /*
            Po raz kolejny skonstruowaliśmy obiekt klasy Scanner
         */
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat(); // miało to na celu pobranie wartości float
        // oczywiście przypisaliśmy pobraną wartość do zmiennej
        short b = (short) a; // wykonaliśmy rzutowanie to typu mniej pojemnego
        // na uwagę zasługuje składania której użyliśmy: (short) ozaczna deklaranie rzutowania do wartości mieszczącej
        // się w short
        long c = b; // następnie zrobiliśmy kilka przykładów do zmiennych bardziej pojemnych
        double d = c;
        double e = a;
        char f = (char) b; // short i char nie są bezpośrednio kompatybilne, konieczne było castowanie


        /*
            następnie wyświetliliśmy wartości
         */
        System.out.println("a= " + a
                + "\n b=" + b
                + "\n c=" + c
                + "\n d=" + d
                + "\n e=" + e
                + "\n f='" + f + "'");
        /* w tym miejscu zachęcam do ciągłych ćwiczeń np:
            dodanie kilka innych rzutowań, zmiany typów których użyliśmy
           Przede wszystkim uruchomienie programu i podanie wartości które mogą być przypadkami brzegowymi.
         */
    }
}
