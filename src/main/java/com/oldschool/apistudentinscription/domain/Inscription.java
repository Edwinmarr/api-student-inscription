package com.oldschool.apistudentinscription.domain;

import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

public class Inscription {
    private LocalDateTime dateSentRequest;
    private String aspiringGrade;
    private String campus;
    private Attendant attendant;
    private Student student;
    private MultipartFile finalYearGradeReport;
    private MultipartFile studentIdentificationPhoto;
    private Boolean requirementsFullfiled;
    private Boolean verified;
    private Boolean aproved;
    private String observations;

    public LocalDateTime getDateSentRequest() {
        return dateSentRequest;
    }

    public void setDateSentRequest(LocalDateTime dateSentRequest) {
        this.dateSentRequest = dateSentRequest;
    }

    public String getAspiringGrade() {
        return aspiringGrade;
    }

    public void setAspiringGrade(String aspiringGrade) {
        this.aspiringGrade = aspiringGrade;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Attendant getAttendand() {
        return attendant;
    }

    public void setAttendand(Attendant attendant) {
        this.attendant = attendant;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public MultipartFile getFinalYearGradeReport() {
        return finalYearGradeReport;
    }

    public void setFinalYearGradeReport(MultipartFile finalYearGradeReport) {
        this.finalYearGradeReport = finalYearGradeReport;
    }

    public MultipartFile getStudentIdentificationPhoto() {
        return studentIdentificationPhoto;
    }

    public void setStudentIdentificationPhoto(MultipartFile studentIdentificationPhoto) {
        this.studentIdentificationPhoto = studentIdentificationPhoto;
    }

    public Boolean getRequirementsFullfiled() {
        return requirementsFullfiled;
    }

    public void setRequirementsFullfiled(Boolean requirementsFullfiled) {
        this.requirementsFullfiled = requirementsFullfiled;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Boolean getAproved() {
        return aproved;
    }

    public void setAproved(Boolean aproved) {
        this.aproved = aproved;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
