package com.tf56.sonar.marketing.standard.domain.defaults;

import java.util.List;

import com.tf56.sonar.marketing.standard.domain.Standard;

public class DefaultStandard<Field> implements Standard {

    private static final long serialVersionUID = 6558313155061077745L;

    private String      name;
    private String      desc;
    private String      code;
    private String      version;
    private List<Field> fields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
