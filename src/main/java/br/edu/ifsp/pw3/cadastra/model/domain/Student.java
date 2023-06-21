package br.edu.ifsp.pw3.cadastra.model.domain;

public class Student {
    private Integer idStudent;
    private String nameStudent;
    private String dateBirthStudent;

    public Student() {
    }

    public Student(Integer idStudent, String nameStudent, String dateBirthStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.dateBirthStudent = dateBirthStudent;
    }
    
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
    public String getDateBirthStudent() {
        return dateBirthStudent;
    }
    public void setDateBirthStudent(String dateBirthStudent) {
        this.dateBirthStudent = dateBirthStudent;
    }
}
