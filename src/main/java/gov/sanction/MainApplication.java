package gov.sanction;

import java.io.IOException;
import java.util.logging.LogManager;

import io.helidon.microprofile.server.Server;

public class MainApplication {

	public static void main(String[] args) throws IOException {

		setupLogging();

		Server server = startServer();
		System.out.println("http://localhost:" + server.port());

	}

	static Server startServer() {
		return Server.create().start();
	}

	private static void setupLogging() throws IOException {
		// load logging configuration
		LogManager.getLogManager().readConfiguration(MainApplication.class.getResourceAsStream("/logging.properties"));
	}

	
}
