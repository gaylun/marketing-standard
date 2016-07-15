package com.tf56.sonar.marketing.standard.domain;

import java.io.Serializable;

import com.tf56.sonar.marketing.standard.domain.enums.OperatorEnum;

public class Expression implements Serializable {

    private static final long serialVersionUID = -6364615688804207194L;

    private OperatorEnum operator;

    private Object value;

    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
