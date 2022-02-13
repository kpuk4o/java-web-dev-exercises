package exercises.Chapter4.school;

public class Student {

    public static void main(String[] args) {
        Student myself = new Student("Dimitar", 30, 1, 4.0);
        String myGradeLevel = myself.getGradeLevel();
    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        //quality score = letter grade * number of credits
        //total quality score
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        double newQualityScore = grade * courseCredits;

        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;

        double newGpa = newQualityScore / newTotalNumberOfCredits;
        this.gpa = newGpa;

    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        // Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)

        if (this.numberOfCredits >= 0 && this.numberOfCredits <=29) {
            return "Freshman";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits <=59) {
            return "Sophomore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <=89) {
            return "Junior";
        } else if (this.numberOfCredits >= 90) {
            return "Senior";
        } else {
            return null;
        }

    }

    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Student) == false) return false;
        Student myStundentobj = (Student) obj;
        if (myStundentobj.name.equals(this.name)) return true;
        else return false;
    }

    /* getters and setters omitted */

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentId() {
        return this.studentId;
    }
    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}