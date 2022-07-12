package com.devesh.presentation;

import java.util.HashSet;
import java.util.Scanner;

import com.devesh.bean.Employee;
import com.devesh.bean.Project;
import com.devesh.service.EmployeeServiceImpl;
import com.devesh.service.IEmployeeService;
import com.devesh.service.IProjectEmployeeService;
import com.devesh.service.IProjectService;
import com.devesh.service.ProjectEmployeeServiceImpl;
import com.devesh.service.ProjectServiceImpl;

public class PresentationImpl implements Presentation {

	private IProjectEmployeeService peService = new ProjectEmployeeServiceImpl();
	private IProjectService projectService = new ProjectServiceImpl();
	private IEmployeeService employeeService = new EmployeeServiceImpl();

	@Override
	public void showMenu() {
		System.out.println("1. Show Projects By Id");
		System.out.println("2. Allocate Employee by Project");
		System.out.println("3. Deallocate Employee to Project");
		System.out.println("4. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		try {
			switch (choice) {
			case 1:
				System.out.println("Enter Project Id To see Employees Deployed on it : ");
				int projectId = scanner.nextInt();
				Project pro = projectService.searchRecordById(projectId);
				if (pro == null)
					System.out.println("Project not found ");
				else {
					HashSet<Employee> employees = peService.getEmployeesByProjectID(pro);
					if (employees.size() == 0) {
						System.out.println("No Employee on this Project");
					} 
					else {
						for (Employee employee : employees) {
							System.out.println(employee.getEmpId() + "  " + employee.getEmpName());
						}
					}
				}
				break;

			case 2:
				System.out.println("Enter Project Id you want to allocate a employee: ");
				int projectId2 = scanner.nextInt();
				Project pro2 = projectService.searchRecordById(projectId2);
				if (pro2 == null) {
					System.out.println("Project not found ");
					break;
				}
				System.out.println("Enter Employee Id you want to allocate: ");
				int empid2 = scanner.nextInt();
				Employee emp2 = employeeService.searchRecordById(empid2);
				if (emp2 == null) {
					System.out.println("Employee not found ");
					break;
				}
				boolean k = peService.allocate(emp2, pro2);
				//System.out.println(k);
				if (k)
					System.out.println("Employee Allocated ");
				else
					System.out.println("Employee not Allocated due to some reason please try again!!");
				break;

			case 3:
				System.out.println("Enter Project Id you want to dellocate a employee: ");
				int projectId3 = scanner.nextInt();
				Project pro3 = projectService.searchRecordById(projectId3);
				if (pro3 == null) {
					System.out.println("Project not found ");
					break;
				}
				System.out.println("Enter Employee Id you want to deallocate: ");
				int empid3 = scanner.nextInt();
				Employee emp3 = employeeService.searchRecordById(empid3);
				if (emp3 == null) {
					System.out.println("Employee not found ");
					break;
				}
				if(emp3.getPid()!=pro3.getProjectId() && emp3.getPid()!=0) {
					System.out.println("Employee not fount on this Project!!");
					break;
				}
				boolean k1 = peService.dellocate(emp3, pro3);
				if (k1)
					System.out.println("Employee Deallocated ");
				else
					System.out.println("Employee not Deallocated");
				break;

			case 4:
				System.out.println("Thanks for using Employee Management System. ");
				System.exit(0);
			default:
				System.out.println("Invalid Coice");
				break;
			}

		} catch (Exception exception) {

		}

	}

}
