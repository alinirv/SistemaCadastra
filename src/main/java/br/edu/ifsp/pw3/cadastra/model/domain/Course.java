package br.edu.ifsp.pw3.cadastra.model.domain;

public class Course {
    private Integer idCourse;
    private String timeCourse;
    private String categoryCourse;
    private String descriptionCourse;

    public Course() {
    }

    public Course(Integer idCourse, String timeCourse, String categoryCourse, String descriptionCourse) {
        this.idCourse = idCourse;
        this.timeCourse = timeCourse;
        this.categoryCourse = categoryCourse;
        this.descriptionCourse = descriptionCourse;
    }

    public Integer getIdCourse() {
        return idCourse;
    }
    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }
    public String getTimeCourse() {
        return timeCourse;
    }
    public void setTimeCourse(String timeCourse) {
        this.timeCourse = timeCourse;
    }
    public String getCategoryCourse() {
        return categoryCourse;
    }
    public void setCategoryCourse(String categoryCourse) {
        this.categoryCourse = categoryCourse;
    }
    public String getDescriptionCourse() {
        return descriptionCourse;
    }
    public void setDescriptionCourse(String descriptionCourse) {
        this.descriptionCourse = descriptionCourse;
    }
}
