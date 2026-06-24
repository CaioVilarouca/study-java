package services;

import java.util.ArrayList;
import java.util.List;

import entites.Employee;

public class ListServices {
	private List <Employee> list = new ArrayList<>();
	
	public void add(Employee newEmployee) {
		list.add(newEmployee);
	}
	
	public void remove(Employee newEmployee) {
		list.remove(newEmployee);
	}

	public List<Employee> getList() {
		return list;
	}
	
}
