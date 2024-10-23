package Traffic_Lights;

public enum TrafficLight {
    RED(0), GREEN(1), YELLOW(2);
    private int size;
    TrafficLight(int size) {
        this.size = size;
    }
    public int getValue() { return this.size; }

    public static TrafficLight getByValue(int value) {
        for (TrafficLight light : TrafficLight.values()) {
            if (light.getValue() == value) {
                return light;
            }
        }
        throw new IllegalArgumentException("Invalid TrafficLight value: " + value);
    }
}
