package factoryMethod;

interface Button{
    void click();
    void createButton();
}

class HTMLButton implements Button {
    public void click() {
        System.out.println("HTMLButton click");
    }

    public void createButton() {
        System.out.println("init HTMLButton");
    }
}

class WindowButton implements Button {
    public void click() {
        System.out.println("WindowButton click");
    }

    public void createButton() {
        System.out.println("init WindowButton");
    }
}

abstract class Dialog {
    protected Button button;

    abstract public void render();
}

class WindowDialog extends Dialog {
    private Button button;

    public void render() {
        this.button = new WindowButton();
        this.button.createButton();
        System.out.println("rendering....");
    }
}

class HTMLDialog extends Dialog {
    private Button button;

    public void render() {
        this.button = new HTMLButton();
        this.button.createButton();
        System.out.println("rendering....");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("---windowDialog---");
        Dialog windowDialog = new WindowDialog();
        windowDialog.render();

        System.out.println();
        System.out.println("---htmlDialog---");
        Dialog htmlDialog = new HTMLDialog();
        htmlDialog.render();

        // I am not sure, looks like simple initialization, init method
        // normally it should be `Button createButton() {}`, but I don't know how to realize it
        System.out.println("factory method!!!!!");
    }
}
