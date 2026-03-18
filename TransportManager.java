import java.util.*;

public class TransportManager {

    private ArrayList<User> users = new ArrayList<>();
    private Queue<Trip> tripQueue = new LinkedList<>();
    private Stack<Trip> history = new Stack<>();

    private int userIdCounter = 1;

    public void addUser(String name) {
        users.add(new User(userIdCounter++, name));
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void updateUser(int id, String newName) {
        for (User u : users) {
            if (u.getId() == id) {
                u.setName(newName);
            }
        }
    }

    public void deleteUser(int id) {
        users.removeIf(u -> u.getId() == id);
    }

    public void requestTrip(User user, String type) {
        tripQueue.add(new Trip(user, type));
    }

    public Trip processTrip() {
        if (!tripQueue.isEmpty()) {
            Trip t = tripQueue.poll();
            t.completeTrip();
            history.push(t);
            return t;
        }
        return null;
    }

    public Queue<Trip> getQueue() {
        return tripQueue;
    }

    public Stack<Trip> getHistory() {
        return history;
    }
}