package com.tf56.sonar.marketing.standard.domain.defaults;

import com.tf56.sonar.marketing.standard.domain.CheckLogic;
import com.tf56.sonar.marketing.standard.domain.Expression;
import com.tf56.sonar.marketing.standard.domain.Field;

public class DefaultCheckLogic implements CheckLogic {

    private static final long serialVersionUID = -4809539312223869161L;

    private Field      field;
    private Expression expression;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
