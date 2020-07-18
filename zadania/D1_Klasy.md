# 1 Klasa Human (10 min)
1. Utwórz, klasę i nazwij ją Human
2. Dodaj do klasy kilka pól, proszę aby każde z Was zrobiło przynajmniej pola:
   - id
   - name
   - surname
   - personalIdentityNumber
3. Określ typy, którymi najlepiej zaprezentować powyższe dane
4. Proszę aby wszystkie pola były prywatne
5. Id - powinno być polem finalnym
6. Proszę dodać konstruktor inicjalizujący wszystkie wymagane pola
7. Proszę dodać gettery i settery do pól, które mogą się zmieniać
8. Proszę stworzyć bezparametryczną metodę toString zwracającą string składający się z konkatenacji wszystkich pól klasy

# 2 Test Human (5 min)
1. W pakiecie test proszę utworzyć klasę Test, która będzie posiadała metodę main
2. Proszę utworzyć metodę testHuman i wywołać ją w metodzie main
3. W metodzie testHuman proszę utworzyć obiekt klasy Human
4. Proszę wykorzystać settery parametrów name, suurname, personalIdentityNumber
5. Proszę wyświetlić obiekt klasy Human przy pomocy System.out.println()
6. Proszę stworzyć metodę main i wywołać metodę  testHuman w metodzie main

# 3 Klasa IdentificationDocument (15 min)
1. W tym samym pakiecie proszę stworzyć klasę IdentificationDocument
2. Proszę dodać następujące pola do klasy:
   - type (dla chętnych proponuję aby był to enum)
   - number - zaproponuj typ i uargumentuj wybór
   - issueDate - Proponuję zastosować klasę LocalDate z pakietu java.time
   - expirationDate - proponuję użyć klasę LocalDate z pakietu java.time
3. Jakie znasz typy dokumentów?
4. Są takie doumenty, których numer składa się z serii oraz numeru, przykładem takiego dokumentu jest dowód tożsamości lub paszport.
Utwóżmy 2 rozszerzenia klasy Identification document: Passport oraz IdCard
5. IdCart powinien mieć dodatkowe pole:
   - series
6. Passport powinien mieć dwa pola dodatkowe:
   - series
   - biometric (flaga typu boolean)
7. Do każdej z klas dodaj gettery settery oraz metodę toString
8. Do klasy Human proszę dodać listę (java.util.List) dokumentów

# 4 Test IdentificationDocument (10 mi)
1. We wcześniej utworzonej klasie test proszę dodać metodę testPassport
2. W metodzie test passport proszę utworzyć paszport z wszystkimi możliwymi polami
3. Proszę wyświetlić utworzony paszport
4. Proszę stworzyć metodę testIdCard
5. W metodzie testIdCard proszę utworzyć obiekt klasy IdCard i wyświetlić przy pomocy System.out.println
6. W klasie Test proszę utworzyć metodę, która utworzy inny dokument identifikacyjny, np. Prawo jazdy przy użyciu klasy głównej IdentificationDocument
7. Proszę dodać wywyłanie wszystkich tych metod do metody main

# 5 Klasa pracownik (5 min)
1. Proszę dodać klasę praconik (Employee), która będzie dziedziczyła po klasie Human.
2. Proszę dodać pola, które rozszerzają dziedziczoną klasę:
   - systemId - id pracownika w systemie
   - role - może być to nazwa, może być to enum dla chętnych
3. Proszę dodać gettery i settery do nowych pól. Proszę dodać metodę toString
4. Proszę dodać

# 6 Employee Test (5 min)
2. W klasie Test proszę dodać metodę testEmployee
3. W metodzie testEmployee proszę utworzyć obiekt pracownika
4. Na obiekcie pracownika proszę ustawić imię, nazwisko, personalIdentificationNumber, systemId, role
5. Proszę utworzyć obiekt dokumentu tożsamości o typie IdCard oraz dodać do dokumentów identyfikacyjnych pracownika
6. Proszę wyświetlić pracownika
7. Proszę dodać metodę testEmployee do metody main klasy Test

# 7 Klasa deparatament (10 min)
1. Utwórz klasę Department
2. Klasa powinna przechowywać pola:
   - nazwa
3. Proszę dodać gettery settery oraz metodę toString

# 6 Referencja departamentu do pracowników (10 min)
1. Departament ma jednego szefa proszę dodać referencję boss do klasy pracownik
2. Departament może mieć wielu pracowników, zwykle używmy do tego celu kolekcji.
    Są to rozszerzenia klasy java.util.Collection. Proponuję użycie java.util.List w implementacji ArrayList.
3. Proszę dodać metodę addDepartment, która będzie przyjmowała parametr departmentName, tworzyła obiekt departamentu i przypisywała obiekt do listy departamentów
4. Proszę dodać do metody toString szefa oraz listy pracowników

# 7 Wprowadzenie klasy Company (10 min)
1. Proszę dodać klasę Company, która będzie reprezentowała firmę
2. Firma składa się z departamentów oraz nazwy. Proszę dodać adekwatne pola, gettery, settery oraz toString.
3. Proszę dodać metodę createDepartment z parametrem name.
4. Proszę aby metoda tworzyła obiekt departament.

# 8 Test Company (10 min)
1. Proszę dodać metodę testCompany
2. Proszę w ciele metody testCompany utworzyć obiekt Company
3. Metoda test company powinna stworzyć obiekt company oraz wywołać na obiekcie metodę add department
4. Nstępnie metoda test company powinna wyświetlić firmę na ekranie oraz przypisać pole statyczne do klasy Test z referencją do Company
5. Proszę dodać metodę testCompany do metodyMain klasy Test

# 9 Metoda dodająca pracownika (15 min)
1. Proszę dodać metodę findDepartment przyjmującą paraemetr department name i zwracającą z listy departament, który ma taką nazwę
2. Dla podpowiedzi List implementuje Iterable co pozwala na następujący for:
   ```for (Object object : listOfObjects) {  }```
3. Proszę przygotować metodę addEmployee, która przyjmie parametry departmentName, employee
4. Metoda addEmployee powinna wykorzystać departmentName do wyszukania departamentu metodą findDepartment
5. Metoda addEmployee powinna dodać pracownika do listy pracowników departamentu


# 10 metoda test add employee (5 min)
1. W klasie Test proszę przygotować metodę testAddEmployee
2. W ciele tej metody proszę stworzyć obiekt klasy employee podając maksymalnie dużo danych o pracowniku
3. Proszę wywołać metodę addEmployee na klasie Company z parametrami nazwa departamentu i nowo utworzonym obiekcie Employee
4. Proszę dodać metoę testAddEmployee do metody main klasy Test

# 11 Metoda add boss to department (5 min)
1. W klasie Company proszę utworzyć metodę addBoss przyjmującą nazwę departamentu i obiekt klasy employee
2. W metodzie proszę znaeleźć departament używając metody findDepartment i ustawić pole boss obiektem employee z parametru

# 12 Test add boss (5 min)
1. W Klasie Test proszę przygotować metodę testAddBoss
2. W ciele metody proszę utworzyć pracownika z rolą boss
3. Proszę wywołać metodę Companny addBoss z nazwą departamentu i nowo utworzonym obiektem employee
4. Proszę wywołać metodę testAddBoss w metodzie main klasy Test