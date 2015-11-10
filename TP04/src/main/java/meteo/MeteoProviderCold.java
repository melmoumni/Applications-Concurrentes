package meteo;

/**
 * Created by mohammed on 11/11/15.
 */

@MeteoCold
public class MeteoProviderCold implements MeteoProvider {

    public float getMeteo(String  city){
        return randRange(-20, -10);
    }

    private float randRange(float min, float max) {
        return min + (float)Math.random() * (max - min);
    }
}
