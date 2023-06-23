package com.selenium.code.FirstTestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

final class Employee {
	private int id;
	private String name;
	private double salary;
	private List<Long> mobNum;
	private String department;
	private String status;
	//default constructor
	public Employee() {

	}
//parameterized constructor
	public Employee(int id, String name, double salary, List<Long> mobNum,String department,String status) {
		this.id = id;
		this.name = name;
		this.mobNum = mobNum;
		this.department=department;
		this.salary=salary;
		this.status=status;
	}
//Setter methods...
	public void setId(int id) {
		this.id = id;

	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setMobNum(List<Long> mobNum) {
		this.mobNum=mobNum;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	
	//Getter methods..
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public List<Long> getMobNum(){
		return mobNum;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	public String getStatus() {
	return status;
	}
	
public String getDepartment() {
	return department;
}
	public String toString() {
		
		return "id: "+id+" name: "+name+" salary "+salary+" mob: "+mobNum+ " Department: "+department+"status: "+status;
	}
}

public class MyName {
	public static void main(String[] args) {
		Employee e=new Employee(1,"Vithal", 30000.52365, Arrays.asList(7758799265l,886985435l,958953415l,53351545642l,6463812645l),"Developer","active");
		Employee e1=new Employee(2,"Mahesh", 40000.5365, Arrays.asList(7958551265l,88699235l,95633415l,53351545642l,64638743645l),"HR","inActive");
		Employee e2=new Employee(3,"Subhash", 51000.53365, Arrays.asList(988799265l,88333435l,95856253415l,53351545642l,6148645l),"Management","active");
		Employee e3=new Employee(4,"Ravi", 10000.58365, Arrays.asList(6758799265l,8865435l,9889534155l,5345642l,64678945l),"Teachnical Support","inActive");
		Employee e4=new Employee(5,"Saanvi", 30090.52365, Arrays.asList(7758799265l,886985435l,958953415l,53351545642l,6463812645l),"Developer","inActive");
		Employee e5=new Employee(6,"Rohit", 45000.5365, Arrays.asList(7958551265l,88699235l,95633415l,53351545642l,64638743645l),"HR","inActive");
		Employee e6=new Employee(7,"sanket", 5000.53365, Arrays.asList(988799265l,88333435l,95856253415l,53351545642l,6148645l),"Management","active");
		Employee e7=new Employee(8,"saatvik", 103000.58365, Arrays.asList(6758799265l,8865435l,9889534155l,5345642l,64678945l),"Teachnical Support","inActive");

	List<Employee> empList=new ArrayList<Employee>();
	empList.add(e);
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	empList.add(e5);
	empList.add(e6);
	empList.add(e7);
	System.out.println(empList);
	System.out.println("---Iterate by forEach() -------");
	empList.forEach(System.out::println);
	System.out.println("---Iterate by iterator() -------");

	Iterator<Employee> iterator = empList.iterator();
	while(iterator.hasNext()) {
		Employee next = iterator.next();
System.out.println(next);
	}
	System.out.println("---Iterate by for loop -------");
for(int i=0;i<empList.size();i++) {
	System.out.println(empList.get(i));
}

System.out.println("---Iterate by for each loop -------");
for(Employee emp:empList) {
	System.out.println(emp);
}
System.out.println("---Iterate by listIterartor()---");
ListIterator<Employee> listIterator = empList.listIterator();
	while(listIterator.hasNext()) {
		Employee next = listIterator.next();
		System.out.println(next);
	}
	
	System.out.println(">========CODING QUSETION ON STREAM API====>");
	
	/*
	 * 1:find employee working on each department 
	 * 2:find max and min salary of given
	 * emplist 
	 * 3:find max salary of each department. 
	 * 4:find employee count working
	 * on each department
	 * 5:find employees count who's active and inActive
	 * 6:find Employee who'e status is active
	 */
	System.out.println("1:find employee working on each department ");
	//1:find employee working on each department 
	Map<String, List<Employee>> eachDepartmentEmp = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));
	System.out.println(eachDepartmentEmp);
	System.out.println("2:find max and min salary of given emplist");
	Optional<Employee> max = empList.stream().max(Comparator.comparing(Employee::getSalary));
	System.out.println("Maximum Salary : "+max);
	Optional<Employee> min = empList.stream().min(Comparator.comparing(Employee::getSalary));
	System.out.println("Minimum Salary : "+min);
	System.out.println("3:find max salary of each department. ");
	Map<String, Optional<Employee>> MaxSalEachDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
	System.out.println("Max salary of each department: "+MaxSalEachDept);
	Map<String, Optional<Employee>> minSalEachDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Employee::getSalary)))));
	System.out.println("Min salary of each Department: "+minSalEachDept);
	System.out.println("4:find employee count working on each department");
	Map<String, Long> counOfeachDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	System.out.println(" count of each department : "+counOfeachDept);
	System.out.println("5:find employees count who's active and inActive");
	long countActive = empList.stream().filter(er->"active".equalsIgnoreCase(er.getStatus())).count();
	System.out.println("Active Employees :  "+countActive);
	long countInActive = empList.stream().filter(er->"inactive".equalsIgnoreCase(er.getStatus())).count();
	System.out.println("InActive Employees "+countInActive);
	System.out.println("6:find Employee who'e status is active ");
	empList.stream().filter(es->es.getStatus().equalsIgnoreCase("active")).forEach(System.out::println);
	
	}
}
