package com.avi.socialmedia.repositories;

import com.avi.socialmedia.models.User;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount=3;
    static {
        users.add(new User(1,"Adam",new Date()));
        users.add(new User(2,"eve",new Date()));
        users.add(new User(3,"Jack",new Date()));
    }
    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId(++usersCount);
        }
        users.add(user);
        return  user;
    }

    public User findById(int id){
        User user=null;
        for(User u:users){
            if(u.getId()==id) {
                user = u;
                break;
            }
        }
        return user;
    }
}
