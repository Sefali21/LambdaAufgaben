package aufgabe1;

import java.lang.management.OperatingSystemMXBean;

public class Calculator {
    public double calculate(double zahl1, double zahl2, Operation ops){
        return ops.execute(zahl1,zahl2);
    }

    Operation ops=(double a, double b)->{return 0;};
}
