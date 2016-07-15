package com.tf56.sonar.marketing.standard.service.Validate.result;

import java.util.List;

import com.tf56.sonar.marketing.standard.domain.Field;

public class StandardValidateResult {

    private boolean ok;

    private List<Field> passFields;

    private List<Field> unPassFields;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public List<Field> getPassFields() {
        return passFields;
    }

    public void setPassFields(List<Field> passFields) {
        this.passFields = passFields;
    }

    public List<Field> getUnPassFields() {
        return unPassFields;
    }

    public void setUnPassFields(List<Field> unPassFields) {
        this.unPassFields = unPassFields;
    }
}
