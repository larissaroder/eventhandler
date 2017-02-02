package handle.handler;

import handle.domains.User;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.data.mapping.context.PersistentEntities;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(User.class)
public class UserEventHandler extends AbstractRepositoryEventListener{

	@HandleBeforeCreate
	public void handleBeforeCreate(User user) {
		System.out.println("Saving Agent " + user.toString());

	}

	@HandleBeforeSave
	public void handleBeforeSave(User user) {
		System.out.println("Saving Agent " + user.toString());

	}
}