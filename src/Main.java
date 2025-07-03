public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees [0] = new Employee("Иванов", "Иван", "Иванович", 25180, 4);

        employees [1]  = new Employee("Сидоров", "Павел", "Петрович", 70350, 1);

        employees [2] = new Employee("Плашкин", "Андрей", "Леонидович", 48320, 3);
        employees [3] = new Employee("Никитин", "Павел", "Леонидович", 47920, 1);
        employees [4] = new Employee("Сухина", "Светлана", "Леонидовна", 125020, 3);
        employees [5] = new Employee("Степкина", "Анжела", "Павловна", 108320, 3);
        employees [6] = new Employee("Добрышев", "Андрей", "Георгиевич", 43751, 2);
        employees [7] = new Employee("Дроздов", "Сергей", "Анатольевич", 48805, 4);
        employees [8] = new Employee("Зырянова", "Наталья", "Аркадьевна", 56378, 5);
        //employees [9] = new Employee("Плашкин", "Сергей", "Леонидович", 50240, 4);

        ServiceEmployee.printAllEmployees(employees);
        double sum = ServiceEmployee.printSumSalaryEmployees(employees);
        System.out.println("Общая сумма зарплат: " + sum);
        Employee min = ServiceEmployee.printMinSalaryEmployees(employees);
        System.out.println("Минимальная ЗП " + min);
        Employee max = ServiceEmployee.printMaxSalaryEmployees(employees);
        System.out.println("Максимальная ЗП " + max);
        double average = ServiceEmployee.printAverageSalaryEmployees(employees);
        System.out.println("Средняя сумма зарплат: " + average);
    }
}