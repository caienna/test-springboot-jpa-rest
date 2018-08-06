package com.ap.webmovies.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ap.webmovies.messenger.model.Message;
import com.ap.webmovies.messenger.service.MessageService;

@Path("/messanges")
public class MessageResource {
	
	MessageService messageService
	=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessage();
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
}
