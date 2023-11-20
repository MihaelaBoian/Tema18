import java.util.* ;
//import java.util.stream;
public class Employee {
    String name;
    String Department;
    boolean isPayedPerHour;
    int age;
    public Employee(String name, String Department,boolean isPayedPerHour,int age ){
        this.name=name;
        this.age=age;
        this.isPayedPerHour=isPayedPerHour;
        this.Department=Department;
    }

    public String getDepartment() {
        return Department;
    }

    public boolean isPayedPerHour() {
        return isPayedPerHour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String  name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Department: " + Department;
    }
}

