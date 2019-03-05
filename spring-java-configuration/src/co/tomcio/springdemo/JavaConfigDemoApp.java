package co.tomcio.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
			
		// get the bean from spring container
		Coach theCoach = (Coach) context.getBean("tennisCoach", Coach.class);
	
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());		

		//close context
		context.close();
	}

}
