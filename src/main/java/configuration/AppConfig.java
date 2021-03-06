package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.*;

@Configuration
public class AppConfig {
	
    /*
     * Spring will create only one instance of each bean (Game, RedSox, Cubs)
     * and will always return the same instance even if the method is called twice
     */
	@Bean
	public Game mgame(){
		//dependency injection through constructor
		Game game = new BaseballGame(home());
		//dependency injection through setter
		game.setAwayTeam(away());
		return game;
	}
	
	@Bean
	public Team home(){
		return new RedSox();
	}
	
	@Bean Team away(){
		return new Cubs();
	}

}
