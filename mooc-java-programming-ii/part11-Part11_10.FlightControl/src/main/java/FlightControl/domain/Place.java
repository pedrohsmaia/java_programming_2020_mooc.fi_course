package FlightControl.domain;

/**
 *
 * @author pedromaia
 */
public class Place {
    private String name;
    
    public Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}