package net.codejava;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    private long id;
    private String fName;
    private String lName;
    private String branch;
    private double percentage;

    public Student(long id, String fName, String lName, String branch, double percentage) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.branch = branch;
        this.percentage = percentage;
    }

    public Student() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}