import java.util.Objects;

public class Employee {
    private static int counter = 1;
    private final int id;
    private  String firstName;
    private  String middleName;
    private String lastName;
    private double salary;
    private int departmentNumber;


    public Employee(String firstName, String middleName, String lastName, double salary, int departmentNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.departmentNumber = departmentNumber;
        this.id = counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employees = (Employee) o;
        return Objects.equals(firstName, employees.firstName) && Objects.equals(middleName, employees.middleName) && Objects.equals(lastName, employees.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + middleName + " " + lastName +
                ", ЗП = " + salary +
                ", отдел № " + departmentNumber;
    }
}
