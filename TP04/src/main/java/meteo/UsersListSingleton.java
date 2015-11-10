package meteo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammed on 10/11/15.
 */
public class UsersListSingleton {

    private final static List<User> usersList = new ArrayList<User>();


    public static List<User> getUsersList(){
        return usersList;
    }

    public void adduser(User user){
        this.usersList.add(user);
    }
}
