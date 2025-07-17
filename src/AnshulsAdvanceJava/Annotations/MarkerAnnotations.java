package AnshulsAdvanceJava.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MarkerAnnotations {
	// marker annotation -> annotation that does not have any value (no metadata), just a marker

	// to create a marker annotation (custom annotation)
	// to create an annotation, we use '@interface' no matter which type of annotation

	// we can optionally use '@Retention' and '@Target' to control where and when the annotation applies
	// retention defines how long the annotation is kept (e.g., source, class, or runtime)
	// target is the place where annotation can be used

	@Target(ElementType.TYPE) // targets the class (generic type)
	@Retention(RetentionPolicy.RUNTIME) // runs at runtime
	public @interface MyMarkerAnnotation {

	}
}
