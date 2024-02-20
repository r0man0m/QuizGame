package service;

import models.GameTypes;

public class TypeConstructor {
    public GameTypes getType(String value){
        GameTypes gameTypes = null;
        switch (value){
            case "Ufo": gameTypes = GameTypes.UFO;
            break;
            case "Another": gameTypes = GameTypes.ANOTHER;
            break;
            case "More": gameTypes = GameTypes.MORE;
        }
        return gameTypes;
    }
}
