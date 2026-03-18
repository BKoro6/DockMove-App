public class EScooter implements Transport {

    @Override
    public String requestRide() {
        return "E-Scooter ride requested.";
    }

    @Override
    public String completeRide() {
        return "E-Scooter ride completed.";
    }
}