public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int minutes){
        Lasagna lasagna = new Lasagna();
        int total = lasagna.expectedMinutesInOven();
        int result = total - minutes;
        return result;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layers, int minutes){
        Lasagna lasagna = new Lasagna();
        int timeInLayers = lasagna.preparationTimeInMinutes(layers);
        int timeRestantInTheOven =  lasagna.expectedMinutesInOven() - remainingMinutesInOven(minutes);

        int totalTime = timeInLayers + timeRestantInTheOven;   

        return totalTime;
    }
}
