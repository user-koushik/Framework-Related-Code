package com.mypackage.banking.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mypackage.banking.exception.NoDataFoundException;
import com.mypackage.banking.model.Account;
import com.mypackage.banking.service.AccountService;

/**
 * Root resource (exposed at "myresource" path)
 */
/*@Path("myresource")*/

@Path("accounts")
public class AccountResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	/*
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("welcome")
    public String getIt() {
        return "Got it!";
    }*/
	
		
	AccountService accService = new AccountService();
	
	@GET
	/*@Produces(MediaType.APPLICATION_XML)*/	//TO bind the return object you need to use @XMlRootElement in Account class
	@Produces(MediaType.APPLICATION_JSON)	
    public List<Account> getAccount() {
        return accService.getAccounts();
    }
	
	/*public Account getAccountEx(int id){
		Account account = accounts.get(id);
		
		if(account == null){
		throw new NoDataFoundException("No account found"); 	
		}
		
		return account;
	}*/
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)	
    public Account getAccount(@PathParam("id") int id) {
        return accService.getAccount(id);
    }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAccount(Account account) throws URISyntaxException {
		
		int id= accService.createAccount(account);
		
		// If you want to change the status code while sending response back.
		
		// return Response.status(Status.CREATED).entity(id).build();
		
		//If you want to send the location in header in reponse
		String uri = "/banking/account/project/";
		//For Dynamic location URL you can use //@Context annocation in method paramter like @
		return Response.status(Status.CREATED).entity(id).location(new URI(uri)).build();
	}
}
