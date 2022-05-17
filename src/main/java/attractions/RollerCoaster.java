package attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public double defaultPrice() {
        return 8.50;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        if(visitor.getHeight() >200){
            return defaultPrice()*2;
        }
        else{ return defaultPrice();}
    }
}
