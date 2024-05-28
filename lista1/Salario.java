import java.util.Scanner;
import java.util.Locale;

public class Salario {
    private int horasTrabalhadas;
    private float salarioPorHora;

    public int getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(int horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }

    public float getSalarioPorHora() { return salarioPorHora; }
    public void setSalarioPorHora(float salarioPorHora) { this.salarioPorHora = salarioPorHora; }

    public void imprimeSalario() {
        float salarioTotal = horasTrabalhadas * salarioPorHora;
        System.out.printf("O total do salario eh: %.2f", salarioTotal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Salario salario = new Salario();

        float salarioPorHora = scanner.nextFloat();
        int horasTrabalhadas = scanner.nextInt();
        
        salario.setSalarioPorHora(salarioPorHora);
        salario.setHorasTrabalhadas(horasTrabalhadas);

        salario.imprimeSalario();
        scanner.close();
    }
}