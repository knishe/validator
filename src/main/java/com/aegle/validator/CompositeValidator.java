package com.aegle.validator;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nishanthan Krishnakumar
 * @version 1.0
 */
abstract class CompositeValidator<T> implements Validator<T>{
    private List<Validator> validatorList;
    public CompositeValidator() {
        validatorList = new ArrayList<Validator>();
    }
    public void registerValidator(Validator validator){
        validatorList.add(validator);
    }
    public abstract void validate(T t) throws ValidationException;
}