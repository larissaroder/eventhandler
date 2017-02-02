package handle.services;

import handle.domains.User;
import handle.domains.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User createOrUpdate(User user) {
       return userRepository.save(user);
    }

}
