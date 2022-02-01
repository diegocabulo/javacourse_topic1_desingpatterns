package hotdogstand;

public class Main {
    public static void main(String[] args) {
        //Se instancia cada uno de los productos con las adiciones que se requiere
        HotDog hotDog = new HotDogBuilder(1)
                .setPapitas(true)
                .build();
        System.out.println(hotDog);
        HotDog hotDog1 = new HotDogBuilder(2)
                .setPapitas(true)
                .setTocineta(true)
                .build();
        System.out.println(hotDog1);
    }
}
