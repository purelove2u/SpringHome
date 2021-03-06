package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.MyoungwonExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {

//		Exam  exam = new MyoungwonExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MyoungwonDiConfig.class);
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam);
//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams"); //new ArrayList<Exam>();
//		exams.add(new MyoungwonExam(100, 100, 100, 100));
//		exams.add(new MyoungwonExam(90, 90, 90, 90));
		
//		for(Exam e : exams) {
//			System.out.println(e);
//		}
	}

}
