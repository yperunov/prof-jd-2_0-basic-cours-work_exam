package basic;

public class MainBasic {


    public static void printListAllEmployees(Employee[] prt) {
        System.out.println();
        System.out.println("Output for Employee List start");
        System.out.println("==================================");
        for (int i = 0; i < prt.length; i++) {
            System.out.println(prt[i]);}
        System.out.println("==================================");
        System.out.println("Output for Employee List finish");
        System.out.println();
    }

    public static void printSalarySumAllEmployees(Employee[] slr) {
        int totalSalaryAllEmployeesPerMonth = 0;
        System.out.println();
        System.out.print("Total salary per month for Employee List is: ");
        for (int i = 0; i < slr.length; i++) {
            totalSalaryAllEmployeesPerMonth = totalSalaryAllEmployeesPerMonth + slr[i].getSalary();
        }
        System.out.println(totalSalaryAllEmployeesPerMonth);
        System.out.println();
    }

    public static void printSalaryMinimum(Employee[] min) {
        int minimumSalaryPerMonth = min[0].getSalary();
        System.out.println();
        System.out.print("Minimum salary per month for Employee List is: ");
        for (int i = 0; i < min.length; i++) {
            if (min[i].getSalary() < minimumSalaryPerMonth) {
                minimumSalaryPerMonth = min[i].getSalary();
            }
        }
        System.out.println(minimumSalaryPerMonth);
        System.out.println();
    }

    public static void printSalaryMaximum(Employee[] max) {
        int maximumSalaryPerMonth = max[0].getSalary();
        System.out.println();
        System.out.print("Maximum salary per month for Employee List is: ");
        for (int i = 0; i < max.length; i++) {
            if (max[i].getSalary() > maximumSalaryPerMonth) {
                maximumSalaryPerMonth = max[i].getSalary();
            }
        }
        System.out.println(maximumSalaryPerMonth);
        System.out.println();
    }

    public static void printSalaryAverage(Employee[] avg) {
        int totalSalaryAllEmployeesPerMonth = 0;
        int countOfEmployeesNonNull = 0;
        System.out.println();
        System.out.print("Average salary per month for Employee List is: ");
        for (int i = 0; i < avg.length; i++) {
            totalSalaryAllEmployeesPerMonth = totalSalaryAllEmployeesPerMonth + avg[i].getSalary();
            if (avg[i].getSalary() > 0) {
                countOfEmployeesNonNull++;
            }
        }
        System.out.println(totalSalaryAllEmployeesPerMonth/countOfEmployeesNonNull);
        System.out.println();
    }

    public static void printSurnameNamePatronymicAllEmployees(Employee[] snp) {
        System.out.println();
        System.out.println("Output Surname|Name|Patronymic for Employee List start");
        System.out.println("==================================");
        for (int i = 0; i < snp.length; i++) {
            System.out.print(snp[i].getSurname()+" ");
            System.out.print(snp[i].getName()+" ");
            System.out.println(snp[i].getPatronymic());
        }
        System.out.println("==================================");
        System.out.println("Output Surname|Name|Patronymic for Employee List finish");
        System.out.println();
    }

    public static void main(String[] args) {
        // BasicCourseMainClass
        Employee testEmployee = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 50000);
        System.out.println(testEmployee);
        Employee testEmployee2 = new Employee("Petrov", "Petr", "Petrovich", 5, 40000);
        System.out.println(testEmployee2);
        testEmployee.setDepartment(2);
        testEmployee.setSalary(60000);
        System.out.println(testEmployee);

        Employee[] placeToSaveEmployees;
        placeToSaveEmployees = new Employee[10];

        placeToSaveEmployees[0] = testEmployee;
        placeToSaveEmployees[1] = testEmployee2;
        placeToSaveEmployees[2] = new Employee("Sidorov", "Sidor", "Sidorovich", 2, 35000);
        placeToSaveEmployees[3] = new Employee("Serafidze", "Jacob", "Gurgenovich", 1, 70000);
        placeToSaveEmployees[4] = new Employee("Jashenko", "David", "Abramovich", 4, 100000);
        placeToSaveEmployees[5] = new Employee("Yarovaja", "Irina", "Anatoljevna", 3, 1000);
        placeToSaveEmployees[6] = new Employee("Kvadrakopterov", "Robot", "Electrichich", 4, 40000);
        placeToSaveEmployees[7] = new Employee("Tolstoy", "Lev", "Nikolaevich", 2, 80000);
        placeToSaveEmployees[8] = new Employee("Malevich", "Kazemir", "Severinovich", 5, 50000);
        placeToSaveEmployees[9] = new Employee("Pushkin", "Alexander", "Sergeevich", 2, 89000);

        System.out.println(placeToSaveEmployees[9].toString());

        printListAllEmployees(placeToSaveEmployees);
        printSalarySumAllEmployees(placeToSaveEmployees);
        printSalaryMinimum(placeToSaveEmployees);
        printSalaryMaximum(placeToSaveEmployees);
        printSalaryAverage(placeToSaveEmployees);
        printSurnameNamePatronymicAllEmployees(placeToSaveEmployees);

    }
}
