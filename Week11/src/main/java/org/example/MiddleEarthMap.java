package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the Middle-Earth map with predefined locations and paths.
 */
public class MiddleEarthMap {

    private final Map<String, String> paths;

    /**
     * Constructs the map and initializes predefined locations and routes.
     */
    public MiddleEarthMap() {
        this.paths = new HashMap<>();
        initializePaths();
    }

    /**
     * Initializes the map with default paths.
     */
    private void initializePaths() {
        this.paths.put("Shire", "Rivendell");
        this.paths.put("Rivendell", "Moria");
        this.paths.put("Moria", "Lothlorien");
        this.paths.put("Lothlorien", "Mordor");
        this.paths.put("Mordor", "Mount Doom");
    }

    /**
     * Navigates to the next location from the given current location.
     *
     * @param currentLocation the current location
     */
    public void navigate(final String currentLocation) {
        String next = this.paths.get(currentLocation);
        if (next != null) {
            System.out.println("Navigating from " + currentLocation + " to " + next);
        } else {
            System.out.println("No path found from " + currentLocation);
        }
    }

    public String getNextLocation(final String currentLocation) {
        return this.paths.get(currentLocation);
    }
}
