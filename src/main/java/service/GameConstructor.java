package service;

import interfaces.Games;
import models.AnotherGame;
import models.GameTypes;
import models.MoreGame;
import models.UfoGame;

public class GameConstructor {

    public Games getGame(GameTypes type){
        Games game = null;
        switch (type){
            case UFO:game =  new UfoGame();
            break;
            case ANOTHER:game =  new AnotherGame();
            break;
            case MORE:game =  new MoreGame();
        }
        return game;
    }
}
