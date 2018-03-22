package behavioralPatterns.templateMethod;

import behavioralPatterns.templateMethod.networks.Facebook;
import behavioralPatterns.templateMethod.networks.Network;
import behavioralPatterns.templateMethod.networks.Twitter;

public class Main {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "Admin123";
        String message = "Hello world";

        System.out.println("Facebook social network for posting message:");
        Network network = new Facebook(userName, password);
        network.post(message);

        System.out.println();
        System.out.println("Twitter social network for posting message:");
        network = new Twitter(userName, password);
        network.post(message);
    }
}
