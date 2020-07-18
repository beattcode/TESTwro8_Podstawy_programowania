# 1 Przegląd przykładowych testów

1. W repozytorium znajduje się kolejny projekt: lista-e1
2. Proszę otworzyć projekt jako "gradle project"
- File -> New -> Project from Existing Sources
- Wybieramy lokalizację /TESTwro8_Podstawy_programowania/lista-e1/build.gradle
![Wybór projektu](../obrazy/gradle_project.PNG)
- Konfigurujemy auto-import oraz jdk 11
![Wybór projektu](../obrazy/gradle_project2.PNG)
3. W projekcie znajdują się 2 klasy:
- [Converter](../lista-e1/src/main/java/pl/sda/programming/Converter.java)
- [ConverterTest](../lista-e1/src/test/java/pl/sda/programming/ConverterTest.java)
4. Jak widać Converter nie ma żadnej metody uruchomieniowej
5. Proszę otorzyć klasę ConverterTest
6. Można zauważyć tam owy element składniowy "annotation", w tym przypadku jest to @Test
7. Adnotacje wykraczają poza zakres naszych zajęć, musisz tylko wiedzieć, że gdy nad metodą jest adnotacja test, framework JUnit może ją uruchomić
8. Proszę wykonać skrót ctrl+shift+f10 lub przycisnąć na zielony znak koło klasy:

![Wykonanie klasy testowej](../obrazy/wykonanie_testu.PNG)


# 2 Testy do zadań z poprzednich list
1. Skopiuj klasę programu wykonanego wramach listy z operatorów [Kredyt](./B2_operatory.md) do projektu lista-e1
2. Sugeruję utworzenie nowego pakietu "loan"
3. Wydziel logikę programu poza pobieraniem wartości kredytu do osobnych metod
4. Dla ułatwienia uczyń wszystkie metody publicznymi
5. Zaproponuj co możemy przetestować w ramach danej klasy
6. Napisz metody testowe wzorując się na [ConverterTest](../lista-e1/src/test/java/pl/sda/programming/ConverterTest.java)

# 3 Testy dla wybranych klas
1. Wzorując się na tym co zostało wykonane w ramach poprzedniego zadania, zrób kilka klas testowych do innych programów, które napisaliśmy
