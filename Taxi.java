public class Taxi implements Transport {

    @Override
    public String requestRide() {
        return "Taxi ride requested.";
    }

    @Override
    public String completeRide() {
        return "Taxi ride completed.";
    }
}