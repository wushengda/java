package annotation;


import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Inherited
public @interface Param {
	String name();
	String desc();
	ParamType type();
	String rel() default "";
	NullAbleType nullable() default NullAbleType.YES;
}