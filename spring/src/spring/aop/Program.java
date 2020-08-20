package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.MyoungwonExam;

public class Program {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		//ApplicationContext context = new AnnotationConfigApplicationContext(MyoungwonDiConfig.class);
		
		Exam exam = (Exam) context.getBean("exam");
		
		System.out.printf("total is %d\n", exam.total());
		System.out.printf("avg is %.2f\n", exam.avg());

		//		Exam exam = new MyoungwonExam(1, 1, 1, 1);
//		
//		Exam proxy = (Exam) Proxy.newProxyInstance(MyoungwonExam.class.getClassLoader(), 
//				new Class[] {Exam.class}, 
//				new InvocationHandler() {
//					
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						
//						long start = System.currentTimeMillis();
//						
//						Object result = method.invoke(exam, args);
//						
//						long end = System.currentTimeMillis();
//						String message = (end - start) + "ms �ð��� �ɷȽ��ϴ�.";
//						System.out.println(message);
//						
//						return result;
//					}
//				}
//				);
		
	}

}
