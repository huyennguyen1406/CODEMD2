package DeThucHanh.De1.main;

import DeThucHanh.De1.manager.PersonManager;
import DeThucHanh.De1.model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Nhập phòng thuê: ");
            System.out.println("2. Hiển thị phòng: ");
            System.out.println("3. Tính tiền thuê phòng: ");
            System.out.println("4. Tìm kiếm thông tin khách hàng: ");
            System.out.println("5. Xóa thông tin");
            System.out.println("0. Exit!");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    personManager.displayAll();
                    break;
                case 2:
                    Person person = personManager.createPerson();
                    personManager.addPerson(person);
                    break;
                case 3:
                    System.out.println("Nhập chứng minh thư khách thuê: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    Person person1 = personManager.deletePerson(idDelete);
                    if (person1 == null) {
                        System.out.println("Không có khách hàng trùng chứng minh nhân dân cần tìm");
                    } else {
                        System.out.println(person1);
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào chứng minh nhân dân bạn muốn: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    personManager.displayPerson(id);
                    break;
                case 5:
                    System.out.println("Nhập tên muốn xóa: ");
                    scanner.nextLine();
                    String nameDelete = scanner.nextLine();
                    ArrayList<Person> arrayList1 = personManager.deletePerson()

            }
        }
        while (choice != 0);
    }
}
