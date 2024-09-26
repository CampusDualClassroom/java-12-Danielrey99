package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        //Instanciar car
        Car myCar = new Car("Honda", "Civic", "Gasolina");

        //Un método booleano que verifique si el valor del tacómetro es cero
        System.out.println(myCar.isTachometerEqualToZero());

        //Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        myCar.start();
        System.out.println(myCar.tachometer);

        //Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        myCar.start();
        System.out.println(myCar.tachometer);

        //Apagar el coche comprobando que el valor del tacómetro es correcto
        myCar.stop();
        System.out.println(myCar.tachometer);

        //Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        myCar.start();
        myCar.accelerate();
        myCar.stop();

        //Acelerar el coche
        myCar.accelerate();
        System.out.println(myCar.speedometer);
        System.out.println(myCar.tachometer);

        //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        for(int i =0; i<11;i++){
            myCar.accelerate();
        }
        System.out.println(myCar.speedometer);

        //Frenar la velocidad
        myCar.brake();
        System.out.println(myCar.speedometer);

        //Frenar hasta un valor negativo (y comprobar que no se puede)
        for(int i =0; i<12;i++){
            myCar.brake();
        }
        System.out.println(myCar.speedometer);

        //Girar el volante 20 grados
        myCar.turnAngleOfWheels(-10);
        System.out.println(myCar.wheelsAngle);

        //Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        for(int i =0; i<5;i++){
            myCar.turnAngleOfWheels(-10);
        }
        System.out.println(myCar.wheelsAngle);

        //Detener el coche y poner marcha atrás
        myCar.setReverse(true);
        System.out.println(myCar.reverse);

        //Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        myCar.setReverse(false);
        myCar.accelerate();
        myCar.setReverse(true);
        System.out.println();

    }

}