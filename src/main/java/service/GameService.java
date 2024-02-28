package service;

import interfaces.Games;
import models.*;
import repositories.UserDataBase;

import java.util.*;

public class GameService {
    private static GameService instance = new GameService();
    private UserDataBase userDataBase = UserDataBase.getInstance();
    private UserCounter userCounter = UserCounter.getInstance();
    private GameCounter gameCounter = GameCounter.getInstance();
    private CheckUsersService checkUsersService;
    private GameConstructor constructor = new GameConstructor();
    private GameIterator iterator = new GameIterator();

    private Map<Integer, Games>db = new HashMap<>();

    private GameService() {
    }

    public static synchronized GameService getInstance(){
        if (instance == null){
            return new GameService();
        }
        return instance;
    }
    public void setGame(Games game, Integer id){
        db.put(id, game);
    }
    public Games getGame(Integer id){
        return db.get(id);
    }
    public void setUser(User user, Integer id){
        userDataBase.setUser(user, id);
    }
    public User getUser(Integer id){
        return userDataBase.getUser(id);
    }
    public void setUserCounter(Integer counter){
        userCounter.setCountUser(counter);
    }
    public Integer getUserCounter(){
        return userCounter.getCountUser();
    }
    public void setGameCounter(Integer counter){
        gameCounter.setCount(counter);
    }
    public Integer getGameCounter(){
        return gameCounter.getCount();
    }
    public Integer getUserId(String nickName){
        return userDataBase.getIdUser(nickName);
    }
    public List<User> getAllUsers(){
        return userDataBase.getAll();
    }
    public UserDataBase getUserDataBase(){
        return userDataBase;
    }

    public boolean checkUser(User user){
        checkUsersService = new CheckUsersService(getAllUsers());
        return checkUsersService.check(user);
    }
    public void delAllUsers(){
        userDataBase.delAllUsers();
        gameCounter.setCount(0);
    }
    public void removeUser(String name, String nickName, Integer id){
        List<User> users = getAllUsers();
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getName().equals(name) && users.get(i).getNickName().equals(nickName) &&
            users.get(i).getId().intValue() == id.intValue()){
                getUserDataBase().getUserMap().remove(i);
                setUserCounter(getUserCounter() - 1);
            }
        }
    }
    public Games createGame(GameTypes type, User user){
        Games game = constructor.getGame(type);
        game.setId(getGameCounter());
        game.setType(type);
        game.setUser(user);
        return game;
    }

    public GameIterator getIterator() {
        return iterator;
    }
}
