package oop.seminar_5.oop_seminar_5_home.service;

import java.util.ArrayList;
import java.util.List;

import oop.seminar_5.seminar_5_practica.data.User;
import oop.seminar_5.seminar_5_practica.data.Student;
import oop.seminar_5.seminar_5_practica.data.Teacher;
import oop.seminar_5.seminar_5_practica.data.StudyGroup;


public class StudyGroupServise {
    private List<StudyGroup> groupList = new ArrayList<>();
    
    public void createGroup(Teacher teacher, List<User> studentList){
        int lastId = 0;
        for (StudyGroup group : groupList) {
            if (group.getGroupId()>lastId){
                lastId=group.getGroupId();
            }
                        
        }
        lastId++;
        StudyGroup studyGroup = new StudyGroup(lastId, teacher, studentList);
        groupList.add(studyGroup);
        
    }
    public StudyGroup getGroupById(List<StudyGroup> groupList, int groupId){
        for (StudyGroup group : groupList) {
            if(group.getGroupId()==groupId){
                return group;
            }
            
        }
        return null;
    }
    public List<StudyGroup> getAllGroup(){
        return groupList;

    } 

    

    
}
