package com.example.projectt;

public class Visitor {
    int id;
    String Stu;
    int pass;
    String time_stamp;
    public Visitor(String name, int pass, String time_stamp) {
        this.Stu = name;
        this.pass = pass;
        this.time_stamp = Utility.get_ts();
    }
    public String getName() {
        return Stu;
    }
    public void setName(String Stuid) {
        this.Stu = Stuid;
    }
    public int getAge() {
        return pass;
    }
    public void setAge(int pass) {
        this.pass = pass;
    }

    public String getTime_stamp() {
        return time_stamp;
    }
    public void setTime_stamp() {
        this.time_stamp = Utility.get_ts();
    }

}
