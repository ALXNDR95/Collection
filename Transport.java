package Homework;

import java.util.*;

public class Transport implements Comparable<Transport> {
    private final String type;
    private final String fuel;
    private double speed;

    public Transport(String type, String fuel, double speed) {
        if (type == null || fuel == null || speed <= 0) {
            throw new IllegalArgumentException();
        }
        this.type = type;
        this.fuel = fuel;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.speed, speed) == 0 && type.equals(transport.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, fuel);
    }

    @Override
    public int compareTo(Transport o) {
        return (int) (this.speed - o.speed);
    }
}



