package com.devesh.persistence;

import java.util.ArrayList;

import com.devesh.bean.Project;

public interface IProjectDao {
	Project searchRecordById(int empId);
	ArrayList<Project> getAllRecords();
}
