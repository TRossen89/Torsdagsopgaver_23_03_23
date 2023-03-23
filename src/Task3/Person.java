package Task3;

public abstract class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }


    public abstract boolean addCourse(String course);

    @Override
    public String toString() {

        String s = "Name of person: " + getName() + "\n";

        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
