package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand =brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {

    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 700;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    public void accelerate() {
        if (speedometer < MAX_SPEED) {
            speedometer += 10;
            tachometer += 100;
        }
        else {
            System.out.println("El coche ya está a máxima velocidad");
        }
    }

    public void brake() {
        if (speedometer > 0) {
            speedometer -= 10;
            tachometer -= 100;
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }

    public void turnAngleOfWheels(int angle) {
        int newAngle = wheelsAngle + angle;

        // Limit the new angle to the valid range (-45 to 45)
        wheelsAngle = Math.max(-45, Math.min(45, newAngle));

        // Print a message if the angle reaches the limit
        if (wheelsAngle == -45 || wheelsAngle == 45) {
            System.out.println("El volante no puede girar más");
        }
    }

    public String showSteeringWheelDetail() {

        return "";
    }

    public boolean isReverse() {

        return false;
    }

    public void setReverse(boolean reverse) {
        if (speedometer == 0) {
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R";
            } else {
                this.gear = "N";
            }
        } else {
            System.out.println("No puedes poner marcha atrás mientras el coche está en movimiento.");
        }

        if (speedometer == 0 && gear.equalsIgnoreCase("R")) {
            this.gear = gear;
        } else if (!gear.equalsIgnoreCase("R")) {
            System.out.println("Invalid gear selection. Please use 'R' for reverse.");
        } else {
            System.out.println("No puedes poner marcha atrás mientras el coche está en movimiento.");
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void showDetails() {

    }
}
