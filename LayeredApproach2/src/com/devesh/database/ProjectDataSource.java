package com.devesh.database;

import java.util.ArrayList;

import com.devesh.bean.Project;

public class ProjectDataSource {
	private static ArrayList<Project> projectList=new ArrayList<Project>();
	static {
		projectList.add(new Project(111, "Bench"));
		projectList.add(new Project(222, "SAP"));
		projectList.add(new Project(333, "ERP"));
		projectList.add(new Project(444, "CRM"));
		projectList.add(new Project(555, "DBP"));
	}
	public static ArrayList<Project> getProjectList() {
		return projectList;
	}
	public static void setProjectList(ArrayList<Project> projectList) {
		ProjectDataSource.projectList = projectList;
	}
	
}
