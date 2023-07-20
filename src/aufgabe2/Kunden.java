package aufgabe2;

public class Kunden implements IDrucker{
    String name;

    public Kunden(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
