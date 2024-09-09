package dean.vinicius;

import java.util.ArrayList;
import java.util.List;

public class Faturamento {
    public static void main(String[] args) {

        double[] faturamentos = {100.5, 200.0, 0.0, 300.0, 50.0, 0.0, 0.0, 150.0, 400.0, 0.0, 100.0, 250.0, 0.0, 0.0, 100.0, 0.0, 600.0};

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        List<Integer> diasAcimaDaMedia = new ArrayList<>();

        for (double faturamento :faturamentos){
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        for (int i = 0; i < faturamentos.length; i++) {
            if (faturamentos[i] > mediaFaturamento) {
                diasAcimaDaMedia.add(i + 1);
            }
        }

        // Exibindo os resultados
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Média de faturamento: " + mediaFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia.size());
        System.out.println("Dias específicos acima da média: " + diasAcimaDaMedia);
    }
}
