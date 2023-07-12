package aula5;

import java.util.HashMap;
import java.util.Map;

public class TimeComMaiorPontuacao {

    public static void main(String[] args) {
        Map<String, Integer> pontuacoes = new HashMap<>();
        pontuacoes.put("Time A", 10);
        pontuacoes.put("Time B", 15);
        pontuacoes.put("Time C", 8);
        pontuacoes.put("Time D", 12);

        String timeComMaiorPontuacao = getTeamWithHighestScore(pontuacoes);

        System.out.println("Time com a maior pontuação: " + timeComMaiorPontuacao);
    }

    public static String getTeamWithHighestScore(Map<String, Integer> scores) {
        String timeComMaiorPontuacao = null;
        int maiorPontuacao = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String time = entry.getKey();
            int pontuacao = entry.getValue();

            if (pontuacao > maiorPontuacao) {
                maiorPontuacao = pontuacao;
                timeComMaiorPontuacao = time;
            }
        }

        return timeComMaiorPontuacao;
    }
}
