import java.util.Scanner;
import java.util.Locale;

public class Divisao {
    private float numero1, numero2;

    public float getNumero1(){return this.numero1;}
    public float getNumero2(){return this.numero2;}
    public void setNumero1(float novoValor){this.numero1 = novoValor;}
    public void setNumero2(float novoValor){this.numero2 = novoValor;}
    
    public void imprimeDivisao(){
        float resultado = numero1/numero2;
        System.out.printf("O resultado da divisao eh: %.3f\n", resultado);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Divisao divisao = new Divisao();

        float numero1 = scanner.nextFloat();
        divisao.setNumero1(numero1);
        float numero2 = scanner.nextFloat();
        divisao.setNumero2(numero2);

        divisao.imprimeDivisao();
        scanner.close();
    }
}
