package homework5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Meduim Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Sedov Fedor", "Senior Engineer", "sedov@mail.ru", "89001234567", 70000, 42);
        employees[2] = new Employee("Popov Petr", "Junior Engineer", "petr@mail.ru", "89011234567", 20000, 26);
        employees[3] = new Employee("Pirogov Anton", "Meduim Engineer", "pirog@bk.com", "89021234567", 30000, 35);
        employees[4] = new Employee("Ivanov Maksim", "Senior Engineer", "max@mail.ru", "89031234567", 70000, 41);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println("-----------------------------------------------------------");
                employee.printInfo();
            }
        }
    }
}
