class NeedForSpeed {
    protected int speed, batteryDrain, totalMeters;
    protected int batteryDrained = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(batteryDrained < batteryDrain){
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return totalMeters;
    }

    public void drive() {
        if(batteryDrained > 0){
            totalMeters += speed;
            batteryDrained -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
    int maxDrives = 100 / car.batteryDrain;
    int maxDistance = maxDrives * car.speed;
    return maxDistance >= distance;
    }

}