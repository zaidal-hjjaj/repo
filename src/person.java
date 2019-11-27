import java.time.LocalDateTime;
import java.util.Date;

public class person {
    private int age;
    private  String name;
    private String DOB;
    public person(int age, String name, String DOB) {
        this.age = age;
        this.name = name;
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
