package ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dto.Contact;

@Path("contact")
public class ContactWS implements IContactWs{

	@GET
	@Path("/contact")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Contact> getContacs() {
		// TODO Auto-generated method stub
		List<Contact> contacts = new ArrayList<Contact>();
		Contact contact = new Contact();
		contact.setAddress("cll");
		contact.setId("1");
		contact.setPhoneNumber("9879");
		contact.setName("naoijd");
		
		contacts.add(contact);
		
		return contacts;
	}

	
}
