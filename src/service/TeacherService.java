package service;

import data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String lastName ) {
        int maxId = 0;
        for (Teacher teacher: teachers){
            if (maxId < teacher.getTeacherId()){
                maxId = teacher.getTeacherId();
            }
        }
        Teacher teacher = new Teacher(firstName, secondName,lastName, ++maxId);
        teachers.add(teacher);
    }
}
