package entities;

public class Project {

    private String projectNo;
    private String projectName;
    private String budget;

    public Project(String projectNo, String projectName, String budget) {
        this.projectNo = projectNo;
        this.projectName = projectName;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectNo='" + projectNo + '\'' +
                ", projectName='" + projectName + '\'' +
                ", budget='" + budget + '\'' +
                '}';
    }
}
