//Driver class
public class Drive {
    public static void main(String[] args) {
        //name, salary
        Employee e1 = new Employee("Jane", 3500000.00);
        Employee e2 = new Employee("Brandon", 2000000.00);
        Employee e3 = new Employee("Anna", 2500000.00);

        e1.print();
        e2.print();
        e3.print();
    }
}
