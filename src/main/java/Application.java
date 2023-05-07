import DAO.Impl.EmployeeDAOImpl;
import model.City;
import model.Employee;
import model.enums.Gender;

public class Application {
	public static void main(String[] args) {

		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

		employeeDAO.addEmployee(new Employee("TEST", "TEST", Gender.MALE, new City("TEST")));

		System.out.println(employeeDAO.findById("fniyGDuFX"));

		System.out.println(employeeDAO.getAllEmployees());

		System.out.println(employeeDAO.updateById("YiGIQLATJ", new Employee("TEST2", "TEST2", Gender.FEMALE, new City("TEST2"))));

		System.out.println(employeeDAO.deleteById("ErsumCdmL"));
	}
}
