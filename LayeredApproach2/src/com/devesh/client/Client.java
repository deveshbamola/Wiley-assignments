package com.devesh.client;

import java.util.Scanner;

import com.devesh.presentation.Presentation;
import com.devesh.presentation.PresentationImpl;

public class Client {

	public static void main(String[] args) {
		Presentation employeePresentation=new PresentationImpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
	
		}
	}

}
