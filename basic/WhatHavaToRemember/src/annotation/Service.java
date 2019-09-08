package annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Inherited
public @interface Service
{
	String serviceCode();

	String name();

	Msg inMsg();

	Msg outMsg();

	Description[] descriptions() default {};

	String desc();
}
