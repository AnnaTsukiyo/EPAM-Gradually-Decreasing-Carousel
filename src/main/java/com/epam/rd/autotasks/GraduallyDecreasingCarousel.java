package com.epam.rd.autotasks;

import java.util.Arrays;

public class GraduallyDecreasingCarousel extends DecrementingCarousel {

    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    protected int[] arr;
    protected int capacity;
    private int i = 0;
    private boolean runEd = false;

    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
        GraduallyDecreasingCarousel.this.arr = new int[capacity];
    }

    @Override
    public int next() {
        if (arr.length == 0 || Arrays.stream(arr).sum() == 0)
            return -1;

        if (i >= capacity)
            while (arr[i] == 0) {
                i++;
                if (i > arr.length - 1)
                    i = 0;
            }

        if (arr[i] > 0)
            return arr[i++]--;

        return 0;
    }

    @Override
    public GraduallyDecreasingCarousel run() {
        if (!runEd) {
            runEd = true;
            return GraduallyDecreasingCarousel.this;
        } else
            return null;
    }
}


