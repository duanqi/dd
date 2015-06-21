package com.dd.myapp.modules.base.dto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.ListUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.dd.myapp.common.constants.UserConstant;
import com.dd.myapp.modules.base.entity.School;
import com.dd.myapp.modules.base.service.SchoolPackageService;
import com.dd.myapp.modules.base.service.UserSchoolRegisterService;

/**
 * 驾校列表信息
 * 
 * @author duanqi25@gmail.com
 * @createDate 2015年6月20日
 * 
 */
@Service("schoolList")
public class SchoolList {

    @Resource
    private UserSchoolRegisterService userSchoolRegisterService;

    @Resource
    private SchoolPackageService schoolPackageService;

    // 驾校ID
    private Long id;

    // 驾校名称
    private String name;

    // 图片
    private String banner;

    // 点评星级
    private Integer star;

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
        this.banner = banner;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    /**
     * 把驾校详细信息转为列表信息
     * 
     * @param schools
     * @return
     */
    public List<SchoolList> ofList(List<School> schools) {
        List<SchoolList> result = ListUtils.EMPTY_LIST;
        if (!CollectionUtils.isEmpty(schools)) {
            result = new ArrayList<SchoolList>();
            for (School school : schools) {
                SchoolList schoolList = new SchoolList();
                schoolList.setId(school.getId());
                schoolList.setBanner(school.getBanner());
                schoolList.setName(school.getName());
                schoolList.setStar(0);
                schoolList.setStudentNum(userSchoolRegisterService.getRegisterCount(school.getId(),
                        UserConstant.STUDENT));
                schoolList.setPacakgeMinValue(schoolPackageService.getMinValue(school.getId()));
                result.add(schoolList);
            }
        }
        return result;
    }
}