import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        createEmployees();//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
    public static void createEmployees(){
        //create 10 Employee objects:
        Employee[] employees = new Employee[10];
        for(int i = 0; i< employees.length;i++){
            Random random = new Random();
            double randomSalary = random.nextDouble(15000, 30000);
            double roundedSalary= Math.round(randomSalary*100.0)/100.0;
            employees[i] = new Employee("Name" + (i+1), 20+i, roundedSalary);
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