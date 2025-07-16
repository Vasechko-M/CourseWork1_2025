public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees [0] = new Employee("Иванов", "Иван", "Иванович", 25180, 4);

        employees [1]  = new Employee("Сидоров", "Павел", "Петрович", 70350, 1);

        employees [2] = new Employee("Плашкин", "Андрей", "Леонидович", 48320, 3);
        employees [3] = new Employee("Никитин", "Павел", "Леонидович", 47920, 1);
        employees [4] = new Employee("Сухина", "Светлана", "Леонидовна", 125020, 3);
        employees [5] = new Employee("Степкина", "Анжела", "Павловна", 108320, 2);
        employees [6] = new Employee("Добрышев", "Андрей", "Георгиевич", 43751, 2);
        employees [7] = new Employee("Дроздов", "Сергей", "Анатольевич", 48805, 1);
        employees [8] = new Employee("Зырянова", "Наталья", "Аркадьевна", 56378, 5);
        //employees [9] = new Employee("Плашкин", "Сергей", "Леонидович", 50240, 4);

        ServiceEmployee.printAllEmployees(employees);
        printSeparator();
        double sum = ServiceEmployee.printSumSalaryEmployees(employees);
        System.out.println("Общая сумма ЗП: " + sum);
        printSeparator();
        Employee min = ServiceEmployee.printMinSalaryEmployees(employees);
        System.out.println("Минимальная ЗП " + min);
        printSeparator();
        Employee max = ServiceEmployee.printMaxSalaryEmployees(employees);
        System.out.println("Максимальная ЗП " + max);
        printSeparator();
        double average = ServiceEmployee.printAverageSalaryEmployees(employees);
        System.out.printf("Средняя сумма ЗП: %.2f%n", average);
        printSeparator();
        ServiceEmployee.indexSalaryEmployees(employees);
        printSeparator();
        Employee minInDept1 = ServiceEmployee.findMinSalaryInDept(employees, 1);
        System.out.println("Минимальная ЗП в отделе 1: " + minInDept1);
        printSeparator();
        Employee maxInDept3 = ServiceEmployee.findMaxSalaryInDept(employees, 3);
        System.out.println("Максимальная ЗП в отделе 3: " + maxInDept3);
        printSeparator();
        int deptNumber = 2;
        double samDeptSalaries = ServiceEmployee.findSumSalaryInDept(employees, deptNumber);
        System.out.println("Общие затраты на ЗП в отделе " + deptNumber + ": " + samDeptSalaries);
        printSeparator();
        deptNumber = 3;
        double averageDeptSalaries = ServiceEmployee.findAverageSalaryInDept(employees, deptNumber);
        System.out.println("Средние затраты на ЗП в отделе " + deptNumber + ": " + averageDeptSalaries);
        printSeparator();
        deptNumber = 1;
        int percent = 10;
        ServiceEmployee.findIndexSalaryInDept(employees, deptNumber, percent);
        printSeparator();
        deptNumber = 1;
        ServiceEmployee.findAllEmploeeInDept(employees, deptNumber);



    }
    public static void printSeparator() {
        System.out.println("===********===");
    }
}