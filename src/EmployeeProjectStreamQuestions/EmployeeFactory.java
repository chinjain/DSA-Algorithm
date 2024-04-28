package EmployeeProjectStreamQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeFactory extends Employee {
	


	static ArrayList<Employee> employees = new ArrayList<>();

	public static List<Employee> getAll() {
		Projects Delta = new Projects("Delta Model", "Login", "Robert Downey Jr");
		Projects Beta = new Projects("Beta Enhancement", "Authentication", "Chris");
		Projects TwoFactorAuth = new Projects("Two Factor Authentication", "Authentication", "MSD");
		Projects CommonUI = new Projects("Common UI", "UI", "Robert Downey Jr");
		Projects Pegasus = new Projects("Pegasus Model", "Data", "Vikram");
		Projects CustomerOnboarding = new Projects("Customer Onboarding", "Ads", "Vedha");
		Projects Verification = new Projects("Source Verification", "Data", "Pablo");
		Projects RemoveUsers = new Projects("Remove Invalid User", "Proxy", "Jeetu");
		Projects SiteReliability = new Projects("Site Reliability", "Admin", "Zaheer Khan");
		Projects DataTransition = new Projects("Data Transition", "Data", "Atif Aslam");
		Projects TwoPhaseDeployment = new Projects("Two Phase Deployment", "Deployment", "Shaktiman");

		employees.add(new Employee("2020Emp0234", "Bhaskar", "Sharan", 900000, 1, Arrays.asList(Delta, Beta)));
		employees.add(new Employee("2012Emp1923", "Dev", "Sharma", 3500000, 3,
				Arrays.asList(Pegasus, CustomerOnboarding, Beta, SiteReliability)));
		employees.add(new Employee("2017Emp0721", "Priti", "Kabir", 1800000, 3,
				Arrays.asList(TwoFactorAuth, Beta, CommonUI)));
		employees.add(new Employee("2017Emp00031", "Chris", "Martin", 2200000, 2, Arrays.asList(Delta, TwoFactorAuth)));
		employees.add(new Employee("2013Emp0872", "Sanjay", "Singhania", 2200000, 3,
				Arrays.asList(Pegasus, Delta, RemoveUsers, DataTransition)));
		employees.add(new Employee("2022Emp0087", "Babu", "Rao", 900000, 1, Arrays.asList(TwoFactorAuth)));
		employees.add(new Employee("2019Emp0050", "Dev", "Anand", 1300000, 1, Arrays.asList(RemoveUsers, CommonUI)));
		employees.add(new Employee("2023Emp0934", "Shruti", "Sen", 1100000, 1, Arrays.asList(Pegasus)));
		employees.add(new Employee("2023Emp1033", "Akshay", "Kumar", 1200000, 0, Arrays.asList(Delta)));
		employees.add(new Employee("2015Emp0009", "Babu", "Dutt", 2600000, 2,
				Arrays.asList(Verification, RemoveUsers, TwoPhaseDeployment)));

		return employees;

	}

}
