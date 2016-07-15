package com.tf56.sonar.marketing.standard.domain.defaults;

import java.util.List;

import com.tf56.sonar.marketing.standard.domain.CheckLogic;
import com.tf56.sonar.marketing.standard.domain.Rule;
import com.tf56.sonar.marketing.standard.domain.Standard;

public class DefaultRule implements Rule {

    private static final long serialVersionUID = -8605004244434645266L;

    private String           name;
    private String           desc;
    private String           code;
    private Standard         standard;
    private List<CheckLogic> checkLogics;

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

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public List<CheckLogic> getCheckLogics() {
        return checkLogics;
    }

    public void setCheckLogics(List<CheckLogic> checkLogics) {
        this.checkLogics = checkLogics;
    }
}
