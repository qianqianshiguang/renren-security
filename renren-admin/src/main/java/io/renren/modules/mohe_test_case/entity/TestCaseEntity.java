package io.renren.modules.mohe_test_case.entity;


import java.util.Date;

/**
 * @author zhiqiang.zhou
 * @email zhiqiang.zhou@tongdun.cn
 * @date 2019/01/04 15:38
 */
public class TestCaseEntity {
    //id编号
    private Integer id;
    //测试用例编号
    private String caseId;
    //测试用例名称
    private String caseName;
    //所属应用
    private String application;
    //前置条件
    private String precondition;
    //所属功能（或版本）
    private String subordinate;
    //入参
    private String param;
    //操作步骤
    private String steps;
    //预期结果
    private String expectResult;
    //等级
    private String caseLevel;
    //所属api
    private String api;
    //执行类型
    private Integer executeType;
    //是否删除
    private Integer isDelete;
    //作者
    private String author;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //是否冒烟用例
    private Integer isSmokeCase;

    /**
     * get\set方法
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getPrecondition() {
        return precondition;
    }

    public void setPrecondition(String precondition) {
        this.precondition = precondition;
    }

    public String getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(String subordinate) {
        this.subordinate = subordinate;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getExpectResult() {
        return expectResult;
    }

    public void setExpectResult(String expectResult) {
        this.expectResult = expectResult;
    }

    public String getCaseLevel() {
        return caseLevel;
    }

    public void setCaseLevel(String caseLevel) {
        this.caseLevel = caseLevel;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Integer getExecuteType() {
        return executeType;
    }

    public void setExecuteType(Integer executeType) {
        this.executeType = executeType;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public Integer getIsSmokeCase() {
        return isSmokeCase;
    }

    public void setIsSmokeCase(Integer isSmokeCase) {
        this.isSmokeCase = isSmokeCase;
    }



}
