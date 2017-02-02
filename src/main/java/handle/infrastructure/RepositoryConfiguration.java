package handle.infrastructure;

import handle.handler.UserEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

	@Bean
	UserEventHandler userEventHandler() {
		return new UserEventHandler();
	}

}