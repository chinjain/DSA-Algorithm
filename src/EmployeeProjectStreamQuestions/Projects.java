package EmployeeProjectStreamQuestions;

public class Projects {

	private String name;
	private String team;
	private String projectManager;

	public Projects(String name, String team, String projectManager) {
		super();
		this.name = name;
		this.team = team;
		this.projectManager = projectManager;
	}

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	@Override
	public String toString() {
		return "Projects [name=" + name + ", team=" + team + ", projectManager=" + projectManager + "]";
	}

}
