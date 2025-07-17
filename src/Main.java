public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployees();
        printSeparator();
        double sum = employeeBook.printSumSalaryEmployees();
        System.out.println("Общая сумма ЗП: " + sum);
        printSeparator();
        Employee min = employeeBook.printMinSalaryEmployees();
        System.out.println("Минимальная ЗП " + min);
        printSeparator();
        Employee max = employeeBook.printMaxSalaryEmployees();
        System.out.println("Максимальная ЗП " + max);
        printSeparator();
        double average = employeeBook.printAverageSalaryEmployees();
        System.out.printf("Средняя сумма ЗП: %.2f%n", average);
        printSeparator();
        employeeBook.indexSalaryEmployees();
        printSeparator();
        Employee minInDept1 = employeeBook.findMinSalaryInDept( 1);
        System.out.println("Минимальная ЗП в отделе 1: " + minInDept1);
        printSeparator();
        Employee maxInDept3 = employeeBook.findMaxSalaryInDept( 3);
        System.out.println("Максимальная ЗП в отделе 3: " + maxInDept3);
        printSeparator();
        int deptNumber = 2;
        double samDeptSalaries = employeeBook.findSumSalaryInDept(deptNumber);
        System.out.println("Общие затраты на ЗП в отделе " + deptNumber + ": " + samDeptSalaries);
        printSeparator();
        deptNumber = 3;
        double averageDeptSalaries = employeeBook.findAverageSalaryInDept( deptNumber);
        System.out.println("Средние затраты на ЗП в отделе " + deptNumber + ": " + averageDeptSalaries);
        printSeparator();
        deptNumber = 1;
        int percent = 10;
        employeeBook.findIndexSalaryInDept(deptNumber, percent);
        printSeparator();
        deptNumber = 1;
        employeeBook.findAllEmploeeInDept(deptNumber);
        printSeparator();
        double salaryRate = 50000;
        employeeBook.findALowerSalary(salaryRate);
        printSeparator();
        employeeBook.findABiggerSalary(salaryRate);



    }
    public static void printSeparator() {
        System.out.println("===********===");
    }
}