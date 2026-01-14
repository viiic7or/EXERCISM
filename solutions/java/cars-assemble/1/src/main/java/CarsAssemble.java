public class CarsAssemble {
    private double production = 0.0;
    public double productionRatePerHour(int speed) {
        if(speed >= 1 && speed <= 4){
            production = speed * 221;
        }else if(speed >= 5 && speed <= 8){
            production = (speed * 221) * 0.9;
        }else if(speed == 9){
            production = (speed * 221) * 0.8;
        }else if(speed == 10){
            production = (speed * 221) * 0.77;
        }
        return production;
    }

    public int workingItemsPerMinute(int speed) {
        production = this.productionRatePerHour(speed);
        return (int)(production/60);
    }
}
