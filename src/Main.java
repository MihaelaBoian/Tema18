import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Tom", "Management", true, 19));
            employees.add(new Employee("Mike", "Management", false, 27));
            employees.add(new Employee("Julia", "Software", true, 30));
            employees.add(new Employee("Mike","Testing",true,35));
            employees.add(new Employee("Robert","Management",true,38));
        List<Employee>employeefilter = employees.stream()
                 .filter(e -> e.isPayedPerHour())
                 .filter(e -> e.getDepartment().equals("Management"))
                 .collect(Collectors.toList());
         System.out.println(employeefilter);



    }
}