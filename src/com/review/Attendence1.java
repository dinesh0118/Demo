package com.review;

import java.util.ArrayList;
import java.util.Scanner;

public class Attendence1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> attendance = new ArrayList<>();

		System.out.println("Enter HR's attendance : ");
		String hrAttendance = scanner.next().toLowerCase();
		attendance.add(hrAttendance);

		System.out.println("Enter Manager's attendance : ");
		String managerAttendance = scanner.next().toLowerCase();
		attendance.add(managerAttendance);

		if (attendance.get(0).equals("present") && attendance.get(1).equals("present")) {
			System.out.println("Employee is marked as Present.");
		} else if (attendance.get(0).equals("absent") && attendance.get(1).equals("absent")) {
			System.out.println("Employee is marked as Absent.");
		} else {
			System.out.println("We need to discuss the attendance.");
		}

		scanner.close();

	}

}
