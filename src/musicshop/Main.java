package musicshop;

import musicshop.exceptions.BadInput;

public class Main {
    public static void main(String[] args) throws BadInput {

        GetMusicPlayer musicPlayer = new GetMusicPlayer();

        Player myMusicPlayer = musicPlayer.getMusicPlayer("green", 8, 5);
        System.out.println(myMusicPlayer);
        Player myMusicPlayer1 = musicPlayer.getMusicPlayer("blue", 16, 8);
        System.out.println(myMusicPlayer1);

    }
}
