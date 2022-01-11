package basic;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String surname;
    private final String patronymic;
    private int department;
    private int salary;
    private static int id=0;
    private final int idThisEmployee;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        id++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.idThisEmployee = id;
        if (department < 1 || department > 5) {
            throw new RuntimeException("we have only 5 departments - 1,2,3,4,5. that's it)");
        }
        if (salary < 1 ) {
            throw new RuntimeException("salary should be 1 or more. pls enter correct salary");
        }
    }

    public int getIdThisEmployee() {
        return idThisEmployee;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + idThisEmployee +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && idThisEmployee == employee.idThisEmployee && name.equals(employee.name) && surname.equals(employee.surname) && patronymic.equals(employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, department, salary, idThisEmployee);
    }
}
