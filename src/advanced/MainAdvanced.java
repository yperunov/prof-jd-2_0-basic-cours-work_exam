package advanced;

public class MainAdvanced {
    //advanced methods

    public static void salaryAllEmployeesIndexation(Employee[] ind, int indexPercentage) {
        System.out.print("TOTAL SALARY PER MONTH BEFORE INDEXATION");
        printSalarySumAllEmployees(ind);

        System.out.println("INDEXATION FOR "+indexPercentage+"% WAS APPLIED");
        System.out.println();

        if (indexPercentage<=0){
            throw new RuntimeException("index percentage should be 1% or more. pls enter correct value");
        }
        else {
            for (int i = 0; i <ind.length; i++) {
                int indexedSalary = (int) (ind[i].getSalary() * (100+indexPercentage) / 100);
                ind[i].setSalary(indexedSalary);
            }
        }
        System.out.print("TOTAL SALARY PER MONTH AFTER INDEXATION");
        printSalarySumAllEmployees(ind);
        System.out.print("EMPLOYEE BOOK AFTER INDEXATION");
        printListAllEmployees(ind);
    }

    public static void printSalaryMinimumByDept(Employee[] minDept,int deptNumber) {
        int qtyPersonInDept = 0;
        int initialEmployeeNumInDept = 0;
        for (int i = 0; i < minDept.length; i++) {
            if (minDept[i].getDepartment() == deptNumber) {
                qtyPersonInDept++;
            }
        }
        if (deptNumber > 5 || deptNumber < 1) {
            throw new RuntimeException("we have only 5 departments - 1,2,3,4,5. that's it)");
        }
        if (qtyPersonInDept == 0) {
            throw new RuntimeException("we have no employees in selected department. try another department to measure min salary");
        } else {
            for (int i = 0; i < minDept.length; i++) {
                if (minDept[i].getDepartment()==deptNumber) {
                    initialEmployeeNumInDept = minDept[i].getIdThisEmployee()-1;
                    break;
                }
            }
            int minimumSalaryByDeptPerMonth = minDept[initialEmployeeNumInDept].getSalary();
            System.out.println();
            System.out.print("Minimum salary per month for department "+deptNumber+" is: ");
            for (int j = 0; j < minDept.length; j++) {
                if (minDept[j].getSalary() < minimumSalaryByDeptPerMonth&&minDept[j].getDepartment()==deptNumber) {
                    minimumSalaryByDeptPerMonth = minDept[j].getSalary();
                }
            }
            System.out.println(minimumSalaryByDeptPerMonth);
        }
    }

    public static void printSalaryMaximumByDept(Employee[] maxDept,int deptNumber) {
        int qtyPersonInDept = 0;
        int initialEmployeeNumInDept = 0;
        for (int i = 0; i < maxDept.length; i++) {
            if (maxDept[i].getDepartment() == deptNumber) {
                qtyPersonInDept++;
            }
        }
        if (deptNumber > 5 || deptNumber < 1) {
            throw new RuntimeException("we have only 5 departments - 1,2,3,4,5. that's it)");
        }
        if (qtyPersonInDept == 0) {
            throw new RuntimeException("we have no employees in selected department. try another department to measure max salary");
        } else {
            for (int i = 0; i < maxDept.length; i++) {
                if (maxDept[i].getDepartment()==deptNumber) {
                    initialEmployeeNumInDept = maxDept[i].getIdThisEmployee()-1;
                    break;
                }
            }
            int maximumSalaryByDeptPerMonth = maxDept[initialEmployeeNumInDept].getSalary();
            System.out.println();
            System.out.print("Maximum salary per month for department "+deptNumber+" is: ");
            for (int j = 0; j < maxDept.length; j++) {
                if (maxDept[j].getSalary() > maximumSalaryByDeptPerMonth&&maxDept[j].getDepartment()==deptNumber) {
                    maximumSalaryByDeptPerMonth = maxDept[j].getSalary();
                }
            }
            System.out.println(maximumSalaryByDeptPerMonth);
        }
    }

    public static void printSalarySumByDept(Employee[]slrDpt, int deptNumber) {
        int qtyPersonInDept = 0;
        int totalSalaryByDeptPerMonth = 0;

        for (int i = 0; i < slrDpt.length; i++) {
            if (slrDpt[i].getDepartment() == deptNumber) {
                qtyPersonInDept++;
            }
        }
        if (deptNumber > 5 || deptNumber < 1) {
            throw new RuntimeException("we have only 5 departments - 1,2,3,4,5. that's it)");
        }
        if (qtyPersonInDept == 0) {
            throw new RuntimeException("we have no employees in selected department. try another department to measure total salary");
        } else {
            for (int i = 0; i < slrDpt.length; i++) {
                if (slrDpt[i].getDepartment() == deptNumber) {
                    totalSalaryByDeptPerMonth = totalSalaryByDeptPerMonth + slrDpt[i].getSalary();
                }
            }
        }
        System.out.println();
        System.out.print("Total salary per month for department "+deptNumber+" is: ");
        System.out.println(totalSalaryByDeptPerMonth);
    }

    public static void printSalaryAverageByDept(Employee[]slrAvgDpt, int deptNumber) {
        int qtyPersonInDept = 0;
        int qtyPersonInDeptWithNonNullSalary = 0;
        int totalSalaryByDeptPerMonth = 0;
        for (int i = 0; i < slrAvgDpt.length; i++) {
            if (slrAvgDpt[i].getDepartment() == deptNumber) {
                qtyPersonInDept++;
            }
        }
        if (deptNumber > 5 || deptNumber < 1) {
            throw new RuntimeException("we have only 5 departments - 1,2,3,4,5. that's it)");
        }
        if (qtyPersonInDept == 0) {
            throw new RuntimeException("we have no employees in selected department. try another department to measure average salary");
        } else {
            for (int i = 0; i < slrAvgDpt.length; i++) {
                if (slrAvgDpt[i].getDepartment() == deptNumber) {
                    totalSalaryByDeptPerMonth = totalSalaryByDeptPerMonth + slrAvgDpt[i].getSalary();
                    if (slrAvgDpt[i].getSalary() > 0) {
                        qtyPersonInDeptWithNonNullSalary++;
                    }
                }
            }
        }
        System.out.println();
        System.out.print("Average salary per month for department "+deptNumber+" is: ");
        System.out.println(totalSalaryByDeptPerMonth/qtyPersonInDeptWithNonNullSalary);
    }


    //basic methods
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
        for (int j = 0; j < slr.length; j++) {
            totalSalaryAllEmployeesPerMonth = totalSalaryAllEmployeesPerMonth + slr[j].getSalary();
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
//        BasicCourseIntro
        Employee testEmployee = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 50000);
//        System.out.println(testEmployee);
        Employee testEmployee2 = new Employee("Petrov", "Petr", "Petrovich", 5, 40000);
//        System.out.println(testEmployee2);
        testEmployee.setDepartment(2);
        testEmployee.setSalary(60000);
//        System.out.println(testEmployee);

        Employee[] employeesArray;
        employeesArray = new Employee[10];

        employeesArray[0] = testEmployee;
        employeesArray[1] = testEmployee2;
        employeesArray[2] = new Employee("Sidorov", "Sidor", "Sidorovich", 2, 35000);
        employeesArray[3] = new Employee("Serafidze", "Jacob", "Gurgenovich", 1, 70000);
        employeesArray[4] = new Employee("Jashenko", "David", "Abramovich", 4, 100000);
        employeesArray[5] = new Employee("Yarovaja", "Irina", "Anatoljevna", 4, 1000);
        employeesArray[6] = new Employee("Kvadrakopterov", "Robot", "Electrichich", 4, 40000);
        employeesArray[7] = new Employee("Tolstoy", "Lev", "Nikolaevich", 2, 80000);
        employeesArray[8] = new Employee("Malevich", "Kazemir", "Severinovich", 5, 50000);
        employeesArray[9] = new Employee("Pushkin", "Alexander", "Sergeevich", 2, 89000);

//        System.out.println(employeesArray[9].toString());

//        printListAllEmployees(employeesArray);
//        printSalarySumAllEmployees(employeesArray);
//        printSalaryMinimum(employeesArray);
//        printSalaryMaximum(employeesArray);
//        printSalaryAverage(employeesArray);
//        printSurnameNamePatronymicAllEmployees(employeesArray);

        // AdvancedCourseMainClass

        salaryAllEmployeesIndexation(employeesArray,12);
        printSalaryMinimumByDept(employeesArray,5);
        printSalaryMaximumByDept(employeesArray,1);
        printSalarySumByDept(employeesArray,2);
        printSalaryAverageByDept(employeesArray,4);


    }
}
