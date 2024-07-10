package com.developersstack.edumanage.model;

public class Registration {
    String regId;
    String regDate;
    String student;
    String program;
    boolean paymentCompleteness;

    public Registration() {
    }

    public Registration(String regId, String regDate, String student, String program, boolean paymentCompleteness) {
        this.regId = regId;
        this.regDate = regDate;
        this.student = student;
        this.program = program;
        this.paymentCompleteness = paymentCompleteness;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public boolean isPaymentCompleteness() {
        return paymentCompleteness;
    }

    public void setPaymentCompleteness(boolean paymentCompleteness) {
        this.paymentCompleteness = paymentCompleteness;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "regId='" + regId + '\'' +
                ", regDate='" + regDate + '\'' +
                ", student='" + student + '\'' +
                ", program='" + program + '\'' +
                ", paymentCompleteness=" + paymentCompleteness +
                '}';
    }
}
