import java.util.ArrayList;
import java.util.List;

public class CustomerServiceMediator implements Mediator {
    private List<Department> departments;

    public CustomerServiceMediator() {
        departments = new ArrayList<>();
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public void sendMessage(String message, Department department) {
        if (departments.contains(department)) {
            department.handleRequest(message);
        } else {
            System.out.println("Department not found");
        }
    }
}
