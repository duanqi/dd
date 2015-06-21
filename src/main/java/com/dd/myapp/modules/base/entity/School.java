package com.dd.myapp.modules.base.entity;

import java.util.Date;

public class School {
    private Long id;

    private Long parentId;

    private String name;

    private String banner;

    private String telphone;

    private String address;

    private String features;

    private String serviceAim;

    private Short type;

    private Long teacherNum;

    private String learnPeriod;

    private Boolean isPrivateTrain;

    private Long cityId;

    private Date createTime;

    private Date modifyTime;

    private Boolean deleted;

    // 最小套餐价格
    private Double pacakgeMinValue;
    
    // 学员报名数
    private Integer studentNum;

    public Integer getStudents() {
        return studentNum;
    }

    public void setStudents(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public Double getPacakgeMinValue() {
        return pacakgeMinValue;
    }

    public void setPacakgeMinValue(Double pacakgeMinValue) {
        this.pacakgeMinValue = pacakgeMinValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner == null ? null : banner.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features == null ? null : features.trim();
    }

    public String getServiceAim() {
        return serviceAim;
    }

    public void setServiceAim(String serviceAim) {
        this.serviceAim = serviceAim == null ? null : serviceAim.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Long getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(Long teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getLearnPeriod() {
        return learnPeriod;
    }

    public void setLearnPeriod(String learnPeriod) {
        this.learnPeriod = learnPeriod == null ? null : learnPeriod.trim();
    }

    public Boolean getIsPrivateTrain() {
        return isPrivateTrain;
    }

    public void setIsPrivateTrain(Boolean isPrivateTrain) {
        this.isPrivateTrain = isPrivateTrain;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
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
}