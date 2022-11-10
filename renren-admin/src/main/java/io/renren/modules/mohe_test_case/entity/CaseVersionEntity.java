package io.renren.modules.mohe_test_case.entity;

import java.util.Date;

public class CaseVersionEntity {
    //id
    private Integer id;
    //版本
    private String version;
    //作者
    private String author;
    //所属应用
    private String application;
    //执行是否通过
    private Integer isPassStatus;
    //用例数量
    private Integer caseCount;
    //是否评审通过
    private Integer isReviewPass;
    //是否删除
    private Integer isDelete;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Integer getIsPassStatus() {
        return isPassStatus;
    }

    public void setIsPassStatus(Integer isPassStatus) {
        this.isPassStatus = isPassStatus;
    }

    public Integer getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
    }

    public Integer getIsReviewPass() {
        return isReviewPass;
    }

    public void setIsReviewPass(Integer isReviewPass) {
        this.isReviewPass = isReviewPass;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }



}
