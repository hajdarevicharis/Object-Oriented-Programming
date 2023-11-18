package Lab07.Task03;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

record Employee(int id, String name, double salary) {}

class EmployeeMangementSystem {
    public EmployeeMangementSystem() {
    }

    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        employees.forEach(employee -> {
            if(employee.salary() >= minSalary) {
                employees.add(employee);
            } else {
                System.out.println(0);
            }
        });
        return employees;
    }

    public List<Employee> filterEmployeesBySalaryV2(List<Employee> employees, double minSalary) {
        return employees.stream().filter(employee -> employee.salary() >= minSalary).collect(Collectors.toList());
    }

    public double calculateTotalSalary(ArrayList<Employee> employees) {
        double totalSalary = 0;
        for (Employee e : employees) {
            totalSalary += e.salary();
        }
        return totalSalary;
    }

    public void displayEmployeeDetails(ArrayList<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee));
    }


}


class MenagmentSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "Emir", 100000),
                new Employee(2, "Amar", 50.5),
                new Employee(3, "Faris", 520.3),
                new Employee(4, "Haris", 3.1)
        ));

        EmployeeMangementSystem employeeMangementSystem = new EmployeeMangementSystem();

        List<Employee> filteredBySalary = employeeMangementSystem.filterEmployeesBySalaryV2(employeeList,0);
        for (Employee e : filteredBySalary) {
           // System.out.println(e);
        }

        double totalSalaries = employeeMangementSystem.calculateTotalSalary(employeeList);
        //System.out.println(totalSalaries);

        employeeMangementSystem.displayEmployeeDetails(employeeList);
    }
}
