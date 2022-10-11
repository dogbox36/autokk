package hu.petrik.autok;

public class Porsche implements auto {
    private double sebesseg;

    Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    @Override
    public void gyorsul() {
        sebesseg += 10;
    }

    @Override
    public double getSebesseg() {
        return sebesseg;
    }
}