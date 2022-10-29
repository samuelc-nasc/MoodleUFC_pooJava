package calculadoraFuncional;

public class Calculadora {
    public int battery;
    public int batteryMax;
    public double display;

    public String toString(){
        return "display = "
        + String.format("%.2f, ", display)
        + "battery = "
        + battery;
    }

    public void charge(int carga){
        if((carga+this.battery) < this.batteryMax){
            this.battery += carga;
        }else{
            this.battery = this.batteryMax;
        }
    }

    public void soma(int n1, int n2){
        if(battery > 0){
            this.battery--;
            this.display = n1+n2;
           // System.out.println(toString());
        }else{
            System.out.println("Fail: bateria insuficiente!");
        }
    }

    public void div(int n1, int n2){
        if(this.battery > 0 && n2!=0){
            this.battery--;
            this.display = (double)n1/n2;
           // System.out.println(toString());
        }else if(this.battery > 0 && n2==0){
            System.out.println("Fail: divisao por zero");
            this.battery--;
        }else{
            System.out.println("Fail: bateria insuficiente!");
        }
    }

}
