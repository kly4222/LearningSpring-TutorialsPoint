package tutorialspoint;

//For instance, all database queries of an app go
//through this method. Therefore, you can place
//throttling or caching logic here.
//...
public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + this.message);
	}
}
