public class EmployeeBook {
    private Employee[] employees;
    public EmployeeBook(){
        this.employees = new Employee[10];
        initializeEmployees();
    }
    private void initializeEmployees(){
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
        }


    public void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public double printSumSalaryEmployees() {
        if (employees == null || employees.length == 0) {
            return 0.0;
        }
        double totalSalary = 0;
        for (Employee e : employees) {
            if (e != null) {
                totalSalary = totalSalary + e.getSalary();
            }
        }
        return totalSalary;

    }

    public Employee printMinSalaryEmployees() {
        if (employees == null || employees.length == 0) {
            return null;
        }
        Employee minSalaryEmployee = employees[0];
        double minSalary = employees[0].getSalary();

        for (Employee e : employees) {
            if (e != null && e.getSalary() < minSalary) {
                minSalary = e.getSalary();
                minSalaryEmployee = e;
            }
        }
        return minSalaryEmployee;
    }

    public Employee printMaxSalaryEmployees() {
        if (employees == null || employees.length == 0) {
            return null;
        }
        Employee maxSalaryEmployee = employees[0];
        double maxSalary = employees[0].getSalary();

        for (Employee e : employees) {
            if (e != null && e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                maxSalaryEmployee = e;
            }
        }
        return maxSalaryEmployee;
    }

    public double printAverageSalaryEmployees() {
        if (employees == null || employees.length == 0) {
            return 0.0;
        }
        double totalSalary = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {
                totalSalary = totalSalary + e.getSalary();
                count++;
            }
        }
        return count > 0 ? totalSalary / count : 0.0; //считает только заполненные элементы массива
    }

    public void indexSalaryEmployees() { //индексирование в течении года
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
                double total = e.getSalary();
                for (int i = 1; i < 12; i++) {
                    total = total + total * 0.01;
                    System.out.printf("Год работы в компании - %d. Итого с учетом индексации %.2f%n", i, total);
                }

            }
        }
    }

    public Employee findMinSalaryInDept(int departmentNumber) {
        Employee minEmployee = null;
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == departmentNumber) {
                if (minEmployee == null || e.getSalary() < minEmployee.getSalary()) {
                    minEmployee = e;
                }
            }
        }
        return minEmployee;
    }

    public Employee findMaxSalaryInDept(int departmentNumber) {
        Employee maxEmployee = null;
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == departmentNumber) {
                if (maxEmployee == null || e.getSalary() > maxEmployee.getSalary()) {
                    maxEmployee = e;
                }
            }
        }
        return maxEmployee;
    }

    public double findSumSalaryInDept(int departmentNumber) {
        double sumSalary = 0.0;
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == departmentNumber) {
                sumSalary += e.getSalary();
            }
        }
        return sumSalary;
    }
    public double findAverageSalaryInDept(int departmentNumber) {
        double sumSalary = 0.0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == departmentNumber) {
                sumSalary += e.getSalary();
                count ++;
            }
        }
        return count > 0 ? sumSalary / count : 0.0;
    }
    public void findIndexSalaryInDept(int deptNumber, double percent) {
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == deptNumber) {
                double oldSalary = e.getSalary();
                double newSalary = oldSalary + (oldSalary * percent / 100);
                e.setSalary(newSalary);
                System.out.println("ЗП у сотрудника " + e + " после индексации: " + newSalary);
            }
        }
    }

    public void findAllEmploeeInDept(int deptNumber) {
        System.out.println("Сотрудники отдела " + deptNumber + ": ");
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == deptNumber) {
                System.out.println(e.getId() + " " + e.getFirstName()
                        + " " + e.getMiddleName() + " " + e.getLastName() +
                        ", ЗП = " + e.getSalary());
            }
        }
    }
    public void findALowerSalary(double salaryRate) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() < salaryRate) {
                System.out.println("У сотрудника " + e.getId() + " " + e.getFirstName() + " "
                        + e.getMiddleName() + " " + e.getLastName() + " " + e.getSalary()
                        + " ЗП меньше минимальной ставки в " + salaryRate);
            }
        }
    }
    public void findABiggerSalary(double salaryRate) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= salaryRate) {
                System.out.println("У сотрудника " + e.getId() + " " + e.getFirstName() + " "
                        + e.getMiddleName() + " " + e.getLastName() + " " + e.getSalary()
                        + " ЗП больше минимальной ставки в " + salaryRate);
            }
        }
    }
}
