package com.tf56.sonar.marketing.standard.domain.defaults;

import com.tf56.sonar.marketing.standard.domain.Data;
import com.tf56.sonar.marketing.standard.domain.enums.DataTypeEnum;

public class DefaultData implements Data {

    private static final long serialVersionUID = -4732450950346180777L;

    private String name;

    private String code;

    private DataTypeEnum dataType;

    private int length;

    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public DataTypeEnum getDataType() {
        return dataType;
    }

}
