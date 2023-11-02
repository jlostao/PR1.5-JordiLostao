package cat.iesesteveterradas.mp06.uf1.pr15;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SaveFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> bookList = objectMapper.readValue(new File("data/llibres_input.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Map.class));
        objectMapper.writeValue(new File("data/llibres_output.json"), bookList);
        System.out.println("Dades guardades a sortida.json!");
    }
}
