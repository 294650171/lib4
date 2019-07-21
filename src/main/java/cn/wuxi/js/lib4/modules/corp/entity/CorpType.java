package cn.wuxi.js.lib4.modules.corp.entity;

/**
 * Created by aaronhuang on 2019/7/16.
 */
public enum CorpType {
    BUILD("建设单位", "A"),
    SURVEY("勘察单位", "B"),
    DESIGN("设计单位", "C"),
    CONSTRUCT("施工单位", "D"),
    AGENCY("中介机构", "E"),
    OTHERS("其他","F")
    ;

    private String name;
    private String value;

    CorpType(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public static String getName(String value) {
        for (CorpType c : CorpType.values()) {
            if (c.getValue() == value) {
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
