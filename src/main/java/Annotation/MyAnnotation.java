package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.LOCAL_VARIABLE})
@interface MyAnnotation 
{

}
