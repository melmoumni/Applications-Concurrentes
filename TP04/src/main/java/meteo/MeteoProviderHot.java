package meteo;

import javax.inject.Inject;

/**
 * Created by mohammed on 11/11/15.
 */

@MeteoHot
public class MeteoProviderHot implements MeteoProvider {

    @Inject @Basic IAuthCtrl authCtrl;
    public float getMeteo(String city){
        User user = authCtrl.getCurrentUser();
        user.setAccess(user.getAccess() + 1);
        return randRange(30, 40);
    }

    private float randRange(float min, float max) {
        return min + (float)Math.random() * (max - min);
    }
}
