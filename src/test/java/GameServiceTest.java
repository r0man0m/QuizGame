
import models.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import repositories.UserDataBase;
import service.GameService;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class GameServiceTest {
    private static final User user = new User("TestName", "test", 0);
    private static final List<User>userList = new ArrayList<>();
    @Mock
    UserDataBase mockUserDataBase;

    @InjectMocks
    private static GameService service;

    @Test
    public void checkExistsUserTest(){
        userList.add(user);
        Mockito.when(mockUserDataBase.getAll()).thenReturn(userList);
        assertTrue(service.checkUser(user));
    }

    @Test
    public void checkNotExistsUserTest(){
        Mockito.when(mockUserDataBase.getAll()).thenReturn(new ArrayList<>());
        assertFalse(service.checkUser(user));
    }
    @Test
    public void dellAllUsersTest(){
        Mockito.when(mockUserDataBase.getAll()).thenReturn(new ArrayList<>());
        assertEquals(0, service.getAllUsers().size());
    }
    @Test
    public void removeUserTest(){
        service = GameService.getInstance();
        service.setUser(user,user.getId());
        service.removeUser(user.getName(),user.getNickName(), user.getId());
        assertNull(service.getUserDataBase().getUser(user.getId()));
//        Mockito.when(mockUserDataBase.getUser(user.getId())).thenReturn(null);
//        assertNull(service.getUserDataBase().getUser(user.getId()));
    }

}
