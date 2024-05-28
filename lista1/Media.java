import java.util.Scanner;
import java.util.Locale;

public class Media {
    private float numero1, numero2, numero3, numero4;
    public float getNumero1(){return this.numero1;}
    public float getNumero2(){return this.numero2;}
    public float getNumero3(){return this.numero3;}
    public float getNumero4(){return this.numero4;}
    public void setNumero1(float novoValor){this.numero1 = novoValor;}
    public void setNumero2(float novoValor){this.numero2 = novoValor;}
    public void setNumero3(float novoValor){this.numero3 = novoValor;}
    public void setNumero4(float novoValor){this.numero4 = novoValor;}

    public void imprimeMedia(){
        float resultado = ((numero1+numero2+numero3+numero4)/4);
        System.out.println("A media das notas eh: " + resultado);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Media media = new Media();

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        media.setNumero1(a);
        media.setNumero2(b);
        media.setNumero3(c);
        media.setNumero4(d);
        media.imprimeMedia();
        scanner.close();
    }
}
