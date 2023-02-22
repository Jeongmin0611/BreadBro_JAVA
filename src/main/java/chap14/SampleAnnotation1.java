package chap14;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Documented
@Retention(SOURCE)
@Target({TYPE, FIELD, CONSTRUCTOR})
public @interface SampleAnnotation1 {

}

@Documented
@Retention(CLASS)
@interface SampleAnnotation2 {

}

@Retention(RUNTIME)
@interface SampleAnnotation3 {

}

@Target({TYPE,METHOD})
@interface Transactional{
	String value() default "";
	boolean ReadOnly() default false;
}


@Documented
@Retention(CLASS)
@Repeatable(AutowiredElement.class)//반복할 어노테이션 .class 지정
@interface Autowired{
	//default가 없으면 해당 값을 필수적으로 넣어줘야됨.
	//default 있으면 생략가능
	String name() default "";
	//value만 'value=' 가 생략이 가능
	String[] value() default "";
}

@Documented
@Retention(CLASS)
@interface AutowiredElement{// Autowired랑 내용이 같아야 함.
	//Autowired 요소 저장할 수 있게 타입 지정
	Autowired[] value();
}