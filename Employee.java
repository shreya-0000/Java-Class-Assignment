public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Shreya", 50000);
        Employee e2 = new Employee(102, "Diya", 60000);
        e1.display();
        e2.display();
    }
}
