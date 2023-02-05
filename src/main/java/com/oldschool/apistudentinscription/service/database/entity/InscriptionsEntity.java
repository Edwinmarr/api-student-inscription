package com.oldschool.apistudentinscription.service.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class InscriptionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date-sent-request")
    private LocalDateTime dateSentRequest;
    @Column(name = "aspiring-grade")
    private String aspiringGrade;
    @Column(name = "campus")
    private String campus;
    @Column(name = "student_id")
    private Long studentId;
    @Column(name = "attendant_id")
    private Long attendantId;
    @Column(name = "requirements-fulfilled")
    private Boolean requirementsFulfilled;
    @Column(name = "verified")
    private Boolean verified;
    @Column(name = "approved")
    private Boolean approved;
    @Column(name = "observations")
    private String observations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getAttendantId() {
        return attendantId;
    }

    public void setAttendantId(Long attendantId) {
        this.attendantId = attendantId;
    }

    public Boolean getRequirementsFulfilled() {
        return requirementsFulfilled;
    }

    public void setRequirementsFulfilled(Boolean requirementsFulfilled) {
        this.requirementsFulfilled = requirementsFulfilled;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
