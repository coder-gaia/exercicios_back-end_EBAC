/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Annotations.Example1;

import java.lang.annotation.RetentionPolicy;

@AnnotationExample(value = 10, names = {"Alexandre"}, value2 = {RetentionPolicy.RUNTIME}, value3 = {RetentionPolicy.RUNTIME})
public class UsingAnnotation {
    
    private String name;
}
