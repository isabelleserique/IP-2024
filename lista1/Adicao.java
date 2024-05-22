import java.util.Scanner;

public class Adicao {
    private int numero1, numero2;

    public int getNumero1(){
        return numero1;
    }
    public int getNumero2(){
        return numero2;
    }

    public void setNumero1(int novoValor){
        this.numero1 = novoValor;
    }
    public void setNumero2(int novoValor){
        this.numero2 = novoValor;
    }

    public void imprimeResultado(){
        int resultado = numero1 + numero2;
        System.out.println("O resultado da adicao eh: " + resultado);
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Adicao adicao = new Adicao();

        int numero1 = scanner.nextInt();
        adicao.setNumero1(numero1);
        int numero2 = scanner.nextInt();
        adicao.setNumero2(numero2);
        adicao.imprimeResultado();
        scanner.close();
    }
}