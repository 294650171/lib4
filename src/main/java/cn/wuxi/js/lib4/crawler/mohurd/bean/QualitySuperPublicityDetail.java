package cn.wuxi.js.lib4.crawler.mohurd.bean;

import java.util.Date;

/**
 * Created by aaronhuang on 2018/9/15.
 */
public class QualitySuperPublicityDetail extends PublicityItem {

    private String projectName; //工程名称
    private String constructionCorp; //施工单位
    private String supervisorCorp; //监理单位
    private String projectManager; //项目经理
    private String projectDirector; //项目总监
    private String qualitySuperDept;//质量监督部门

    private Date regDate; //注册日期
    private Date startDate; //开工日期
    private Date finishDate; //主体分部计划完工日期
    private Date acceptDate; //竣工验收日期

    private String pubUnit; //公示单位
    private Date pubDate; //公示日期

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getConstructionCorp() {
        return constructionCorp;
    }

    public void setConstructionCorp(String constructionCorp) {
        this.constructionCorp = constructionCorp;
    }

    public String getSupervisorCorp() {
        return supervisorCorp;
    }

    public void setSupervisorCorp(String supervisorCorp) {
        this.supervisorCorp = supervisorCorp;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getProjectDirector() {
        return projectDirector;
    }

    public void setProjectDirector(String projectDirector) {
        this.projectDirector = projectDirector;
    }

    public String getQualitySuperDept() {
        return qualitySuperDept;
    }

    public void setQualitySuperDept(String qualitySuperDept) {
        this.qualitySuperDept = qualitySuperDept;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public String getPubUnit() {
        return pubUnit;
    }

    public void setPubUnit(String pubUnit) {
        this.pubUnit = pubUnit;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        return "QualitySuperPublicityDetail{" +
                "projectName='" + projectName + '\'' +
                ", constructionCorp='" + constructionCorp + '\'' +
                ", supervisorCorp='" + supervisorCorp + '\'' +
                ", projectManager='" + projectManager + '\'' +
                ", projectDirector='" + projectDirector + '\'' +
                ", qualitySuperDept='" + qualitySuperDept + '\'' +
                ", regDate=" + regDate +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", acceptDate=" + acceptDate +
                ", pubUnit='" + pubUnit + '\'' +
                ", pubDate=" + pubDate +
                '}';
    }
}
