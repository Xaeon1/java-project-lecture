public class Employee extends Person {
    private String jobRole;
    private double salary;
    private float yearsExperience;

    public Employee(String firstName, String lastName, int age, String gender, String jobRole, double salary, float yearsExperience) {
        super(firstName, lastName, age, gender);
        this.jobRole = jobRole;
        this.salary = salary;
        this.yearsExperience = yearsExperience;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(float yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
}
