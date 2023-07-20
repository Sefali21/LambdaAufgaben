package aufgabe2;

public class Main {
    public static void main(String[] args) {

        Kunden kunden1=new Kunden("Kunden-1");
        Kunden kunden2=new Kunden("Kunden-2");

        IDrucker drucker=()->{return "\">\"";};
        System.out.println(drucker.getInfo());


    }

    public static void drucken(IDrucker... druckbar){
        for (IDrucker tmp:druckbar  ) {
            System.out.println(tmp);
        }
    }
}
