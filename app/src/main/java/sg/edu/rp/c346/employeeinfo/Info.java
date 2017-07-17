package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 16022774 on 17/7/2017.
 */

public class Info {

    //Define the data items in the row
    private String name;
    private String job;
    private float pay;


    public Info(String name, String job, int pay) {
        this.name = name;
        this.job = job;
        this.pay = pay;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }


}
