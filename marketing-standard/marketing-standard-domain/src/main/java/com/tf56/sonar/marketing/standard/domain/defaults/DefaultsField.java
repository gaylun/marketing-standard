package com.tf56.sonar.marketing.standard.domain.defaults;

import com.tf56.sonar.marketing.standard.domain.Data;
import com.tf56.sonar.marketing.standard.domain.Field;

public class DefaultsField implements Field {

    private static final long serialVersionUID = 5398227142222246217L;

    private Data data;

    private boolean required;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }
}
