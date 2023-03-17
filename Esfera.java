import java.util.Scanner;
import java.lang.Math;
public class Esfera {
    Scanner ler = new Scanner(System.in);
    double raio;
    double pi = Math.PI;
    public void Setraio()
    {
        System.out.println("Digite o valor do raio");
        double raio = ler.nextDouble();
        this.raio = raio;
    }
    public double CalcularVolume()
    {
        return (4.0/3.0)*pi*(Math.pow(raio, 3));
    }
}
