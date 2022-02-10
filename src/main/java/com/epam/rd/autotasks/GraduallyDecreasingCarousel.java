package com.epam.rd.autotasks;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (!isCarousRan()) {
            setCarousRan(true);
            return new CarouselRun(getCarousel(), 1);
        }
        return null;
    }
}
