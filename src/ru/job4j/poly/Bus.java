package ru.job4j.poly;

public class Bus implements Transport  {

    int speedPerHour = 60;
    int fuelPerHour = 30;
    int track;
    int time = 3;
    int ticketPrise;
    int fuelPrise = 10;

    @Override
    public void driving() {
        track = speedPerHour * time;
    }

    @Override
    public void passengers(int index) {
        ticketPrise = fuelPerHour / index;
    }

    @Override
    public int tanking(int litre) {
        return litre * fuelPrise;
    }
}
