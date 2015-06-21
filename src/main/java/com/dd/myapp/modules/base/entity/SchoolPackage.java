package com.dd.myapp.modules.base.entity;

import java.util.Date;

public class SchoolPackage {
    private Long id;

    private Double price;

    private Boolean medicalExam;

    private Boolean reExamFee;

    private Boolean studyShuttle;

    private Boolean examShuttle;

    private Boolean handleTempResd;

    private Long schoolId;

    private Long examGradeId;

    private Date createTime;

    private Date modifyTime;

    private Boolean deleted;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getMedicalExam() {
        return medicalExam;
    }

    public void setMedicalExam(Boolean medicalExam) {
        this.medicalExam = medicalExam;
    }

    public Boolean getReExamFee() {
        return reExamFee;
    }

    public void setReExamFee(Boolean reExamFee) {
        this.reExamFee = reExamFee;
    }

    public Boolean getStudyShuttle() {
        return studyShuttle;
    }

    public void setStudyShuttle(Boolean studyShuttle) {
        this.studyShuttle = studyShuttle;
    }

    public Boolean getExamShuttle() {
        return examShuttle;
    }

    public void setExamShuttle(Boolean examShuttle) {
        this.examShuttle = examShuttle;
    }

    public Boolean getHandleTempResd() {
        return handleTempResd;
    }

    public void setHandleTempResd(Boolean handleTempResd) {
        this.handleTempResd = handleTempResd;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getExamGradeId() {
        return examGradeId;
    }

    public void setExamGradeId(Long examGradeId) {
        this.examGradeId = examGradeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}