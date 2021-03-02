package principal;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EcuacionCuadratica {
    public double a;
    public double b;
    public double c;

    public EcuacionCuadratica (){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public EcuacionCuadratica (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean haySolucion() {
        if (a==0 || a==0 && b==0 && c!=0)
            return false;
        if (b*b < 4*a*c)
            return false;
        return true;
    }

    public List<Double> solucion() {
        List<Double> v = new ArrayList<>();
        if (haySolucion()) {
            double disc = b*b - 4*a*c;
            if (disc > 0) {
                double v1 = (-b + Math.sqrt(disc)) / (2 * a);
                double v2 = (-b - Math.sqrt(disc)) / (2 * a);
                v.add(v1);
                v.add(v2);
            }
            else if (disc == 0) {
                double v1 = -b / (2 * a);
                v.add(v1);
            }
        }
        return v;
    }
}
