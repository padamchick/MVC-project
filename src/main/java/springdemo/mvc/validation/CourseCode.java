package springdemo.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)  //gdzie logika->samo tworzy klasę
@Target({ElementType.FIELD, ElementType.METHOD})    //do których elementów się odnosi -> pola i metody
@Retention(RetentionPolicy.RUNTIME)                 //w czasie wykonywania programu
public @interface CourseCode {
    //define default course code
    public String value() default "LUV";
    //define default error message
public String message() default "must start with LUV";
    //define default groups
public Class<?>[] groups() default {};
    //define default payloads
    public Class<? extends Payload>[] payload() default {};
}
