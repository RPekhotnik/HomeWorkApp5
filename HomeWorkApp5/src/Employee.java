public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public void employeePrint() {
        System.out.println("name = " + this.name + "\n"
                + "position = " + this.position + "\n"
                + "email = " + this.email + "\n"
                + "salary = " + this.salary + "\n"
                + "age = " + this.age);
    }
}




