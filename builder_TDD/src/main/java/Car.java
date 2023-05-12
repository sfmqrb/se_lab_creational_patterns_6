class Car {
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    public int getSeats() {
        return this.seats;
    }

    public String getEngine() {
        return this.engine;
    }

    public boolean hasTripComputer() {
        return this.tripComputer;
    }

    public boolean hasGPS() {
        return this.gps;
    }

    @Override
    public String toString() {
        return "Car [seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", gps=" + gps + "]";
    }
}

