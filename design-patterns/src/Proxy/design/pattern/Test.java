package Proxy.design.pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EmployeeDao employeeDao = new EmployeeDaoProxy();
			employeeDao.create("ADMIN", new Employee());
			System.out.println("Employee created successfully");
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
}
