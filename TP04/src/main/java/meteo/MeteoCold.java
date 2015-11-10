package meteo;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Target;

/**
 * Created by mohammed on 11/11/15.
 */
@Qualifier
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
public @interface MeteoCold {
}
