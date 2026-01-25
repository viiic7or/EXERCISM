class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class

class Warrior extends Fighter{

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter f){
        if(f.isVulnerable() == true){
            return 10;
        }
        return 6;
    }
}

// TODO: define the Wizard class

class Wizard extends Fighter{
    boolean prepared;

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        prepared = true;
    }

    @Override
    boolean isVulnerable(){
        if (prepared){
            return false;
        }
        return true;
    }

    @Override
    int getDamagePoints(Fighter f){
        if(prepared){
            return 12;
        }
        return 3;
    }
}
