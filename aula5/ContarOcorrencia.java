package aula5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContarOcorrencia {


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("maçã");
        strings.add("laranja");
        strings.add("banana");
        strings.add("maçã");
        strings.add("abacaxi");
        strings.add("maçã");

        Map<String, Integer> ocorrencias = countOccurrences(strings);

        System.out.println("Ocorrências das strings:");
        for (Map.Entry<String, Integer> entry : ocorrencias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countOccurrences(List<String> strings) {
        Map<String, Integer> ocorrencias = new HashMap<>();

        // Contar a frequência de cada string
        for (String string : strings) {
            ocorrencias.put(string, ocorrencias.getOrDefault(string, 0) + 1);
        }

        return ocorrencias;
    }
}
