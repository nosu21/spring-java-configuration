package co.tomcio.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Throw hard you hockey puck";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTemp() {
		// TODO Auto-generated method stub
		return null;
	}

}
