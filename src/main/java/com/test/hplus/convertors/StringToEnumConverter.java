package com.test.hplus.convertors;

import com.test.hplus.beans.Gender;
import org.springframework.core.convert.converter.Converter;

/**
 * @author Mohammed Amr
 * @created 17/05/2021 - 20:14
 * @project hplus-app
 */
public class StringToEnumConverter implements Converter<String, Gender> {

    @Override
    public Gender convert(String s) {
        if (s.equals("Male")) {
            return Gender.MALE;
        } else if (s.equals("Female")) {
            return Gender.FEMALE;
        } else {
            return Gender.OTHER;
        }
    }
}
