public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployees();
        employeeBook.printSeparator();
        double sum = employeeBook.findSumSalaryEmployees();
        System.out.println("Общая сумма ЗП: " + sum);
        employeeBook.printSeparator();
        Employee min = employeeBook.findMinSalaryEmployees();
        System.out.println("Минимальная ЗП " + min);
        employeeBook.printSeparator();
        Employee max = employeeBook.findMaxSalaryEmployees();
        System.out.println("Максимальная ЗП " + max);
        employeeBook.printSeparator();
        double average = employeeBook.findAverageSalaryEmployees();
        System.out.printf("Средняя сумма ЗП: %.2f%n", average);
        employeeBook.printSeparator();
        int percent = 10;
        employeeBook.indexSalaryEmployees(percent);
        employeeBook.printSeparator();
        Employee minInDept1 = employeeBook.findMinSalaryInDept(1);
        System.out.println("Минимальная ЗП в отделе 1: " + minInDept1);
        employeeBook.printSeparator();
        Employee maxInDept3 = employeeBook.findMaxSalaryInDept(3);
        System.out.println("Максимальная ЗП в отделе 3: " + maxInDept3);
        employeeBook.printSeparator();
        int deptNumber = 2;
        double samDeptSalaries = employeeBook.findSumSalaryInDept(deptNumber);
        System.out.println("Общие затраты на ЗП в отделе " + deptNumber + ": " + samDeptSalaries);
        employeeBook.printSeparator();
        deptNumber = 3;
        double averageDeptSalaries = employeeBook.findAverageSalaryInDept(deptNumber);
        System.out.println("Средние затраты на ЗП в отделе " + deptNumber + ": " + averageDeptSalaries);
        employeeBook.printSeparator();
        deptNumber = 1;
        percent = 10;
        employeeBook.findIndexSalaryInDept(deptNumber, percent);
        employeeBook.printSeparator();
        deptNumber = 1;
        employeeBook.findAllEmploeeInDept(deptNumber);
        employeeBook.printSeparator();
        double salaryRate = 50000;
        employeeBook.findALowerSalary(salaryRate);
        employeeBook.printSeparator();
        employeeBook.findABiggerSalary(salaryRate);


    }

}