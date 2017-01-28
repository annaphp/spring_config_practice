package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import beans.*;

@Configuration
@Import(TeamConfig.class)
public class AppConfig {
	
    /*
     * When you need imported beans(from another javaconfig class),
     * add them as parameters to the method where they are needed.
     * 'Team' must match the bean type from another javaconfig.
     * 'home' must match real bean name(id), declared in another javaconfig.
     */
	@Bean
	public Game mgame(Team home, Team away){
		return new BaseballGame(home, away);
		
	}
	

}
