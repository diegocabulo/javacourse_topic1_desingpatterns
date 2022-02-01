package musicshop;


public class MusicPlayer implements Player{
    private final String color;
    private final Integer storageCapacity;
    private final Integer batteryLife;

    public MusicPlayer(String color, Integer storageCapacity, Integer batteryLife) {
        this.color = color;
        this.storageCapacity = storageCapacity;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Music player specs \n" + "color: " + color + "\n" + "Storage capacity: " + storageCapacity + "\n" +
                "Battery life: " + batteryLife + "\n";
    }
}
