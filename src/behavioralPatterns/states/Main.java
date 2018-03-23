package behavioralPatterns.states;

import behavioralPatterns.states.ui.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        String result = player.getState().onPlay();
        System.out.println("State: " + result);

        result = player.getState().onNext();
        System.out.println("State: " + result);

        result = player.getState().onLock();
        System.out.println("State: " + result);
    }
}
