package com.multithreading.cyclic_barrier;

import java.util.concurrent.CyclicBarrier;

public class Ferry {
    private static final CyclicBarrier BARRIER = new CyclicBarrier(3, new FerryBoat());
    //Инициализируем барьер на три потока и таском, который будет выполняться, когда
    //у барьера соберется три потока. После этого, они будут освобождены.

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 9; i++) {
            new Thread(new Car(i, BARRIER)).start();
            Thread.sleep(400);
        }
    }
}

class Car implements Runnable {
    private int carNumber;
    private CyclicBarrier BARRIER;

    public Car(int carNumber, CyclicBarrier BARRIER) {
        this.carNumber = carNumber;
        this.BARRIER = BARRIER;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Автомобиль №%d подъехал к паромной переправе.\n", carNumber);
            //Для указания потоку о том что он достиг барьера, нужно вызвать метод await()
            //После этого данный поток блокируется, и ждет пока остальные стороны достигнут барьера
            BARRIER.await();
            System.out.printf("Автомобиль №%d продолжил движение.\n", carNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class FerryBoat implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Паром переправил автомобили!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}