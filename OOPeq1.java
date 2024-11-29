import java.util.*;

class Employee {
    String name;
    List<Integer> payments;

    public Employee(String name) {
        this.name = name;
        this.payments = new ArrayList<>();
    }

    public void addPayment(int amount) {
        this.payments.add(amount);
    }

    public int getTotalPayments() {
        return this.payments.stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + "\n" +
                "Payments: " + payments + "\n" +
                "Total Payments: " + getTotalPayments() + "\n";
    }
}

public class AccountingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int employeeCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Map<String, Employee> employees = new HashMap<>();
        for (int i = 0; i < employeeCount; i++) {
            System.out.print("Enter the employee name: ");
            String name = scanner.nextLine();
            employees.put(name, new Employee(name));
        }

        while (true) {
            System.out.print("Enter the employee's name and payment amount (or 0 to exit): ");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            String[] parts = input.split(" ");
            String employeeName = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (employees.containsKey(employeeName)) {
                employees.get(employeeName).addPayment(amount);
            } else {
                System.out.println("Employee not found!");
            }
        }

        System.out.println("\nEmployee Details:");
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }
}
