package com.devesh.bean;

public class Project {
	private  int counter;
	public  int getCounter() {
		return counter;
	}

	public  void setCounter(int counter) {
		this.counter = counter;
	}

	private int projectId;
	private String projectName;

	public Project() {
		super();
	}

	public Project(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
}
