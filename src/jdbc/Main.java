package jdbc;

import java.util.List;
import jdbc.daos.CourseDao;
import jdbc.models.Course;

public class Main {

  public static void main(String[] args) {

    CourseDao dao = new CourseDao();
    List<Course> courses = dao.findAllCourses();

    for (Course c : courses) {
      System.out.println(c);
    }

    Course course = new Course(123, "CS2222");
    Integer status = dao.updateCourse(123, course);

    courses = dao.findAllCourses();
    for (Course c : courses) {
      System.out.println(c);
    }

    course = dao.findCourseById(123);
    System.out.println(course);

    course = new Course(345, "CS1234");
    status = dao.createCourse(course);
    System.out.println(status);

    course = dao.findCourseById(345);
    System.out.println(course);

  }


}
