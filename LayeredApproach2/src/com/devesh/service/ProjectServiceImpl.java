package com.devesh.service;

import java.util.ArrayList;

import com.devesh.bean.Project;
import com.devesh.persistence.IProjectDao;
import com.devesh.persistence.ProjectDaoImpl;

public class ProjectServiceImpl implements IProjectService {
	private IProjectDao productDao = new ProjectDaoImpl();
	@Override
	public Project searchRecordById(int empId) {
		return productDao.searchRecordById(empId);
	}

	@Override
	public ArrayList<Project> getAllRecords() {
		return productDao.getAllRecords();
	}

}
