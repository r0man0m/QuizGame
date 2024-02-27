package service;

import interfaces.Games;
import models.games.AnotherGame;
import models.GameTypes;
import models.games.MoreGame;
import models.games.UfoGame;
import models.content.AnotherContent;
import models.content.MoreContent;
import models.content.UfoContent;

public class GameConstructor {

    public Games getGame(GameTypes type){
        Games game = null;
        switch (type){
            case UFO:game =  new UfoGame(new UfoContent(), GameTypes.UFO);
            break;
            case ANOTHER:game =  new AnotherGame(new AnotherContent(), GameTypes.ANOTHER);
            break;
            case MORE:game =  new MoreGame(new MoreContent(), GameTypes.MORE);
        }
        return game;
    }
}
