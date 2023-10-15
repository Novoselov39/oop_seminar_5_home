package oop.seminar_5.oop_seminar_5_home;




import java.util.ArrayList;
import java.util.List;

import oop.seminar_5.seminar_5_practica.controller.Controller;

public class Main {
    public static void main(String[] args) {
        
        Controller controller = new Controller();
        
    
        controller.createStudent("1","1","1", "1.1.1");
        controller.createStudent("45","2","2", "2.1.1");
 
        controller.createStudent("3","3","3", "3.1.1");
        controller.createStudent("4","4","4", "4.1.1");
        controller.createStudent("5","5","5", "5.1.1");
        controller.createTeaccher("55","55","55", "5.5.1");
        controller.createTeaccher("66","66","66", "6.6.1");
        

        controller.getAllStudent();
        System.out.println("-------------------");
        controller.getAllTeachers();
        List<Integer> studentIdList = new ArrayList<>();
        studentIdList.add(2);
        studentIdList.add(3);
        studentIdList.add(4);
        List<Integer> studentIdList1 = new ArrayList<>();
        studentIdList1.add(1);
        studentIdList1.add(5);
        studentIdList1.add(3);
        System.out.println("-------------------");

        controller.createGroup(2, studentIdList);
        controller.createGroup(1, studentIdList1);
        controller.getAllGroup();
        

        
    }
    
}
