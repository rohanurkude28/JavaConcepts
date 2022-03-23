package oops;

class Address {
    int street_no;
    String city;
    String state;
    int pin;

    Address(int street_no, String city, String state, int pin) {
        this.street_no = street_no;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }
}

public class AggregationStudent {
    String name;
    Address ad; // Setter based Injection
}