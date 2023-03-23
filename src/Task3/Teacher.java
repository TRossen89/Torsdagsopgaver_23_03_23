package Task3;

import java.util.ArrayList;

public class Teacher extends Person {


    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();

    }

    @Override
    public boolean addCourse(String course) {

        for (String course_teacher_can_teac: canTeach) {

            if (course_teacher_can_teac.equals(course)){

                currentCourses.add(course);
                return true;

            }

        }

        System.out.println("The teacher can't teach " + course);
        return false;
    }


    public ArrayList<String> getCanTeach() {
        return canTeach;
    }

    public void setCanTeach(ArrayList<String> canTeach) {
        this.canTeach = canTeach;
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(ArrayList<String> currentCourses) {
        this.currentCourses = currentCourses;
    }

    @Override
    public String toString() {

        String s = super.toString() + "Teacher or student: Teacher\nCan teach courses: " +  getCanTeach() + "\n" + "Current courses: " +
                getCurrentCourses() + "\n";

        return s;
    }
}
