import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class GenealogyApp {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Smith", Gender.MALE, LocalDate.of(1980, 5, 15), LocalDate.of(2022, 10, 25));
        Person person2 = new Person("Alice", "Johnson", Gender.FEMALE, LocalDate.of(1915, 8, 30), LocalDate.of(2005, 6, 12));
        Person person3 = new Person("Bob", "Brown", Gender.MALE, LocalDate.of(2000, 3, 7), null);
        // ... Создание других людей и установка отношений ...

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        // ... Добавление других людей в список ...

        FamilyTree familyTree = new FamilyTree(people);


        // ... Дополнительные операции с древом и списком людей ...
    }
}

