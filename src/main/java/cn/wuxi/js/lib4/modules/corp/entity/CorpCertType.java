package cn.wuxi.js.lib4.modules.corp.entity;

/**
 * Created by aaronhuang on 2019/7/16.
 */
public enum CorpCertType {
    JZSG("建筑施工", 1),
    YTH("设计与施工一体化", 2),
    YLLH("园林绿化", 3),
    GCJL("工程监理", 4),
    GCKC("工程勘察", 5),
    GCSJ("工程设计",6),
    ZBDL("招标代理",7),
    ZJZX("造价咨询",8),
    GCJC("工程检测",9),
    GYS("供应商",10),
    FDCKF("房地产开发",11),
    JSDWQT("建设单位其它",12),
    FWCQ("房屋拆迁",13),
    AQSCXKZ("安全生产许可证",14),
    SGTSC("施工图审查",15),
    FDCGJ("房地产估价",16),
    WYFW("物业服务",17),
    CSGH("城市规划",18),
    WSCSGH("外商城市规划",19)
    ;

    private String name;
    private int index;

    CorpCertType(String name, int value) {
        this.name = name;
        this.index = value;
    }

    public static String getName(int index) {
        for (CorpCertType c : CorpCertType.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
