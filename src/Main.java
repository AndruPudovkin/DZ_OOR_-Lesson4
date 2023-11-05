import controller.TeacherController;
import data.Student;

public class Main {
    public static void main(String[] args){
        TeacherController teacherController = new TeacherController();
        teacherController.create("1", "1", "1");
        teacherController.create("2", "2", "2");
        teacherController.create("3", "3", "3");
        teacherController.create("4", "4", "4");
        teacherController.printAllTeacher();


    }
}
