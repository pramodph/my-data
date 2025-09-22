package Proxy.design.pattern;

public interface EmployeeDao {

	public void create(String cllient, Employee empId) throws Exception;
	public void delete(String client,int empId) throws Exception;
	public Employee get(String client, int empId) throws Exception;
}
