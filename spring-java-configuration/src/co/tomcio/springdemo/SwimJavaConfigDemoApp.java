package co.tomcio.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// logger
		AnnotationConfigApplicationContext logger = new AnnotationConfigApplicationContext(MyLoggerConfig.class);

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// call the getters
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Tema: " + theCoach.getTeam());

		// close context
		context.close();
	}

}
