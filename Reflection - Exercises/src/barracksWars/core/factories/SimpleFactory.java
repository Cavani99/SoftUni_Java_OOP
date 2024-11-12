package barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.models.units.*;

public class SimpleFactory {

    public static Unit createUnit(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type cannot be null");
        }
        if (type.equals("Archer")) {
            return new Archer();
        } else if (type.equals("Pikeman")) {
            return new Pikeman();
        } else if (type.equals("Swordsman")) {
            return new Swordsman();
        } else if (type.equals("Gunner")) {
            return new Gunner();
        } else if (type.equals("Horseman")) {
            return new Horseman();
        } else {
            throw new IllegalArgumentException("Unknown unit type: " + type);
        }
    }
}