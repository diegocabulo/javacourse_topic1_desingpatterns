package snssubcriptions;

//Class to handle new users
public class UserProduct {
    private String nameUser;

    public UserProduct(String nameUser) {
        this.nameUser = nameUser;
    }

    public void update(Product product){
        System.out.println("Update price");
        System.out.println(nameUser + " Notification ");
        System.out.println(product);
    }
}
