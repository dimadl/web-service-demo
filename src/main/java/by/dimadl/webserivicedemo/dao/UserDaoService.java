package by.dimadl.webserivicedemo.dao;

import by.dimadl.webserivicedemo.domain.User;
import by.dimadl.webserivicedemo.exception.UserNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<User>(){
        {
            add(new User(1, "Dmitry", new Date()));
            add(new User(2, "Dmitry1", new Date()));
            add(new User(3, "Dmitry2", new Date()));

        }
    };

    public List<User> findAll(){
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(users.size()+1);
        }

        users.add(user);
        return user;
    }

    public User findOne(int id) {
        return users.stream().filter((user -> user.getId() == id)).findFirst().orElseThrow(UserNotFoundException::new);
    }

}
