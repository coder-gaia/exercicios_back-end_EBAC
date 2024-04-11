/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Annotations.Example1;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface AnnotationExample {

    long value();
    String[] names();
    RetentionPolicy[] value2();
    RetentionPolicy[] value3();
    String defaultName() default "Alexandre";
}
