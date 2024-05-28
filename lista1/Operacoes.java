import java.util.Scanner;

public class Operacoes{
    private int numero1, numero2, numero3, numero4;

    //getset
    public int getNumero1(){return this.numero1;}
    public int getNumero2(){return this.numero2;}
    public int getNumero3(){return this.numero3;}
    public int getNumero4(){return this.numero4;}
    public void setNumero1(int novoValor){this.numero1 = novoValor;}
    public void setNumero2(int novoValor){this.numero2 = novoValor;}
    public void setNumero3(int novoValor){this.numero3 = novoValor;}
    public void setNumero4(int novoValor){this.numero4 = novoValor;}
    //imprimeresultado

    public void imprimeResultado(){
        int multiplica = numero1*numero2;
        int subtrai = numero3 - numero4;
        int resultado = multiplica+subtrai;
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        operacoes.setNumero1(a);
        operacoes.setNumero2(b);
        operacoes.setNumero3(c);
        operacoes.setNumero4(d);

        operacoes.imprimeResultado();
        scanner.close();
        
    }
}