package hello;

public class Main {



	public static void main(String ... args) throws Exception {

        java.util.Properties p = new java.util.Properties();
        p.load(Main.class.getResourceAsStream("/app.props"));

        System.out.println( "app version is: " + p.getProperty("app.version"));

	}
}