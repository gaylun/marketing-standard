package com.tf56.sonar.marketing.standard.domain.enums;

public enum OperatorEnum {

    EQ("==", "等于"), NOTEQ("!=", "不等于"), GT(">", "大于"), LT("<", "小于"), GE(">=", "大于等于"), LE("<=", "小于等于"), IN("in", "在列表中"),
                          NOTIN("not in", "不在列表中");

    private String symbol;
    private String desc;

    private OperatorEnum(String symbol, String desc){
        this.symbol = symbol;
        this.desc = desc;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
