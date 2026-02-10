public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character c1){

        return "You're a level " + c1.getLevel() + " " + c1.getCharacterClass() + " with " + c1.getHitPoints() + " hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination d1){

        return "You've arrived at " + d1.getName() + ", which has " + d1.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod TM1){
        
        switch(TM1){
            case WALKING: return "You're traveling to your destination by walking.";
            case HORSEBACK: return "You're traveling to your destination on horseback.";    
            default: return "";
        }
    }
    
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character c1, Destination d1, TravelMethod TM1){

        return "You're a level " + c1.getLevel() + " " + c1.getCharacterClass() + " with " + c1.getHitPoints() + " hit points. " + describe(TM1) + " You've arrived at " + d1.getName() + ", which has " + d1.getInhabitants() + " inhabitants.";
    }


    // TODO: define a 'describe' method that returns a description of a Character and Destination

    public String describe(Character c1, Destination d1){

        return "You're a level " + c1.getLevel() + " " + c1.getCharacterClass() + " with " + c1.getHitPoints() + " hit points. You're traveling to your destination by walking. You've arrived at " + d1.getName() + ", which has " + d1.getInhabitants() + " inhabitants.";
    }
}
