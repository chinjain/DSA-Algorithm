package custom.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//Specifies that the annotation will be retained at runtime, allowing you to reflectively inspect it.
@Retention(RetentionPolicy.RUNTIME)
//Specifies that the annotation can only be applied to methods.
@Target(ElementType.METHOD)
@interface AnnotationTes {
	
	
	String value() default "Empty Value";
	int priority() default 0;

}


class AnnotationTes{
	
	@AnnotationTes(value = "Hello Test",priority = 2)
	public void test() {
		
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Method method = AnnotationTes.class.getMethod("test");
		
		if(method.isAnnotationPresent(AnnotationTes.class)) {
			AnnotationTes annotation = method.getAnnotation(AnnotationTes.class);
			System.err.println(annotation.value());
			System.out.println(annotation.priority());
		}
	}
}
