package mapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

    public static void main(String[] args) throws IOException {

        ObjectMapper om = new ObjectMapper();

        File inputdata = new File("../../resources/data.json");

        userData[] ud = om.readValue(inputdata, userData[].class);

        for (userData ele : ud) {
            System.out.println(ele.name);
        }
    }
}
