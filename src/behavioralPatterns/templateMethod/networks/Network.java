package behavioralPatterns.templateMethod.networks;

public abstract class Network {
    protected String userName;
    protected String password;

    public Network() {}

    /**
     * Post data in any network.
     */
    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }

        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
