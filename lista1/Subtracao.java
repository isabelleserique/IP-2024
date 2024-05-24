import java.util.Scanner;
public class Subtracao {
    private int numero1, numero2;

    public int getNumero1(){return this.numero1;}
    public int getNumero2(){return this.numero2;}
    public void setNumero1(int novoValor){this.numero1=novoValor;}
    public void setNumero2(int novoValor){this.numero2=novoValor;}

    public void imprimeSub(){int resultado = numero1 - numero2;
        System.out.println("O resultado da subtracao eh: " + resultado);}

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Subtracao subtracao = new Subtracao();

        int numero1 = scanner.nextInt();
        subtracao.setNumero1(numero1);
        int numero2 = scanner.nextInt();
        subtracao.setNumero2(numero2);
        subtracao.imprimeSub();
        scanner.close();
    }
}
