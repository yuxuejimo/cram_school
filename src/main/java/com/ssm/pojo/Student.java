package com.ssm.pojo;

public class Student {
    private Integer stuId;

    private String stuName;

    private String stuSex;

    private String stuNation;

    private Integer stuAge;

    private String stuAddress;

    private Integer stuNum;

    private String stuIdnumber;

    private String stuImg;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuNation() {
        return stuNation;
    }

    public void setStuNation(String stuNation) {
        this.stuNation = stuNation == null ? null : stuNation.trim();
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress == null ? null : stuAddress.trim();
    }

    public Integer getStuNum() {
        return stuNum;
    }

    public void setStuNum(Integer stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuIdnumber() {
        return stuIdnumber;
    }

    public void setStuIdnumber(String stuIdnumber) {
        this.stuIdnumber = stuIdnumber == null ? null : stuIdnumber.trim();
    }

    public String getStuImg() {
        return stuImg;
    }

    public void setStuImg(String stuImg) {
        this.stuImg = stuImg == null ? null : stuImg.trim();
    }

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuSex="
				+ stuSex + ", stuNation=" + stuNation + ", stuAge=" + stuAge
				+ ", stuAddress=" + stuAddress + ", stuNum=" + stuNum
				+ ", stuIdnumber=" + stuIdnumber + ", stuImg=" + stuImg + "]";
	}
    
    
}