package oop.seminar_5.oop_seminar_5_home.service;

import java.util.ArrayList;
import java.util.List;

import oop.seminar_5.seminar_5_practica.data.Student;
import oop.seminar_5.seminar_5_practica.data.Teacher;
import oop.seminar_5.seminar_5_practica.data.Type;
import oop.seminar_5.seminar_5_practica.data.User;



public class DatatServise {
    private static List<User> userList = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, String dateB, Type type){

        int id = getFreeId(type);
        if(Type.STUDENT==type){

            Student student = new Student(firstName, secondName, lastName, dateB, id);
            userList.add(student);

        }

        if(Type.TEACHER==type){

            Teacher teacher = new Teacher(firstName, secondName, lastName, dateB, id);
            userList.add(teacher);

        }

    }

    public static User getUserById(Type type, int id){
        boolean itsStudent = Type.STUDENT==type;
        for (User user : userList) {
            if(user instanceof Teacher && !itsStudent && ((Teacher)user).getTeacherId() == id){
                return user;
            }
            if(user instanceof Student && itsStudent && ((Student)user).getStudentId() == id){
                return user;
            }
            
            
            
        }
        return null; 
    }

    public List<User> getAllUser(){
        return userList;
    }  

    public static  List<User> getAllStudent(){
        List<User> result = new ArrayList<>();
        
        for (User user : userList) {
            if (user instanceof Student) {
                result.add(user);
            }
            
        }

        return result;
    } 
    
    public static List<User> getAllTeachers(){
        List<User> result = new ArrayList<>();
        
        for (User user : userList) {
            if (user instanceof Teacher) {
                result.add(user);
            }
            
        }

        return result;
    } 

    private int getFreeId(Type type){
        boolean itsStudent = Type.STUDENT==type;
        int lastId = 1;
        for (User user : userList) {
            if(user instanceof Teacher && !itsStudent){
                lastId = ((Teacher)user).getTeacherId()+1;
            }
            if(user instanceof Student && itsStudent){
                lastId = ((Student)user).getStudentId()+1;
            }
            
        }

        return lastId;
    }

}
