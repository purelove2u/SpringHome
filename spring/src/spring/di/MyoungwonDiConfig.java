package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.MyoungwonExam;

@ComponentScan("spring.di.ui")
@Configuration
public class MyoungwonDiConfig {

	@Bean
	public Exam exam() {
		return new MyoungwonExam();
	}
}
