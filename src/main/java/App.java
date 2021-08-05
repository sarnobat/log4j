import org.apache.log4j.Logger;

public class App {

	public static void main(String[] args) {
		System.setProperty("log4j.debug", "true");
		Logger log = Logger.getLogger(App.class);
		log.error(String.format("hello %s", "foobar"));
	}
}
