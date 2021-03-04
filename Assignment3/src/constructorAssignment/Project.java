package constructorAssignment;

public class Project {
	
	private int projectId;
	private String projectName;
	private String clientName;
	
	public Project(int projectId, String projectName, String clientName) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.clientName = clientName;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", clientName=" + clientName + "]";
	}
	
	
}
