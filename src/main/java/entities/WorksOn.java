package entities;

public class WorksOn {

    private String empNo;
    private String projectNo;
    private String job;
    private String enterDate;

    public WorksOn(String empNo, String projectNo, String job, String enterDate) {
        this.empNo = empNo;
        this.projectNo = projectNo;
        this.job = job;
        this.enterDate = enterDate;
    }

    @Override
    public String toString() {
        return "WorksOn{" +
                "empNo='" + empNo + '\'' +
                ", projectNo='" + projectNo + '\'' +
                ", job='" + job + '\'' +
                ", enterDate='" + enterDate + '\'' +
                '}';
    }
}
