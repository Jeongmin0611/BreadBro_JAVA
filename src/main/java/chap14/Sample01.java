package chap14;

@SampleAnnotation1
@SampleAnnotation2
@SampleAnnotation3
public class Sample01 {
	
	
	//@SampleAnnotation1
	//@Transactional(ReadOnly = true)
	//@SampleAnnotation2
	//@Autowired(value= {"a","b","c"})
	@Autowired("a")
	@Autowired("b")
	@Autowired("c")
	public void test() {}
}

@FunctionalInterface//해당 클래스에는 무조건 1개의 추상메소드가 있어야 함.
interface testff{
	public void run();
}
