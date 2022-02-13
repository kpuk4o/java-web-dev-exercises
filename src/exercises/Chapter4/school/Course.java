package exercises.Chapter4.school;

import java.util.ArrayList;

public class Course {
    //at least 3 fields
    //name
    private String name;
    //student list
    private ArrayList<Student> students;
    //how many credits do you get
    private int numberOfCredits;

    //Constructors
    public Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " is worth " + this.numberOfCredits + "number of Credits";
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course) == false) return false;
        Course myCouirseobj = (Course) obj;
        if (myCouirseobj.name.equals(this.name)) return true;
        else return false;
    }
}
