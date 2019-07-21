package cn.wuxi.js.lib4.modules.base.entity;

import cn.wuxi.js.lib4.common.utils.excel.annotation.ExcelField;

/**
 * Created by aaronhuang on 2019/6/27.
 */
public class ImportPersonCert implements  java.io.Serializable{

    private static final long serialVersionUID = 1L;

    @ExcelField(title = "序号", sort = 0)
    private String no;

    @ExcelField(title = "姓名", sort = 1)
    private String name;

    @ExcelField(title = "性别", sort = 2)
    private String gendar;

    @ExcelField(title = "有效证件号", sort = 3)
    private String idCard;

    @ExcelField(title = "所在单位", sort = 4)
    private String corpName;

    @ExcelField(title = "考勤", sort = 5)
    private Double learningTime;

    @ExcelField(title = "成绩", sort = 6)
    private String score;

    @ExcelField(title = "实习单", sort = 7)
    private String practiceSheet;

    @ExcelField(title = "总成绩", sort = 8)
    private String scoreLevel;

    @ExcelField(title = "证书编号", sort = 9)
    private String certNo;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public Double getLearningTime() {
        return learningTime;
    }

    public void setLearningTime(Double learningTime) {
        this.learningTime = learningTime;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getPracticeSheet() {
        return practiceSheet;
    }

    public void setPracticeSheet(String practiceSheet) {
        this.practiceSheet = practiceSheet;
    }

    public String getScoreLevel() {
        return scoreLevel;
    }

    public void setScoreLevel(String scoreLevel) {
        this.scoreLevel = scoreLevel;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    @Override
    public String toString() {
        return "ImportPersonCert{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", gendar='" + gendar + '\'' +
                ", idCard='" + idCard + '\'' +
                ", corpName='" + corpName + '\'' +
                ", learningTime=" + learningTime +
                ", score=" + score +
                ", practiceSheet='" + practiceSheet + '\'' +
                ", scoreLevel='" + scoreLevel + '\'' +
                ", certNo='" + certNo + '\'' +
                '}';
    }
}
