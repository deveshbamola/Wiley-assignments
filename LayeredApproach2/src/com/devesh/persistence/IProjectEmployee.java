package com.devesh.persistence;

import java.util.HashSet;

import com.devesh.bean.Employee;
import com.devesh.bean.Project;

public interface IProjectEmployee {
	boolean allocate(Employee emp, Project pro);
	boolean dellocate(Employee emp, Project pro);
	HashSet<Employee> getEmployeesByProjectID(Project pro);
}
