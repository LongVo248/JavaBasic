package Mutable_Immutable;

public class Immutable {
    private String first_name;
    private String last_name;

    public Immutable(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
}
