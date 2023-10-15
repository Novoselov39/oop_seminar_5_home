package oop.seminar_5.oop_seminar_5_home.data;

import java.util.List;

public class StudyGroup {
    private int groupId;
    private Teacher teacher;
    private List<User> studentList;
    public StudyGroup(int groupId, Teacher teacher, List<User> studentList) {
        this.groupId = groupId;
        this.teacher = teacher;
        this.studentList = studentList;
    }
    public int getGroupId() {
        return groupId;
    }
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public List<User> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }
    @Override
    public String toString() {
        return "StudentGroup [groupId=" + groupId + ", teacher=" + teacher.getFirstName() + "]";
    }
    
    

    

    
}
