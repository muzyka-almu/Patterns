package builder.model;

public class Manual {
    private String doc = "";

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void addDoc(String someInfo) {
        doc =  doc + "\n" + someInfo;
    }

    public void showDoc() {
        System.out.println(doc);
    }
}
