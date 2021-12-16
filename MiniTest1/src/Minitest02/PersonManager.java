package Minitest02;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class PersonManager implements Manager{
    private ArrayList<Person> personArrayList;

    public PersonManager() {
        this.personArrayList = new ArrayList<Person>();
    }

    public PersonManager(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }
    @Override
    public void displayPerson() {
        for (Person person: personArrayList) {
            if (person != null) {
                System.out.println(person);
            }
        }
        System.out.println("-----------");
    }

    @Override
    public void addPerson(Person person) {
        if (findIndex() == personArrayList) {
            person = Arrays.copyOf(person, person * 2);
        }
        person[findIndex()] = person;
        findIndex()++;
        System.out.println("Them thanh cong!");
    }

    @Override
    public int findIndex() {
        return 0;
    }

    @Override
    public void deletePerson() {
        int index = 0;
        Person[] personList = new Person[personList.length];
        for (Person person : personList) {
            if (person != null && !person.getName().equals(name)) {
                personList[index] = person;
                index++;
            }
        }
        personArrayList = personList;
        System.out.println("Xoa thanh cong");
    }

    @Override
    public void editPerson() {

    }

    @Override
    public double sortGpa() {
        ArrayList.sort(personArrayList, new Comparable<personArrayList>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1 != null && o2 != null) {
                    if (o1.getGpa() < o2.getGpa()) {
                        return -1;
                    } else if (o1.getGpa() > o2.getGpa()) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        });
    }

    @Override
    public double sumGpa() {
        return 0;
    }
}
