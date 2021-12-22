package DeThucHanh.De1.model;

public class Person {
    private String name;
    private String dateOfBirth;
    private int id;

    public Person() {
    }

    public Person(String name, String dateOfBirth, int id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", id=" + id +
                '}';
    }

    public void display() {
        System.out.printf("%-15s", name);
        System.out.printf("%-15s", dateOfBirth);
        System.out.printf("%-15d", id);
        System.out.println();
    }
}
