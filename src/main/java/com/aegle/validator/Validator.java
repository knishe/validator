package com.aegle.validator;

import javax.xml.bind.ValidationException;

/**
 * @author Nishanthan Krishnakumar
 * @version 1.0
 */
public interface Validator<T> {
    void validate(T t) throws ValidationException;
}