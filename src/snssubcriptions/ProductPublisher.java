package snssubcriptions;

import java.util.ArrayList;
import java.util.List;

// Publisher is a List class to attach or detach user, users attached are notified
public class ProductPublisher {

    private List<UserProduct> observers = new ArrayList<>();

    public void attach(UserProduct userProduct){
        observers.add(userProduct);
    }

    public void detach(UserProduct userProduct){
        observers.remove(userProduct);
    }

    public void notifyUpdate(Product product, Integer changePrice){
        product.setPrice(changePrice);
        for(UserProduct user : observers){
            user.update(product);
        }
    }
}
