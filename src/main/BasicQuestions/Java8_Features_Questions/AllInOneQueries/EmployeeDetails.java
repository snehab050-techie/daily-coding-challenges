package src.main.BasicQuestions.Java8_Features_Questions.AllInOneQueries;

public class EmployeeDetails {

    private int id;
    private String name;
    private int salary;
    private String deptName;

    public EmployeeDetails(int id, String name, int salary, String deptName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
