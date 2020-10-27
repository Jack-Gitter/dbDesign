package jdbc.models;

public class Course {

  private Integer id;
  private String title;

  public Integer getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Course() {

  }

  public Course(Integer id, String title) {
    this.id = id;
    this.title = title;
  }

  public String toString() {
    return this.id + "," + this.title;
  }
}
