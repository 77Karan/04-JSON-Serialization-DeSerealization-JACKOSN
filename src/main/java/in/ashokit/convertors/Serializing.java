package in.ashokit.convertors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.beans.Address;
import in.ashokit.beans.Person;
public class Serializing 
{
	public static void main(String[] args) throws JsonProcessingException 
	{
		Address a1 = new Address("Bangalore","India",9);
		Person p1 = new Person(12,"karan",12,a1);
		ObjectMapper mapper = new ObjectMapper();
		String jason = mapper.writeValueAsString(p1);
		System.out.println(jason);
		
	}

}
