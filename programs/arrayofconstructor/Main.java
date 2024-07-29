 
 public class Main {
    static class Person {
    public String name;
    public int age;

    public Person(String[] args) {
        name = args[0];
        age = Integer.parseInt(args[1]);
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
    public static void main(String[] args) {
        String[][] personArgs = {
            {"Alice", "30"},
            {"Bob", "25"},
            {"Charlie", "35"}
        };
        Person[] persons = new Person[personArgs.length];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(personArgs[i]);
        }
        for (Person person : persons) {
            person.display();
        }
    }
}
