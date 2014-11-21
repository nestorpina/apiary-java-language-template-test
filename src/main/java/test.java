import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class test {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		Response response = client.target("http://private-74773-nestorpinafernandez.apiary-mock.com")
		  .path("/notes/1111")
		  .request(MediaType.TEXT_PLAIN_TYPE)
		  .get();

		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));
	}

}
