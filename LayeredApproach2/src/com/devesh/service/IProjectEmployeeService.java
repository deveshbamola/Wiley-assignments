package com.devesh.service;
import java.util.*;

import com.devesh.bean.Employee;
import com.devesh.bean.Project;

public interface IProjectEmployeeService {
	boolean allocate(Employee emp, Project pro);

	boolean dellocate(Employee emp, Project pro);

	HashSet<Employee> getEmployeesByProjectID(Project pro);
}
