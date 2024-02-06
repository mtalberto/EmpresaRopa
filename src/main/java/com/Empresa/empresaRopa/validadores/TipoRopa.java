/**package com.Empresa.empresaRopa.validadores;


import jakarta.validation.ConstraintValidatorContext;

public class TipoRopa implements ConstraintValidator<LengthValidation, String> {

    private String tiporopa[]= {"abrigo","camiseta","falda","pantalon","ropainterior"};
    public boolean isValid(String field, ConstraintValidatorContext cxt) {
        return tiporopa[field];
    }
}
*/