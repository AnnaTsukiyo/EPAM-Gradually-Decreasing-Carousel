package com.epam.rd.autotasks;

import java.util.Arrays;

public class DecrementingCarousel {
    private int capacity;
    private int[] carousel;
    private int headAdd = 0;
    private boolean carousRan = false;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
        Arrays.fill(carousel, 0);
    }

    public boolean addElement(int element) {
        if (element > 0 && headAdd < capacity && !carousRan) {
            carousel[headAdd] = element;
            headAdd++;
            return true;
        }
        return false;
    }

    public CarouselRun run() {
        if (!carousRan) {
            carousRan = true;
            return new CarouselRun(carousel, 0);
        }
        return null;
    }

    public int[] getCarousel() {
        return carousel;
    }

    public boolean isCarousRan() {
        return carousRan;
    }

    public void setCarousRan(boolean carousRan) {
        this.carousRan = carousRan;
    }
}
