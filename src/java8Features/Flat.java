package java8Features;

import java.util.Optional;

/**
 * Created by Александр on 15.06.2016.
 */
public class Flat {
    Optional<Citizen> citizen = Optional.empty();

    public Optional<Citizen> getCitizen() {
        return citizen;
    }
}
