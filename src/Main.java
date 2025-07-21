public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployees();
        printSeparator();
        double sum = employeeBook.findSumSalaryEmployees();
        System.out.println("Общая сумма ЗП: " + sum);
        printSeparator();
        Employee min = employeeBook.findMinSalaryEmployees();
        System.out.println("Минимальная ЗП " + min);
        printSeparator();
        Employee max = employeeBook.findMaxSalaryEmployees();
        System.out.println("Максимальная ЗП " + max);
        printSeparator();
        double average = employeeBook.findAverageSalaryEmployees();
        System.out.printf("Средняя сумма ЗП: %.2f%n", average);
        printSeparator();
        int percent = 10;
        employeeBook.indexSalaryEmployees(percent);
        printSeparator();
        Employee minInDept1 = employeeBook.findMinSalaryInDept(1);
        System.out.println("Минимальная ЗП в отделе 1: " + minInDept1);
        printSeparator();
        Employee maxInDept3 = employeeBook.findMaxSalaryInDept(3);
        System.out.println("Максимальная ЗП в отделе 3: " + maxInDept3);
        printSeparator();
        int deptNumber = 2;
        double samDeptSalaries = employeeBook.findSumSalaryInDept(deptNumber);
        System.out.println("Общие затраты на ЗП в отделе " + deptNumber + ": " + samDeptSalaries);
        printSeparator();
        deptNumber = 3;
        double averageDeptSalaries = employeeBook.findAverageSalaryInDept(deptNumber);
        System.out.println("Средние затраты на ЗП в отделе " + deptNumber + ": " + averageDeptSalaries);
        printSeparator();
        deptNumber = 1;
        percent = 10;
        employeeBook.findIndexSalaryInDept(deptNumber, percent);
        printSeparator();
        deptNumber = 1;
        employeeBook.findAllEmploeeInDept(deptNumber);
        printSeparator();
        double salaryRate = 50000;
        employeeBook.findALowerSalary(salaryRate);
        printSeparator();
        employeeBook.findABiggerSalary(salaryRate);
        printSeparator();
        Employee newEmploee = new Employee("Плашкин", "Сергей", "Леонидович", 50240, 4);
        boolean checkingAddEmployee = employeeBook.addEmployee(newEmploee);
        if (checkingAddEmployee) {
            System.out.println("Сотрудник успешно добавлен");
        } else {
            System.out.println("Сотрудника невозможно добавть, штат полон");
        }
        employeeBook.printAllEmployees();
        printSeparator();
        int id = 10;
        employeeBook.removeEmployeeById(id);
        printSeparator();
        id = 2;
        employeeBook.findEmployeeById(id);
        printSeparator();
    }
    public static void printSeparator() {
        System.out.println("===********===");
    }

}