import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {
    public static void main(String[] args) {
        try {

            ObjectMapper mapper = new ObjectMapper();
            //Student aStudent = mapper.readValue(new File("data/sample-lite.json"),Student.class);
            Student aStudent = mapper.readValue(new File("data/sample-full.json"),Student.class);

            System.out.println("First Name = "+aStudent.getFirstName());
            System.out.println("Last Name = "+aStudent.getLastName());

            Address address = aStudent.getAddress();

            System.out.println("City = "+ address.getCity());
            System.out.println("Street = "+ address.getState());

            for (String language: aStudent.getLanguages()) {
                System.out.println(language);
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
