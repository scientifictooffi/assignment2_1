import java.util.ArrayList;

public class WagonRet extends Wagon{
    public ArrayList<Passenger> passengers;
    public WagonRet(){}

    public WagonRet(int seats, int id, double capacity){
        super(seats,id,capacity);
        passengers = new ArrayList<>();

    }
}
