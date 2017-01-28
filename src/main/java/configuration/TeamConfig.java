package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Cubs;
import beans.RedSox;
import beans.Team;


@Configuration
public class TeamConfig {
	
	/*
	 * Tells spring to create one bean with reference type 'Team' with id/name = 'home'. Actual object type is RedSox.
	 */
	
	@Bean
	public Team home(){
		return new RedSox();
	}
	
	
	/*
	 * Tells spring to create one bean with reference type 'Team' with id/name = 'away'. Actual object type is Cubs.
	 */
	@Bean Team away(){
		return new Cubs();
	}

}
