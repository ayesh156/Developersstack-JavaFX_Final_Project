package com.developersstack.edumanage.view.tm;

import javafx.scene.control.Button;

public class ProgramTm {
    String code;
    String name;
    String teacher;
    double cost;
    Button btnTech;
    Button btn;

    public ProgramTm() {
    }

    public ProgramTm(String code, String name, String teacher, double cost, Button btnTech, Button btn) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.cost = cost;
        this.btnTech = btnTech;
        this.btn = btn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Button getBtnTech() {
        return btnTech;
    }

    public void setBtnTech(Button btnTech) {
        this.btnTech = btnTech;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "ProgramTm{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", cost=" + cost +
                ", btnTech=" + btnTech +
                ", btn=" + btn +
                '}';
    }
}
