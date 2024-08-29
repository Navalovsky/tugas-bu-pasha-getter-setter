// Employee class
public class Employee {
    // Atribut
    private String name;
    private double salary;

    // Konstruktor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Metode untuk menampilkan informasi
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}