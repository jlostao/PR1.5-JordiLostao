package cat.iesesteveterradas.mp06.uf1.pr15;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadFile {
    
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> bookList = objectMapper.readValue(new File("data/llibres_input.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Map.class));
        String print = "";
        for (Map<String, Object> map : bookList ) {
            print += "Id : " + map.get("id")+" Titol: "+map.get("títol")+" Autor: "+ map.get("autor")+" Any: "+ map.get("any")+"\n";
        }
        System.out.println("#");
        System.out.println(print);
        System.out.println("#");

    }
}
