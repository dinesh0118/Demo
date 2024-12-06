package com.review;

import java.util.Scanner;

public class Attendence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter HR's attendance (P for presnt and A for absent) : ");
		char hrAttendance = scanner.next().toUpperCase().charAt(0);

		System.out.println("Enter Manager's attendance (P for presnt and A for absent) : ");
		char managerAttendance = scanner.next().toUpperCase().charAt(0);

		
		if (hrAttendance == 'P' && managerAttendance == 'P') {
			System.out.println("Employee is marked as Present.");
		}
		else if (hrAttendance == 'A' && managerAttendance == 'A') {
			System.out.println("Employee is marked as Absent.");
		}
		else {
			System.out.println("We need to discuss.");
		}

		
	}
}
