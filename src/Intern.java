public class Intern extends Employee {
    final double SALARY_LIMIT = 20000;

    public Intern(String name, String email, int age, double salary){
        super(name, email, age, salary);
        double newSalary = Math.min(salary, SALARY_LIMIT);
        setSalary(newSalary);
    }
}
