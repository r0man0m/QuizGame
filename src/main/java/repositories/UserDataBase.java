package repositories;

import models.User;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class UserDataBase {
    private static UserDataBase instance = new UserDataBase();
    private Map<Integer, User> userMap = new HashMap<>();

    private UserDataBase() {
    }
    public static synchronized UserDataBase getInstance(){
        if(instance == null){
            return new UserDataBase();
        }
        return instance;
    }
    public void setUser(User user, Integer id){
        userMap.put(id, user);
    }
    public User getUser(Integer id){
        return userMap.get(id);
    }
    public List<User>getAll(){
        return new ArrayList<>(userMap.values());
    }
    public Integer getIdUser(String nick){
        AtomicReference<Integer> id = new AtomicReference<>();
        userMap.entrySet().stream().filter(c->c.getValue().getNickName().equals(nick)).forEach(u->{
            id.set(u.getKey());
        });
        return id.get();
    }

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    public void delUser(User user){
        userMap.remove(user);
    }
    public void delAllUsers(){
        userMap.clear();
    }
    public List<User> getUsersList(){
        List<User> userslist = new ArrayList<>();
        for (Map.Entry<Integer, User>U: userMap.entrySet()){
            userslist.add(U.getValue());
        }
        return userslist;
    }

}
