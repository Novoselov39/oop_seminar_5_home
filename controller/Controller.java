package oop.seminar_5.oop_seminar_5_home.controller;


import java.util.ArrayList;
import java.util.List;

import oop.seminar_5.seminar_5_practica.view.StudentView;
import oop.seminar_5.seminar_5_practica.view.StudyGroupView;
import oop.seminar_5.seminar_5_practica.view.TeacherView;
import oop.seminar_5.seminar_5_practica.data.Student;
import oop.seminar_5.seminar_5_practica.data.StudyGroup;
import oop.seminar_5.seminar_5_practica.data.Teacher;
import oop.seminar_5.seminar_5_practica.data.Type;
import oop.seminar_5.seminar_5_practica.data.User;
import oop.seminar_5.seminar_5_practica.service.DatatServise;
import oop.seminar_5.seminar_5_practica.service.StudyGroupServise;


public class Controller {
    private final DatatServise service = new DatatServise();
    private final StudyGroupServise serviceGroup = new StudyGroupServise();
    private final StudyGroupView studyGroupView = new StudyGroupView();
    private final StudentView studentView = new StudentView(); 
    private final TeacherView teacherView = new TeacherView(); 

    public void createStudent(String firstName, String secondName, String lastName, String dateB){
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }
    public void createTeaccher(String firstName, String secondName, String lastName, String dateB){
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public void createGroup(int teacherId, List<Integer> studenIdtList){
        List<User> studentList = new ArrayList<>();
        for (User user : DatatServise.getAllStudent()) {
            for (Integer studentId : studenIdtList) {
                if (studentId==((Student)user).getStudentId()){
                    studentList.add(user);
                }
            }
        }

        serviceGroup.createGroup(((Teacher)DatatServise.getUserById(Type.TEACHER, teacherId)), studentList);
    }
    public void getAllGroup(){
        List<StudyGroup> groupList = serviceGroup.getAllGroup();
        for (StudyGroup studyGroup : groupList) {
            studyGroupView.printOnConsole(studyGroup);
            
        }
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        
        for (User user : userList) {
            studentView.printOnConsole((Student)user);
            
        }       

    }
    public void getAllTeachers(){
        List<User> userList = service.getAllTeachers();
        
        for (User user : userList) {
            teacherView.printOnConsole((Teacher)user);
            
        }       

    }
    
}
