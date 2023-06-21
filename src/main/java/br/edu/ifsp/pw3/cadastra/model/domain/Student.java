package br.edu.ifsp.pw3.cadastra.model.domain;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Student extends AbstractEntity<Long>{

    @Column(name = "idStudent", nullable = false, unique = true)
    private Integer idStudent;

    @Column(name = "nameStudent", nullable = false, unique = false)
    private String nameStudent;

    @Column(name = "dateBirthStudent", nullable = false)
    private Date dateBirthStudent;


    public Integer getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }
    public String getNameStudent() {
        return nameStudent;
    }
    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }
    public Date getDateBirthStudent() {
        return dateBirthStudent;
    }
    public void setDateBirthStudent(Date dateBirthStudent) {
        this.dateBirthStudent = dateBirthStudent;
    }
}
