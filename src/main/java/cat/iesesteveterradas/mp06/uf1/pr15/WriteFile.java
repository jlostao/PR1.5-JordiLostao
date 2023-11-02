package cat.iesesteveterradas.mp06.uf1.pr15;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> llistaDeLlibres = objectMapper.readValue(new File("data/llibres_input.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Map.class));

        Map<String, Object> map = new HashMap<>();
        map.put("id", 4);
        map.put("títol", "Històries de la ciutat");
        map.put("autor", "Miquel Soler");
        map.put("any", 2022);

        llistaDeLlibres.add(llistaDeLlibres.size(), map);
        objectMapper.writeValue(new File("data/llibres_input.json"), llistaDeLlibres);
        System.out.println("id " +llistaDeLlibres.size()+1 + "afegit");
        System.out.println("Dades guardades a sortida.json!");
        
    }
    
}
