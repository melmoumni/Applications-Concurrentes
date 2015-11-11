package meteo;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammed on 11/11/15.
 */
@ApplicationScoped
@Named
public class UsersRepository implements Serializable{

    private final List<User> usersList = new ArrayList<User>();

    public  List<User> getUsersList(){
        return usersList;
    }

    public void adduser(User user){
        this.usersList.add(user);
    }
}
