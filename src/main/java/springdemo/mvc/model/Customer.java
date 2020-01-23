package springdemo.mvc.model;

import springdemo.mvc.validation.CourseCode;
import springdemo.mvc.validation.Watamczyk;

import javax.validation.constraints.*;

public class Customer {

    @NotNull(message = "required")
    @Size(min=1, message = "required")
    @Pattern(regexp = "[A-Z][a-z]+", message = "Start with a capital letter, surname consists only letters")
    private String firstName;

    @NotNull(message = "required")
    @Size(min=1, message = "required")
    @Pattern(regexp = "[A-Z][a-z]+", message = "Start with a capital letter, surname consists only letters")
    //@Size(min = 1, message = "is required")
    private String lastName;

   // @NotNull(message = "required")
    @Min(value=0, message = "must be greater than or equal to zero")
    @Max(value=10, message = "must be less than or queal to 10")
    private Integer freePasses; //musi być Integer, bo z int nie działa StringTrimmerEditor

    //@NotNull(message = "required")
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}", message = "it's not a postal code you idiot!")
    private String postalCode;


    @CourseCode //nowa annotacja utworzona w pakunku validation
    @NotNull(message = "required")
    private String courseName;

    @Watamczyk
    String evenNumber;

    public String getEvenNumber() {
        return evenNumber;
    }

    public void setEvenNumber(String evenNumber) {
        this.evenNumber = evenNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
