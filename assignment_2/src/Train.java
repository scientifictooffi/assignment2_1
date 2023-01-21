import java.util.ArrayList;

public class Train {
    public String direction;
    public String speed;
    public ArrayList<Wagon> wagons;
    public int power;


    public Train(){}

    public Train(String direction, String speed, int power){
        this.direction = direction;
        this.speed = speed;
        this.power = power;
        wagons = new ArrayList<>();


    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setWagons(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public ArrayList<Wagon> getWagons() {
        return wagons;
    }

    public int getPower() {
        return power;
    }

    public String getSpeed() {
        return speed;
    }

}
