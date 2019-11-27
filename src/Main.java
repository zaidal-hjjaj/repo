import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        EMP e1= new EMP(22,"jhon","1/1/2019","full part","manager",750);
        EMP e2= new EMP(27,"sam","2/2/2019","full part","employee",350);
        EMP e3= new EMP(25,"mark","7/4/2019","full part","manager",350);

        ArrayList emps = new ArrayList();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);

        for (Object e :emps) {
            System.out.println(e.toString());
        }
        System.out.println("hello world ");

    }
}
