public class Bus implements Transport {

    @Override
    public String requestRide() {
        return "Bus ride requested.";
    }

    @Override
    public String completeRide() {
        return "Bus ride completed.";
    }
}