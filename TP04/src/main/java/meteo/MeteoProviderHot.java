package meteo;

/**
 * Created by mohammed on 11/11/15.
 */

@MeteoHot
public class MeteoProviderHot implements MeteoProvider {

    public float getMeteo(String city){
        return randRange(30, 40);
    }

    private float randRange(float min, float max) {
        return min + (float)Math.random() * (max - min);
    }
}
