package OOPS;

// Abstract Class
abstract class Course {
    private String courseName;
    private String courseCode;

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    String getCourseName() {
        return courseName;
    }

    String getCourseCode() {
        return courseCode;
    }

    abstract void calculateGrade();
}

// Theory Course
class TheoryCourse extends Course {
    private int internalMarks;
    private int externalMarks;

    TheoryCourse(String courseName, String courseCode,
                 int internalMarks, int externalMarks) {
        super(courseName, courseCode);
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    @Override
    void calculateGrade() {
        double total = (internalMarks * 0.4) +
                       (externalMarks * 0.6);

        System.out.println("Course: " + getCourseName());
        System.out.println("Code: " + getCourseCode());
        System.out.println("Theory Grade Score: " + total);
    }
}

// Lab Course
class LabCourse extends Course {
    private int performanceScore;
    private int attendance;

    LabCourse(String courseName, String courseCode,
              int performanceScore, int attendance) {
        super(courseName, courseCode);
        this.performanceScore = performanceScore;
        this.attendance = attendance;
    }

    @Override
    void calculateGrade() {
        double total = (performanceScore * 0.8) +
                       (attendance * 0.2);

        System.out.println("Course: " + getCourseName());
        System.out.println("Code: " + getCourseCode());
        System.out.println("Lab Grade Score: " + total);
    }
}

// Main Class
public class AcademicGradingSystem {
    public static void main(String[] args) {

        TheoryCourse theory =
                new TheoryCourse("Data Structures",
                        "CS201", 85, 90);

        LabCourse lab =
                new LabCourse("Java Lab",
                        "CS202L", 95, 90);

        theory.calculateGrade();

        System.out.println();

        lab.calculateGrade();
    }
}