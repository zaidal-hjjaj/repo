import java.util.Date;

public class EMP extends  person {
        private int salary;
        private String jobType;
        private String jobTime;

    public EMP(int age, String name, String DOB, String jobTime, String jobType ,int salary) {
        super(age, name, DOB);
        this.salary = salary;
        this.jobType = jobType;
        this.jobTime = jobTime;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobTime() {
        return jobTime;
    }

    public void setJobTime(String jobTime) {
        this.jobTime = jobTime;
    }

    @Override
    public String toString() {
        return "EMP{" +
                "salary=" + salary +
                ", jobType='" + jobType + '\'' +
                ", jobTime='" + jobTime + '\'' +
               "name = " +getName() +" age ="+getAge()+'}';

    }
}
