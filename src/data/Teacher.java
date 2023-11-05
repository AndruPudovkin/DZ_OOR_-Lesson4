package data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId=teacherId;
    }
    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);

    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
