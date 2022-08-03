import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"jaffar"));
        employees.add(new Employee(2,"ahmed"));

        for (var item : employees) {
            System.out.println(item.id + "\n" + item.name);
        }
    }
}
