package Proxy.design.pattern;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String client, Employee empId) throws Exception {
		System.out.println("Creating employee with ID: " + empId + " for client: " + client);
	}

	@Override
	public void delete(String client, int empId) throws Exception {
		System.out.println("Deleting employee with ID: " + empId + " for client: " + client);
	}

	@Override
	public Employee get(String client, int empId) throws Exception {
		System.out.println("Getting employee with ID: " + empId + " for client: " + client);
		return new Employee();
	}

}
