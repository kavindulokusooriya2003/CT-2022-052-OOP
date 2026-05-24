package question_05;

public class Course {

    private String courseName;
    private String courseCode;
    private Lecture lecturer;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecture getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecture lecturer) {
        this.lecturer = lecturer;
    }
}
