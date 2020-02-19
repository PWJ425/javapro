package com.neued.pojo;

public class Student {
    private Integer Sno;
    private String Sname;
    private String Ssex;
    private Integer sage;
    private String Sdept;

    public Student() {
    }

    public Student(String sname, String ssex, Integer sage, String sdept) {
        Sname = sname;
        Ssex = ssex;
        this.sage = sage;
        Sdept = sdept;
    }

    public Student(Integer sno, String sname, String ssex, Integer sage, String sdept) {
        Sno = sno;
        Sname = sname;
        Ssex = ssex;
        this.sage = sage;
        Sdept = sdept;
    }

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSdept() {
        return Sdept;
    }

    public void setSdept(String sdept) {
        Sdept = sdept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno=" + Sno +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Ssex + '\'' +
                ", sage=" + sage +
                ", Sdept='" + Sdept + '\'' +
                '}';
    }
}
