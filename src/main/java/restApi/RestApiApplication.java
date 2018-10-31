package restApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "restApi")	// <- remember to change this if changing the package name/structure
public class RestApiApplication {

	// All we REALLY need to get this to be started by springBoot.  Needs the component scan & Autoconfig annotation too
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Bean		// make it discoverable by spring.  Spring will run it
	@Order(1)	// ought to control the order in which any runners act.  Doesn't seem to.  If order matters call stuff from ONE CLR
	public CommandLineRunner demo() {

		// CommandLineRunner has a "run" that needs to be implemented.
		// Use a lambda to define/implement it on the fly rather than actually implement CLR.  An effectively empty lambda will suffice ??
		// return (args) -> {};			<- this works too
		return (args) -> {
			System.out.println(">> ==============================  CommandLineRunner is running \n ... args :" + Arrays.toString(args));
		};
	}
}
