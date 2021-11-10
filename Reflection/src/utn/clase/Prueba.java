package utn.clase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Metadatos de clases
@Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.METHOD)
public @interface Prueba
{
    int cantidad();
    String nombre() default "sin nombre";

}
