public class ServiceEmployee {
    public static void printAllEmployees(Employee[] employees) {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public static double printSumSalaryEmployees(Employee[] employees) {
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

    public static Employee printMinSalaryEmployees(Employee[] employees) {
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

    public static Employee printMaxSalaryEmployees(Employee[] employees) {
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

    public static double printAverageSalaryEmployees(Employee[] employees) {
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

    public static void indexSalaryEmployees(Employee[] employees) { //индексирование в течении года
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

    public static Employee findMinSalaryInDept(Employee[] employees, int departmentNumber) {
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

    public static Employee findMaxSalaryInDept(Employee[] employees, int departmentNumber) {
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

    public static double findSumSalaryInDept(Employee[] employees, int departmentNumber) {
        double sumSalary = 0.0;
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == departmentNumber) {
                sumSalary += e.getSalary();
            }
        }
        return sumSalary;
    }
    public static double findAverageSalaryInDept(Employee[] employees, int departmentNumber) {
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
    public static void findIndexSalaryInDept(Employee[] employees, int deptNumber, double percent) {
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == deptNumber) {
                double oldSalary = e.getSalary();
                double newSalary = oldSalary + (oldSalary * percent / 100);
                e.setSalary(newSalary);
                System.out.println("ЗП у сотрудника " + e + " после индексации: " + newSalary);
            }
        }
    }

    public static void findAllEmploeeInDept(Employee[] employees, int deptNumber) {
        for (Employee e : employees) {
            if (e != null && e.getDepartmentNumber() == deptNumber) {
                System.out.println(e.getId() + " " + e.getFirstName() + " " + e.getMiddleName() + " " + e.getLastName() +
                        ", ЗП = " + e.getSalary());
            }
        }
    }
    public static void findALowerSalary(Employee[]employees, double salaryRate) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() < salaryRate) {
                System.out.println("У сотрудника " + e.getId() + " " + e.getFirstName() + " "
                        + e.getMiddleName() + " " + e.getLastName() + " " + e.getSalary()
                        + " ЗП меньше минимальной ставки в " + salaryRate);
            }
        }
    }
    public static void findABiggerSalary(Employee[]employees, double salaryRate) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= salaryRate) {
                System.out.println("У сотрудника " + e.getId() + " " + e.getFirstName() + " "
                        + e.getMiddleName() + " " + e.getLastName() + " " + e.getSalary()
                        + " ЗП больше минимальной ставки в " + salaryRate);
            }
        }
    }
}
