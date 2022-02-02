package snssubcriptions;

public class Main {
    public static void main(String[] args) {
        //Initialize products
        Product product1 = new Product("tv", 200);
        Product product2 = new Product("laptop", 500);
        Product product3 = new Product("go pro", 300);
        //Initialize users
        UserProduct user1 = new UserProduct("User 1 test");
        UserProduct user2 = new UserProduct("User 2 test");

        //Initialize publisher
        ProductPublisher productPublisher = new ProductPublisher();

        //Attach user to topic
        productPublisher.attach(user1);
        productPublisher.attach(user2);

        //Publish message if price is updated
        productPublisher.notifyUpdate(product1,250);
        productPublisher.notifyUpdate(product3,125);

        //detach user of the topic
        productPublisher.detach(user2);

        //Publish message if price is updated
        productPublisher.notifyUpdate(product2,350);

    }
}
