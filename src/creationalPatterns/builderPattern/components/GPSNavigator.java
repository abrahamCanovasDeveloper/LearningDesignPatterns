package creationalPatterns.builderPattern.components;

public class GPSNavigator {
    private String route;

    /**
     * Constructor no params (DefaultRoute)
     */
    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    /**
     * Constructor with param (Choose your route)
     */
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
