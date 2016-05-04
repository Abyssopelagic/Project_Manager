package com.example.ksbay.project_manager;

/**
 * Created by Keenan Baynard on 5/1/2016.
 */
public class Member {
    protected String fname;
    protected String lname;

    public Member(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    public String getFname()
    {
        return fname;
    }
    public String getLname()
    {
        return lname;
    }
}
