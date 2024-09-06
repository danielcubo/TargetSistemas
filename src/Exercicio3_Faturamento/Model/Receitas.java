package Exercicio3_Faturamento.Model;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Receitas {
    private List<Receita> receitas;

    public Receitas() {
        this.receitas = new ArrayList<>();
    }

    // Ler JSON
    public void lerJSON() throws org.json.simple.parser.ParseException {
        JSONParser jsonParser = new JSONParser();
    
        String url = "C:/Users/danie/OneDrive/Tutorial/Languages/Java/TargetSistemas/src/Exercicio3_Faturamento/File/receitas.json";
        // String url = "../File/receitas.json";
    
        try(
            FileReader fileReader = new FileReader(url);
        ) {
            Object objeto = jsonParser.parse(fileReader);
            JSONArray jsonArray = (JSONArray) objeto;
    
            // Iterando sobre o JSONArray
            for(Object jsonReceita : jsonArray) {
                JSONObject objReceita = (JSONObject) jsonReceita;

                int dia = ((Number) objReceita.get("dia")).intValue();
                double valor = ((Number) objReceita.get("valor")).intValue();

                // Criando o objeto a partir do JSON
                Receita receita = new Receita(dia, valor);

                // Colocando o Objeto na Lista
                if(receita.getValor() != 0) {
                    receitas.add(receita);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        /*for(Receita receita : receitas) {
            System.out.println(receita);
        }*/

        System.out.println("A maior receita:");
        Receita maiorReceita = Collections.max(receitas);
        System.out.println(maiorReceita);

        System.out.println("\nA menor receita:");
        Receita menorReceita = Collections.min(receitas);
        System.out.println(menorReceita);
    }
}
