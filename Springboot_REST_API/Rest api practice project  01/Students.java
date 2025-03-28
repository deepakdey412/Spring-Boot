package com.example.model;

public class Students {
    private String student_id;
    private String student_name;
    private String student_email;
    private long student_phone_no;

    // ✅ Default Constructor (Required for JSON Deserialization)
    public Students() {
    }

    // ✅ Parameterized Constructor
    public Students(String student_id, String student_name, String student_email, long student_phone_no) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_email = student_email;
        this.student_phone_no = student_phone_no;
    }

    // ✅ Getters and Setters
    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public long getStudent_phone_no() {
        return student_phone_no;
    }

    public void setStudent_phone_no(long student_phone_no) {
        this.student_phone_no = student_phone_no;
    }
}
