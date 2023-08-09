class Relationship {
    private Person person1;
    private RelationshipType type;

    public Relationship(Person person1, RelationshipType type) {
        this.person1 = person1;
        this.type = type;
    }

    public Person getPerson1() {
        return person1;
    }

    public RelationshipType getType() {
        return type;
    }
}
