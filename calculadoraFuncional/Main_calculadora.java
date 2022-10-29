package calculadoraFuncional;

import java.util.Locale;
import java.util.Scanner;

public class Main_calculadora {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Battery Max: ");
        calculadora.batteryMax = ler.nextInt();

        while(true){

            //menu
            System.out.println("Digite uma opcao");
            System.out.println("1 - Charge");
            System.out.println("2 - Show");
            System.out.println("3 - Reiniciar");
            System.out.println("4 - Soma");
            System.out.println("5 - Divisao");
            System.out.println("6 - Sair");
            int opcao = ler.nextInt();
            if(opcao==8)break;//verificar se quer sair

            switch (opcao) {
                case 1:
                    System.out.println("Carga: ");
                    int carga = ler.nextInt();
                    calculadora.charge(carga);
                    break;

                case 2:
                    System.out.println(calculadora);
                    break;

                //inicializacao
                case 3:
                    System.out.println("Battery Max: ");
                    calculadora.batteryMax = ler.nextInt();
                    calculadora.battery = 0;
                    break;

                case 4:
                    System.out.println("Digite os dois valores para soma: ");
                    int n1 = ler.nextInt();
                    int n2 = ler.nextInt();
                    calculadora.soma(n1, n2);
                    break;

                case 5:
                    System.out.println("Digite os dois valores para divisao: ");
                    n1 = ler.nextInt();
                    n2 = ler.nextInt();
                    calculadora.div(n1, n2);
                    break;

                default:
                    break;
            }
            
        }
        ler.close();
    }
}
