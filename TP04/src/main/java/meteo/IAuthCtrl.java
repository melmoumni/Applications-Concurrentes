package meteo;

/**
 * Created by mohammed on 11/11/15.
 */
public interface IAuthCtrl {

    public boolean authentificate(User user);
    public User getCurrentUser();
}
