package question_05;

public class Main {

    public static void main(String[] args) {

        Lecture lecturer = new Lecture();
        lecturer.setLecturerName("Mr. Perera");
        lecturer.setCourseTeaching("OOP");

        Course course = new Course();
        course.setCourseName("Object Oriented Programming");
        course.setCourseCode("CT202");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Kavindu");
        student.setDegreeName("Computer Technology");
        student.setCourseFollowing("OOP");

        System.out.println("Course Name: "
                + course.getCourseName());

        System.out.println("Course Code: "
                + course.getCourseCode());

        System.out.println("Lecturer: "
                + course.getLecturer().getLecturerName());

        System.out.println("Student Name: "
                + student.getStudentName());
    }
}
