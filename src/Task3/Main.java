package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //int [] array_of_students = new int[10];
        //int [] array_of_teachers = new int[5];

        // Courses
        String course_A = "Math";
        String course_B = "Geography";
        String course_C = "German";
        String course_D = "Religion";
        String course_E = "Latin";
        String course_F = "Philosophy";
        String course_G = "Psychology";
        String course_H = "Italian";
        String course_I = "Java 1.0";


        // Students' passed courses

        ArrayList<String> passed_courses_student_A = new ArrayList<>(Arrays.asList(course_A, course_B, course_C));
        ArrayList<String> passed_courses_student_B = new ArrayList<>(Arrays.asList(course_A, course_D, course_G));
        ArrayList<String> passed_courses_student_C = new ArrayList<>(Arrays.asList(course_G, course_C, course_D, course_I));
        ArrayList<String> passed_courses_student_D = new ArrayList<>(Arrays.asList(course_E, course_F, course_A));
        ArrayList<String> passed_courses_student_E = new ArrayList<>(Arrays.asList(course_B, course_C, course_D, course_I));


        // Students
        Student student_A = new Student("Tobias", passed_courses_student_A);
        Student student_B = new Student("Jonas", passed_courses_student_B);
        Student student_C = new Student("Finn", passed_courses_student_C);
        Student student_D = new Student("Lykke", passed_courses_student_D);
        Student student_E = new Student("Pernille", passed_courses_student_E);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student_A, student_B, student_C, student_D, student_E));



        // Teachers' can-teach coruses
        ArrayList<String> can_teach_courses_teacher_A = new ArrayList<>(Arrays.asList(course_B, course_C, course_G, course_I));
        ArrayList<String> can_teach_courses_teacher_B = new ArrayList<>(Arrays.asList(course_A, course_D, course_F));
        ArrayList<String> can_teach_courses_teacher_C = new ArrayList<>(Arrays.asList(course_H, course_C, course_F));


        // Teachers
        Teacher teacher_A = new Teacher("Hume", can_teach_courses_teacher_A);
        Teacher teacher_B = new Teacher("Nietzsche", can_teach_courses_teacher_B);
        Teacher teacher_C = new Teacher("Fodor", can_teach_courses_teacher_C);

        ArrayList<Teacher> teachers = new ArrayList<>(Arrays.asList(teacher_A, teacher_B, teacher_C));

        ArrayList<Person> teachers_and_students = new ArrayList<>();


        for (Teacher teacher: teachers) {

            teachers_and_students.add(teacher);

        }
        for (Student student: students) {

            teachers_and_students.add(student);

        }


        for (Person teacher_or_student: teachers_and_students){

            teacher_or_student.addCourse(course_H);
            teacher_or_student.addCourse(course_A);
            teacher_or_student.addCourse(course_I);

            System.out.println(teacher_or_student);

        }





    }
}
