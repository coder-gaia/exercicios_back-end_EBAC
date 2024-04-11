/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Annotations.Example2;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface FirstAnnotation {

    String value();

    String[] neighborhood();

    long houseNumber();

    double values()  default 10d;
}

