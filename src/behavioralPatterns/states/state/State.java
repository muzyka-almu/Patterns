package behavioralPatterns.states.state;

import behavioralPatterns.states.ui.Player;

public abstract class State {
    public Player player;

    /**
     * if needed, state can get some data from context
     */
    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
