package attractions;

import Interfaces.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        if(visitor.getAge() <12){
            return defaultPrice()*0.5;
        }
        else{ return defaultPrice();}
    }
}
