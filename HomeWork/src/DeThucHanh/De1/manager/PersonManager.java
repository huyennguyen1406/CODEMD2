package DeThucHanh.De1.manager;

import DeThucHanh.De1.model.Hotel;
import DeThucHanh.De1.model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
    private ArrayList<Person> persons;
    private Scanner scanner = new Scanner(System.in);

    public PersonManager() {
        this.persons = new ArrayList<>();
    }

    public void displayAll() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void createPerson() {
        System.out.println("Nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập số chứng minh nhân dân: ");
        int id = scanner.nextInt();
        System.out.println("Nhập loại phòng: ");
        String kindOfRoom = scanner.nextLine();
        System.out.println("Nhập giá tiền: ");
        double roomRates = scanner.nextDouble();
        System.out.println("Nhập số ngày thuê: ");
        int dateOfHire = scanner.nextInt();
        scanner.nextLine();
        Person person = new Person (name, dateOfBirth, id);
        Hotel room = new Hotel(dateOfHire, kindOfRoom, roomRates);
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public Person deletePerson(int id) {
        Person person = null;
        for (Person p : persons) {
            if (p.getId() == id) {
                person = p;
            }
        }
        int index = persons.indexOf(person);
        return persons.remove(index);
    }

    public void displayPerson(int id) {
        Person person = null;
        for (Person p : persons) {
            if (p.getId() == id) {
                person = p;
            }
        }
        if (person != null) {
            System.out.println("Không có id tương ứng");
        }
    }

    public ArrayList<Person> deletePersonListByName(String name) {
        ArrayList<Person> person = new ArrayList<>();
        for (Person p : persons) {
            if (p.getName().equals(name)) {
                person.add(p);
            }
        }
        persons.removeAll(person);
        return person;
    }
    
    public String displayPriceRoom(int id) {
        Hotel room = null;
        for (Hotel r : rooms) {
            if (r.getKindOfRoom().getId() == id) {
                room = r;
            }
        }

        if (room != null) {
            double roomRates = room.getRoomRates() * room.getDateOfHire();

        }
    }
}
