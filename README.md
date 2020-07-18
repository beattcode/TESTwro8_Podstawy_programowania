# Agenda zajęć:

Poniżej znajduje się agenda zajęć przewidzianych na 12.02.2020
##  1. Java – Wstęp   Zaczniemy od historii programowania i Javy.
   Powiemy sobie trochę o podstawowych pojęciach dotyczących Javy
   dotyczących obiektowości.

##  2. JDK, JRE, JVM
   Wyjaśnimy sobie co oznaczają te skróty i jaka jest ich rola.

   Listę pierwszą zaczniemy po sekcji JVM, JDK, JRE.  
   Proszę wtedy wybrać następujący link:
   [Lista A1](./zadania/A1_Konfiguracja_srodowiska.markdown)

##  3. Pierwszy program
   Naturalną kontynuacją będzie napisanie pierwszego programu i kilku kolejnych :)
   Robimy to w ramach listy:
   [Lista A2](./zadania/A2_Pierwsze_programy.markdown)

##  4. Zmienne i typy danych
   Tak jak i w SQL tak i Javie wyróżniamy typy danych, powiemy sobie o  
   podstawowych/prymitywnych typach danych oraz zdefiniujemy pojęcie zmiennej.

   Po tej sekcji wykonamy ćwiczenia:
   [Lista B1](./zadania/B1_Zmienne_i_typy.md)

## 5. Operatory

   Java jest językiem programowania, zatem jego rolą jest dostarczenie
   pewnej funkcjonlności. Niejednokrotnie wiąże się to z porównaniami lub
   obliczeniami. Do tego służą właśnie operatory.

   Gdy poznamy operatory zprawdzimy naszą wiedzę pracując nad zestawem
   zadań z:
   [Lista B2](./zadania/B2_operatory.md)

## Zadanie domowe

Po operatorach zakończyliśmy zajęcia.
W ramach zadania domowego zachęcam do powtórzenia sobie informacji.
Szczególnie tego czego nauczyliśmy się w ramach live coding.
Dodałem kilka komentarzy do kodu, który tworzyliśmy na zajęciach.
Najlepiej przeglądać klasy w następującej kolejności:
- [Pierwszy program](./my-project/src/Hello.java) - ćwiczyliśmy przypisanie prostych stringów do zmiennych i drukowanie na ekran
- [Drugi program](./my-project/src/SecondProgram.java) - dowiedzieliśmy się jak obsłużyć argumenty programu
- [Trzeci program](./my-project/src/ScannerTest.java) - pokazaliśmy sobie, że możemy pobierać parametry w czasie życia programu
- [Czwarty program](./my-project/src/IntToShort.java) - przećwiczyliśmy rzutowanie
- [Piąty program](./my-project/src/Calculation.java) - wykonaliśmy prostą kalkulację oraz zastosowaliśmy string.replace()

Aby wyrobić sobie wprawę dobrze po prostu pisać.

Dla tych, którzy chcą dobrze przygotować się do kolejnych zajęć
proponuję następujące zadanie domowe:
1. stwórz nową klasę
2. dodaj metodę main do klasy
3. stwórz kilka zmiennych dowolnego typu w metodzie main
4. na zmiennych numerycznych wykonaj kilka operacji przy pomocy
   znanych operatorów
5. Wyniki operacji przypisz do innych zmiennych
6. Jeśli część z utworzonych zmiennych jest innego typu niż numeryczny
    zachęcam to zrobienia konkatenacji i przypisanie do zmiennej String
7. Na zmiennej klasy string wywołaj różne metody np:

   String wynik = twojaZmienna.replace("a", "b");

   String wynik2 = twojaZmienna.charAt(0);

8. Wszystkie zmienne wydrukuj na ekran używając:

   System.out.println()

Jeśli masz jakieś pytania, pisz na slacku. Po pracy postaram się odpowiedzieć.
Jeśli sprawnie posługujesz się gitem łatwiej będzie gdy wykonasz commit i push
zawierające Twój program.


Temat 6. będie pierwszym tematem wykładu teoretycznego w dniu 2.

##  6. Instrukcje warunkowe

   Aby wykorzystać dobrze operatory porównać dobrze znać instrukcje
   warunkowe. Omówimy je najpierw teoretycznie an następnie poćwiczymy w
   ramach:
   [Lista C1](./zadania/C1_Instrukcje_warunkowe.md)

##  7. Iteracje
   Iteracje są bardzo istotną instukcją, ponieważ dają możliwość wykonania operacji dla każdej wartosci w kolekcji.  
   Zaczniemy od omówienia składni i przerobimy jedno lub dwa
   zadania z:
   [Lista C2](./zadania/C2_Iteracje.md)

## 8. Konstrukcja klasy

   Bardzo obszernie omówimy składowe klasy. Ten rozdział wprowadza nas w świat obiektowości.
   Zagadnienia omówione w częsci teoretycznej wykorzystuje się prawie na każdym etapie pracy z językiem Java.  
   Dlatego też w lista zadań odnośnie klas będzie dużo bardziej obszerna:

   [Lista D1](./zadania/D1_Klasy.md)

## Zadania dodatkowe
   Gdy zdążymy przerobić cały materiał spróbujemy napisać kilka unit testów, w ramach:
   [Listy E1](./zadania/E1_lista_dodatkowa.md)