package meteo;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by mohammed on 11/11/15.
 */
@Basic
@SessionScoped
@Named
public class AuthCtrl implements IAuthCtrl, Serializable{

    @Inject UsersRepository usersRepository;
    private User currentUser;
    public boolean authentificate(User user){
        for(User usr : usersRepository.getUsersList()){
            if(usr.getFirstName().equals(user.getFirstName()) && usr.getLastName().equals(user.getLastName()) && usr.getPsswd().equals(user.getPsswd())) {
                this.currentUser = usr;
                return true;
            }
        }
       return false;
    }

    public User getCurrentUser(){
        return this.currentUser;
    }
}
