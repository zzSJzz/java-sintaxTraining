package pooIntroducion.student.test;

import pooIntroducion.student.domain.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.name = "Stuart";
        teacher.age = 34;
        teacher.sex = 'M';

        teacher.impressTeacher();
    }
}
