# 1. Nasza pierwsza iteracja (20 min)

Jak wiemy na wejściu metody main mamy wyrażenie String..., argumenty te  
czytamy w metodzie jak każdą inną tablicę.

1. Proszę stworzyć nowy progam
2. Przypomniemy sobie konstrukcje foreach  z części teoretycznej
3. Zaimplementujemy wyświetlaie wszystkich warości z argumentów
  wejściowych
4. Zastanowimy się jak by wyglądało to w przypadku standardowej komendy
  for, while, oraz do while
5. Wydzielimy osobne metody, które wykonają taką samą iterację z wypisaniem
6. Wywołamy wszystkie 4 metody w metodzie main programu

# 2. Suma elementów (20 min)

1. Proszę stworzyć nowy program
2. W nowej klasie proszę dodać metodę statyczną, która przyjmie tablicę
    o typie elementów int
3. Metoda ta powinna posiadać zmienną lokalną np. "result" inicjalnie
 wartościowaną na 0
4. Następnym krokiem będzie iteracja po elementach tablicy
5. Z każdym krokiem iteracji będziemy dodawać wartość elementu do stanu
    "result"
6. Metoda powinna deklarować typ wynikowy: int i zwracać właśnie wartość
    zsumowaną, czyli "result"
7. Proszę stworzyć w metodzie main kilka tablic o wartościach typu int i
 różnej ilości elementów.
8. Dla każdej tablicy proszę wwywołać dla każdej z tablic, wcześniej
   zaimplementowaną metodę


# 3 Ciąg fibonacciego (20 min)
1. Opis zachowania znajdziecie na [wikipedii](https://pl.wikipedia.org/wiki/Ci%C4%85g_Fibonacciego)
2. Proszę przygotować klasę Fibonacci z metodą statyczną generate która dla parametru n wygeneruje ciąg fibonacciego w postaci tablicy n elementowej
3. Dla ułatwienia wstawiam wzór:

![Fibonacci](../obrazy/fibonacci2.PNG)

4. Do implementacji proszę wykorzystać wiedzę o pętlach oraz o tablicach
5. W klasie Fibonacci proszę utworzyć metodę main, która wywoła metodę generate oraz wyświetli wyniki tablicy przy pomocy println


# 4 Choinka (20 min)
1. Proszę przygotować program, który pobierze w dowolny sposób parametr ilości lini
2. Dla ilości lini wykona algorytm, który wydrukuje choinkę o zadanej długości
3. Wygląda to następująco dla wysokości 12:
```
 *
 * * 
 * * *
 * 
 * * 
 * * *
 * * * * 
 * 
 * * 
 * * *
 * * * *
 * * * * *
```
4. Jak łatwo zauważyć z każdą następną linią powstaje więcej gwiazdek aż do 3
5. Z każdą kolejnym segmentem maskymalna ilość gwiazdek w trójkącie rośnie o 1
6. Jak to zrobić?
