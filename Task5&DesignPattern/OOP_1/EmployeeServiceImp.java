import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeServiceImp implements Employee {
    private int numberOfEmployee;
    private ArrayList<String> employeesNames = new ArrayList<>();
    Map<String, Double> employeeMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void inputNamesEmployee() {
        System.out.print("Enter number of employees: ");
        numberOfEmployee = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            employeesNames.add(name);
            employeeMap.put(name,0.0);
        }
    }

    @Override
    public void amountEmplyee() {
        while (true) {
            System.out.print("Enter employee name (or 0 to stop): ");
            String name = scanner.nextLine();

            if (name.equals("0"))
                break;

            if (!employeeMap.containsKey(name)) {
                System.out.println("Employee not found!");
                continue;
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); 
            employeeMap.put(name, employeeMap.get(name) + amount);
            
        }
    }

    @Override
    public void print() {
        Double Sum=0.0;
        System.out.println("\nFinal Data:");
        for (Map.Entry<String, Double> entry : employeeMap.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", Amounts: " + entry.getValue());
            Sum+= entry.getValue();
        }
        System.out.println("Total: "+Sum);

    }
}
