package principal;

public class EcuacionLineal {
    public double a;
    public double b;
    public EcuacionLineal(){
        this.a = 0;
        this.b = 0;
    }
    public EcuacionLineal(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public boolean haySolucion(){
        return a != 0 || b == 0;
    }

    public double solucion() {
        if (!haySolucion() || b==0)
            return 0;
        return (-b)/a;
    }
}
