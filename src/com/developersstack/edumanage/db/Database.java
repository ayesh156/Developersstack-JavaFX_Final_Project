package com.developersstack.edumanage.db;

import com.developersstack.edumanage.model.Program;
import com.developersstack.edumanage.model.Student;
import com.developersstack.edumanage.model.Teacher;
import com.developersstack.edumanage.model.User;
import com.developersstack.edumanage.util.security.PasswordManager;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> userTable = new ArrayList();
    public static ArrayList<Student> studentTable = new ArrayList();

    public static ArrayList<Teacher> teacherTable = new ArrayList();
    public static ArrayList<Program> programTable = new ArrayList();

    static {
        userTable.add(
             new User("Ayesh","Chathuranga","a@gmail.com",new PasswordManager().encrypt("1234"))
        );
    }

}
