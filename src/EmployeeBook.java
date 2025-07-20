public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[10];
        initializeEmployees();
    }

    private void initializeEmployees() {
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 25180, 4);

        employees[1] = new Employee("Сидоров", "Павел", "Петрович", 70350, 1);

        employees[2] = new Employee("Плашкин", "Андрей", "Леонидович", 48320, 3);
        employees[3] = new Employee("Никитин", "Павел", "Леонидович", 47920, 1);
        employees[4] = new Employee("Сухина", "Светлана", "Леонидовна", 125020, 3);
        employees[5] = new Employee("Степкина", "Анжела", "Павловна", 108320, 2);
        employees[6] = new Employee("Добрышев", "Андрей", "Георгиевич", 43751, 2);
        employees[7] = new Employee("Дроздов", "Сергей", "Анатольевич", 48805, 1);
        employees[8] = new Employee("Зырянова", "Наталья", "Аркадьевна", 56378, 5);
        //employees [9] = new Employee("Плашкин", "Сергей", "Леонидович", 50240, 4);
    }


    public void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public double findSumSalaryEmployees() {
        double totalSalary = 0;
        for (Employee e : employees) {
            if (e != null) {
                totalSalary = totalSalary + e.getSalary();
            }
        }
        return totalSalary;

    }

    public Employee findMinSalaryEmployees() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;

        for (Employee e : employees) {
            if (e != null && e.getSalary() < minSalary) {
                minSalary = e.getSalary();
                minSalaryEmployee = e;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryEmployees() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;

        for (Employee e : employees) {
            if (e != null && e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                maxSalaryEmployee = e;
            }
        }
        return maxSalaryEmployee;
    }

    public double findAverageSalaryEmployees() {
        double totalSalary = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {
                totalSalary = totalSalary + e.getSalary();
                count++;
            }
        }
        return count > 0 ? totalSalary / count : 0.0;
    }

    public void indexSalaryEmployees(double percent) {
        for (Employee e : employees) {
            if (e != null) {
                double oldSalary = e.getSalary();
                double newSalary = oldSalary + (oldSalary * percent / 100);
                e.setSalary(newSalary);
                System.out.println("ЗП у сотрудника " + e + " после индексации: " + newSalary);
            }
        }
    }

    public Employee findMinSalaryInDept(int departmentNumber) {
        Employee minEmployee = null;
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == departmentNumber
                    && (minEmployee == null || e.getSalary() < minEmployee.getSalary())) {
                minEmployee = e;
            }
        }
        return minEmployee;
    }

    public Employee findMaxSalaryInDept(int departmentNumber) {
        Employee maxEmployee = null;
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == departmentNumber
                    && (maxEmployee == null || e.getSalary() > maxEmployee.getSalary())) {
                maxEmployee = e;
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
                count++;
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
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }
    public boolean removeEmployeeById(int employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == employeeId) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }
    public boolean findEmployeeById(int employeeId) {
        for (Employee e : employees) {
            if (e != null && e.getId() == employeeId) {
                System.out.println("Сотрудник с id = " + e);
                return true;
            }
        }
        System.out.println("Сотрудник с id = " + employeeId + " не найден");
        return false;
    }
}
