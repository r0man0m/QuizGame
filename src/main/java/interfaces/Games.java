package interfaces;

import models.GameTypes;
import models.User;

public interface Games {
    Integer getId();
    User getUser();
    GameTypes getType();
    public void setType(GameTypes type);
    void setId(Integer id);
    void setUser(User user);
}
