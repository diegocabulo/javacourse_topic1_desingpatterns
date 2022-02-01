package musicshop;

import musicshop.exceptions.BadInput;

public class GetMusicPlayer {

    public Player getMusicPlayer(String color, Integer storageCapacity, Integer batteryLife) throws BadInput {
        if(color == null || storageCapacity == null || batteryLife == null){
            return null;
        }
        String lowerCaseColor = color.toLowerCase();
        if (lowerCaseColor.equals("blue") || lowerCaseColor.equals("green")){
            if(storageCapacity == 8 || storageCapacity == 16){
                if (batteryLife == 8 || batteryLife == 5){
                    return new MusicPlayer(lowerCaseColor, storageCapacity, batteryLife);
                }
            }
        }
        throw new BadInput("Input not match inventory");
    }
}
