package Homework;

import java.util.ArrayList;
import java.util.List;

public class TransportMain {
        public static void main(String[] args) {
            List<Transport> transportList = new ArrayList<>();

            transportList.add(new Transport("Train", "diesel fuel", 574.7));
            transportList.add(new Transport("Plane", "jet fuel", 800.0));
            transportList.add(new Transport("Passenger ship", "diesel fuel", 80.0));
            transportList.add(new Transport("Car", "gas", 120.0));

            System.out.println(transportList);

            /*Set<Transport> transportSet = new TreeSet<>(transportList);
            System.out.println("\nСортировка по скорости:");
            System.out.println(transportSet);*/
        }
    }

