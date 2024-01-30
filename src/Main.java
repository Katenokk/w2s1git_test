import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee pepe = new Employee("pepe", "pepe@gmail.com", 20, 30000);
        System.out.println(pepe.getName());
        Intern pepito = new Intern("pepito", "pepito@gmail.com", 21, 10000);
        System.out.println(pepito.getSalary());
        createEmployees();//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
    public static void createEmployees(){
        //create 10 Employee objects:
        Employee[] employees = new Employee[10];
        for(int i = 0; i< employees.length;i++){
            employees[i] = new Employee("Name" + (i+1), (i+1) + "@email.com", 20+i, 10000+i);
        }

        try {
            FileWriter writer = new FileWriter("employees.txt");
            for(Employee empl : employees){
                writer.write("Name: " + empl.getName()+ "\n");
                writer.write("Email: " + empl.getEmail()+ "\n");
                writer.write("Age: " + empl.getAge()+ "\n");
                writer.write("Salary: " + empl.getSalary() + "\n");
                writer.write("================" + "\n");

            }
            writer.close();
        }

        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}