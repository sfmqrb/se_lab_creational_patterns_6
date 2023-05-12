class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    public void reset() {
        this.car = new Car();
    }

    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    public void setTripComputer(boolean tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    public void setGPS(boolean gps) {
        this.car.setGPS(gps);
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
