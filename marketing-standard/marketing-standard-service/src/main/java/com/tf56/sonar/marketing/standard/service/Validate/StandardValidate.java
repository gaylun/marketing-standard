package com.tf56.sonar.marketing.standard.service.Validate;

import com.tf56.sonar.marketing.standard.domain.Standard;
import com.tf56.sonar.marketing.standard.service.Validate.result.StandardValidateResult;

public interface StandardValidate {

    StandardValidateResult validate(Standard standard);
}
