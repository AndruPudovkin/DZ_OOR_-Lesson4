package controller;

import data.Teacher;
import service.TeacherService;
import view.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    public List<Teacher> getAllTeachers(){
        return teacherService.getAll();
    }
    public void printAllTeacher(){
        teacherView.sendOnConsole(getAllTeachers());
    }
}
