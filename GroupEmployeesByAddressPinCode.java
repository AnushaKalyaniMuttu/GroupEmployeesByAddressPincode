package com.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByAddressPinCode {
    
	 public static void main(String[] args) {
			List<Employee> list=new ArrayList<>();
			Employee emp1 = new Employee("John", 25, new Address("123 Main St", "CityA", 12345));
	        Employee emp2 = new Employee("Alice", 30, new Address("456 Second St", "CityB", 67890));
	        Employee emp3 = new Employee("Bob", 28, new Address("789 Third St", "CityA", 54321));
	        Employee emp4 = new Employee("Eve", 22, new Address("101 Fourth St", "CityC", 13579));
	        Employee emp5= new Employee("new", 2, new Address("101 Fourth St", "CityC", 13579));

	        list.add(emp4);
	        list.add(emp3);
	        list.add(emp2);
	        list.add(emp1);
	        list.add(emp5);
		Map<Integer, List<Employee>> map=	list.stream().collect(Collectors.groupingBy(e->e.getAddress().getPinCode()));
		for(Map.Entry<Integer, List<Employee>> e: map.entrySet()) {
				System.out.println(e.getKey());
				e.getValue().forEach(emp->System.out.println(emp.toString()));
		}
		 }
	
}
