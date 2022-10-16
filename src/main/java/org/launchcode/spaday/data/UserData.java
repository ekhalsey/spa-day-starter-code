package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static final Map<Integer, User> users = new HashMap<>();

    //get all events
    public static Collection<User> getAll() {
        return users.values();
    }

    //get single event
    public static User getById(int id) {
        return users.get(id);
    }

    //add event
    public static void addUser(User user) {
        users.put(user.getId(),user);
    }

    //remove event
    public static void removeUser(int id) {
        users.remove(id);
    }
}
