import java.util.Scanner;
import java.util.Locale;

public class Multiplica {
    private float numero1, numero2;

    public float getNumero1(){return this.numero1;}
    public float getNumero2(){return this.numero2;}
    public void setNumero1(float novoValor){this.numero1 = novoValor;}   
    public void setNumero2(float novoValor){this.numero2 = novoValor;}
    
    public void imprimeMultiplicacao(){
        float resultado = numero1*numero2;
        System.out.printf("O resultado da multiplicacao eh: %.0f\n", resultado);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Multiplica multiplica = new Multiplica();

        float numero1 = scanner.nextFloat();
        multiplica.setNumero1(numero1);
        float numero2 = scanner.nextFloat();
        multiplica.setNumero2(numero2);

        multiplica.imprimeMultiplicacao();
        scanner.close();

    }

}
