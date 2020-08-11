package spring.aop;

import spring.aop.entity.Exam;
import spring.aop.entity.MyoungwonExam;

public class Program {

	public static void main(String[] args) {

		Exam exam = new MyoungwonExam(1, 1, 1, 1);
		
		System.out.printf("total is %d\n", exam.total());
	}

}
