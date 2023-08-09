import java.util.ArrayList;
import java.util.List;

class FamilyTree {
    private List<Person> people;

    public FamilyTree(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public List<Relationship> getAllRelationships() {
        List<Relationship> allRelationships = new ArrayList<>();
        for (Person person : people) {
            collectRelationships(person, allRelationships);
        }
        return allRelationships;
    }

    private void collectRelationships(Person person, List<Relationship> relationships) {
        relationships.addAll(person.getRelationships());
        for (Person child : person.getChildren()) {
            collectRelationships(child, relationships);
        }
    }
}
