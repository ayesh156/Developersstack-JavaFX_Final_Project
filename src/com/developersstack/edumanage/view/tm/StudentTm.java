package com.developersstack.edumanage.view.tm;

import javafx.scene.control.Button;

import java.util.Date;

public class StudentTm {
    private String studentId;
    private String fullName;
    private String dob;
    private String address;
    private Button btn; /* javafx */

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public StudentTm() {
    }

    public StudentTm(String studentId, String fullName, String dob, String address, Button btn) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "StudentTm{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", btn=" + btn +
                '}';
    }
}
