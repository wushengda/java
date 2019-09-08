package annotation;

import java.lang.annotation.*;

/**
 * Created by awx on 2018/10/11/011.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Inherited
public @interface Description {
    String name();

    Param[] params();
}
