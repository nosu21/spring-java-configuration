package co.tomcio.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
	"Beware of the wolf in sheep's clothing",
	"Diligence is the mother of good luck",
	"The journey is the reward"
	};
	// create random number generator
	Random ran = new Random();
	int i = ran.nextInt(data.length);
	
	//create an array of string
	public String getFortune() {
		//pick a random from array
		return data[i];
	}

}
