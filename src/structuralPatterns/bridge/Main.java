package structuralPatterns.bridge;

import structuralPatterns.bridge.impl.model.device.Radio;
import structuralPatterns.bridge.impl.model.device.Tv;
import structuralPatterns.bridge.impl.model.remote.AdvancedRemote;
import structuralPatterns.bridge.impl.model.remote.BasicRemote;

public class Main {
    public static void main(String ...args) {
        System.out.println("Radio with basic remote:");
        System.out.println("_______________________");
        Radio radio = new Radio();
        BasicRemote basicRemote = new BasicRemote(radio);
        basicRemote.power();
        basicRemote.channelUp();
        radio.printStatus();

        System.out.println();
        System.out.println("Tv with advanced remote:");
        System.out.println("_______________________");
        Tv tv = new Tv();
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);
        advancedRemote.power();
        advancedRemote.volumeUp();
        advancedRemote.volumeUp();
        tv.printStatus();
        advancedRemote.mute();
        tv.printStatus();
    }
}
