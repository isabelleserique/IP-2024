import java.util.Scanner;

public class TempCelsius {
    private float temp;

    public float getTemp(){return this.temp;}
    public void setTemp(float novoValor){this.temp = novoValor;}

    public void ConverteTemp(){
        float converte = ((temp * (9.0f/5.0f)) + 32.0f);
        System.out.printf("Temperatura em C: %.1f\nTemperatura em F: %.1f", temp, converte);
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        TempCelsius tempCelsius = new TempCelsius();

        float temperatura = scanner.nextFloat();
        tempCelsius.setTemp(temperatura);

        tempCelsius.ConverteTemp();
        scanner.close();
    }
}
