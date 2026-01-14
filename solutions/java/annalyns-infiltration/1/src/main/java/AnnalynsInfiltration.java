class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake == true){
            return false;
        }else{
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true){
            return true;
        }else{
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(prisonerIsAwake == true && archerIsAwake == false){
            return true;
        }else{
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent == true && archerIsAwake == false){
            return true;
        }else if(petDogIsPresent == false && knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true){
            return true;
        }else{
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
