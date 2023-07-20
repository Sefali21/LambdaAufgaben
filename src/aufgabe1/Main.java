package aufgabe1;
/*   Schreiben Sie eine Klasse 'Calculator', die eine Methode 'calculate' enthält,
     mit zwei Zahlen und einem Objekt vom Typ 'Operation' als Parameter und das Ergebnis der Operation als Rückgabe.
    'Operation' ist ein Interface mit der Methode 'execute(int a, int b)'.
     Verwenden Sie anonyme Klassen, um für jede Operation ein Objekt zu erstellen und es der `calculate`-Methode zu übergeben.

     In der Main-Methode erstellen Sie vier anonyme Klassen,
     die das Interface implementieren und 'execute' mit den vier Grundrechenarten überschreiben.
     Danach rufen Sie die 'calculate'-Methode auf und testen alle vier anonymen Klassen.
*/

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Operation add=(double a, double b)->{return a+b;};
//        Operation add = new Operation() {
//            @Override
//            public double execute(double a, double b) {
//                return a + b;
//            }
//        };

        Operation subst = new Operation() {
            @Override
            public double execute(double a, double b) {
                return a - b;
            }
        };

        Operation mal = (double a, double b) -> {
            return a * b;
        };

        Operation div;
        try {
            div = (double a, double b) -> {
                return a / b;
            };
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }

        double a = 10.8789d;
        double b = 0.178d;


        //System.out.println(calculator.calculate(a, b, add));
        System.out.println(String.format("%.3f",calculator.calculate(a,b,add)));
        System.out.println(calculator.calculate(a, b, subst));
        System.out.println(calculator.calculate(a, b, mal));
        System.out.println(String.format("%.3f",calculator.calculate(a,b,div)));


    }
}
