public class ServiceEmployee {
    public static void printAllEmployees(Employee [] employees) {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }
        public static double printSumSalaryEmployees(Employee [] employees) {
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
    public static Employee printMinSalaryEmployees(Employee [] employees) {
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
        public static Employee printMaxSalaryEmployees(Employee [] employees) {
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
    public static double printAverageSalaryEmployees(Employee [] employees) {
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
}
