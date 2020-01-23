package springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WatamczykConstraintValidator implements ConstraintValidator<Watamczyk, String> {
   String value;
   public void initialize(Watamczyk constraint) {
      this.value = constraint.value();
   }

   public boolean isValid(String obj, ConstraintValidatorContext context) {
      if(obj!=null) {
         return Integer.parseInt(obj) % 2 == 0;
      } else
         return true;
   }
}
