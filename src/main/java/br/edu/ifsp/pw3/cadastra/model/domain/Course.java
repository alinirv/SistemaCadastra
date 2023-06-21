package br.edu.ifsp.pw3.cadastra.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Course {

    @Column(name = "idCourse", nullable = false, unique = true)
    private Integer idCourse;

    @Column(name = "timeCourse", nullable = false)
    private String timeCourse;

    @Column(name = "categoryCourse", nullable = false)
    private String categoryCourse;

    @Column(name = "descriptionCourse", nullable = false)
    private String descriptionCourse;


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
