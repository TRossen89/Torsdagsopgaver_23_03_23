package Task3;

import java.util.ArrayList;

public class Student extends Person {


    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses) {

        super(name);

        this.passedCourses = passedCourses;

        this.currentCourses = new ArrayList<>();

    }

    @Override
    public boolean addCourse(String course) {

        for (String passed_course: passedCourses){

            if (passed_course.equals(course)){
                System.out.println(super.getName() + " tried to take " + course + " but " + super.getName()
                        + " has already passed " + course);
                return false;
            }

        }

        currentCourses.add(course);

        return true;
    }

    public ArrayList<String> getPassedCourses() {
        return passedCourses;
    }

    public void setPassedCourses(ArrayList<String> passedCourses) {
        this.passedCourses = passedCourses;
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(ArrayList<String> currentCourses) {
        this.currentCourses = currentCourses;
    }

    @Override
    public String toString() {



        String s = super.toString() + "Teacher or student: Student\nPassed courses: " +  getPassedCourses() + "\n" + "Current courses: " +
                getCurrentCourses() + "\n";

        return s;
    }
}
