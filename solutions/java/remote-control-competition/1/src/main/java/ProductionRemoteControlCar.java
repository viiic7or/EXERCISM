class ProductionRemoteControlCar implements Comparable<ProductionRemoteControlCar>, RemoteControlCar {
    int distance;
    int numberOfVictories;
    
    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
  public int compareTo(ProductionRemoteControlCar prcc) {
    return prcc.numberOfVictories - this.numberOfVictories;
  }
}
