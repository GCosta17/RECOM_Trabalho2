import java.util.Scanner;

public class RFreception {
    double r = (3*Math.pow(10, 8)) / (5*Math.pow(10, 9));
    double e = (3*Math.pow(10, 8)) / (2.4*Math.pow(10, 9));

    public double calculateInDoorSimulatorFunctionFREQ2_4 (double a, double v, float g, double e, float d, float y, float n, float k, float p, float j, float l){
        double powerReceived = a + v + g +(20*Math.log10(e)) - (20*Math.log10(4*Math.PI)) - (20*Math.log10(d)) - y*n - k*p - j*l;
       return powerReceived;
    }

    public double calculateInDoorSimulatorFunctionFREQ5 (double t, double b, float g, double r, float d, float y, float n, float k, float p, float j, float l){
        double powerReceived = t+ b + g +(20*Math.log10(r)) - (20*Math.log10(4*Math.PI)) - (20*Math.log10(d)) - y*n - k*p - j*l;
        return powerReceived;
    }

}