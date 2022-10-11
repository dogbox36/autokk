package hu.petrik.autok;

import java.util.Scanner;

public class KonzolosAuto implements auto {
    private double sebesseg = 0;

    @Override
    public void gyorsul() {
        var sc = new Scanner(System.in);
        System.out.print("Gyorsulas (double): ");
        double gyorsulas = sc.nextDouble();
        sebesseg += gyorsulas;
    }

    @Override
    public double getSebesseg() {
        return sebesseg;
    }
}