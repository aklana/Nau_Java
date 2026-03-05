package task2.third;

public class Employee {

    private String fullName;
    private Integer age;
    private String department;
    private Double salary;

    public Employee(String _fullName, Integer _age, String _department, Double _salary) {
        this.fullName = _fullName;
        this.age = _age;
        this.department = _department;
        this.salary = _salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String _fullName) {
        this.fullName = _fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer _age) {
        this.age = _age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String _department) {
        this.department = _department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double _salary) {
        this.salary = _salary;
    }
}