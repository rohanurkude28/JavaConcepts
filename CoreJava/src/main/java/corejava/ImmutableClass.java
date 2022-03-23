package corejava;

import java.util.HashSet;
import java.util.Set;

public final class ImmutableClass {
    private int id;
    private final Set<String> names;

    public int getId() {
        return id;
    }

    public Set<String> getNames() {
        return (HashSet)((HashSet)names).clone(); //Send back Clone
    }

    public ImmutableClass(int id, Set<String> names) {
        this.id = id;

        Set<String> tempNames = new HashSet<>();
        tempNames.addAll(names); // Deep Copy

        this.names = tempNames;
    }
}
