
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
            return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int bird: birdsPerDay){
            if(bird==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for(int i = 0; i < limit; i++){
            total += birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int count = 0;
        for(int bird: birdsPerDay){
            count += (bird >= 5) ? 1 : 0;
        }
        return count;
    }
}
