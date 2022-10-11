package hu.petrik.autok;

public class tesla implements auto {
    private double sebesseg = 0;

    tesla() {
        sebesseg = Math.floor(Math.random() * 60);
    }

    @Override
    public void gyorsul() {
        sebesseg += Math.floor(Math.random() * 10) + 5;
    }

    @Override
    public double getSebesseg() {
        return sebesseg;
    }
}