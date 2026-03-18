public class Trip {
    private User user;
    private String transportType;
    private String status;

    public Trip(User user, String transportType) {
        this.user = user;
        this.transportType = transportType;
        this.status = "Waiting";
    }

    public void completeTrip() {
        status = "Completed";
    }

    public String toString() {
        return user.getName() + " - " + transportType + " (" + status + ")";
    }
}