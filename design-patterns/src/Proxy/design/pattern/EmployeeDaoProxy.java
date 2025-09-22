package Proxy.design.pattern;

public class EmployeeDaoProxy implements EmployeeDao {

	private EmployeeDao employeeDaoObj;

	public EmployeeDaoProxy() {
		employeeDaoObj = new EmployeeDaoImpl();
	}

	@Override
	public void create(String client, Employee empId) throws Exception {
		if (client.equalsIgnoreCase("ADMIN")) {
			employeeDaoObj.create(client, empId);
			return;
		}
		throw new Exception("You are not authorized to create employee");

	}
	
	@Override
	public void delete(String client, int empId) throws Exception {
		if (client.equalsIgnoreCase("ADMIN")) {
			employeeDaoObj.delete(client, empId);
			return;
		}
		throw new Exception("You are not authorized to delete employee");
	}
	
	@Override
	public Employee get(String client, int empId) throws Exception {
		if (client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")) {
			return employeeDaoObj.get(client, empId);
		}
		throw new Exception("You are not authorized to get employee");
	}
}