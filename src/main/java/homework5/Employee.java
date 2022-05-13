package homework5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println(this.toString());
    }

    public String toString() {
        return String.format("Сотрудник %s (%d лет) занимает должность %s.\nКонтактные данные: тел.%s, e-mail: %s.\nОклад - %d руб.", fio, age, position, phone, email, salary);
    }

    public int getAge() {return age;}

}
