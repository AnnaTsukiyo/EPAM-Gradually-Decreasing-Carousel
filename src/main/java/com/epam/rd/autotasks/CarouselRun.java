package com.epam.rd.autotasks;

import java.util.Arrays;

public class CarouselRun {
    private int[] carousel;
    private int cursor;
    private int action;
    private int gradully = 1;

    public CarouselRun(int[] carousel, int action) {
        this.carousel = carousel;
        this.action = action;
    }

    public int next() {
        if (isFinished()) {
            return -1;
        }
        while (carousel[cursor] <= 0) {
            if (cursor >= carousel.length - 1) {
                gradully++;
                cursor = 0;
                continue;
            }
            cursor++;
        }
        int nextEl = carousel[cursor];
        switch (action) {
            case 0:
                carousel[cursor]--;
                break;
            case 1:
                carousel[cursor] = carousel[cursor] - gradully;
                break;
            default:
        }
        cursor++;
        if (cursor == carousel.length){
            cursor = 0;
            gradully++;
        }
        return nextEl;
    }

    public boolean isFinished() {
        for (int i = 0; i < carousel.length; i++) {
            if (carousel[i] > 0) {
                return false;
            }
        }
        return true;

    }

}
