import java.util.ArrayList;

public class Platscart extends Wagon{
    public ArrayList<Passenger> passengers;
    public Platscart(){}

    public Platscart(int seats, int id, double capacity){
        super(seats,id,capacity);
        passengers = new ArrayList<>();

    }
}
