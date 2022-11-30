package in.ashokit.convertors;
import java.io.File; //need
import java.io.IOException;//need
import in.ashokit.beans.Person;//need
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;//need

public class DeSerializing 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		File file = new File("person.json");
		ObjectMapper mapper = new ObjectMapper();
		Person p1 = mapper.readValue(file,Person.class);
		System.out.println(p1);
		
		
	}

}
