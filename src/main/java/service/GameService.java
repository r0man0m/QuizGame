package service;

import interfaces.Games;
import models.*;
import repositories.UserDataBase;

import java.util.*;

public class GameService {
    private static GameService instance = new GameService();
    private UserDataBase repository = UserDataBase.getInstance();
    private UserCounter userCounter = UserCounter.getInstance();
    private GameCounter gameCounter = GameCounter.getInstance();
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
    public List<Games> getAllGames(){
        return new ArrayList<>(db.values());
    }
    public void setUser(User user, Integer id){
        repository.setUser(user, id);
    }
    public User getUser(Integer id){
        return repository.getUser(id);
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
        return repository.getIdUser(nickName);
    }
    public List<User> getAllUsers(){
        return repository.getAll();
    }
}
