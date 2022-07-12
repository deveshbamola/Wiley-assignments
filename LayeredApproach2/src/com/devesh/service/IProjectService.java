package com.devesh.service;

import java.util.ArrayList;

import com.devesh.bean.Project;

public interface IProjectService {
	Project searchRecordById(int empId);

	ArrayList<Project> getAllRecords();
}
