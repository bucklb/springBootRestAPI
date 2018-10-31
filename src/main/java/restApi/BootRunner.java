package restApi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(2)   // in theory can order various command line runners, but not seen much evidence it works !!!
public class BootRunner implements CommandLineRunner{

    @Override  // Need to have some kind of run method BUT it really matters little if it contains code (or what code it has)
    public void run(String... strings) throws Exception {
        // Looks like each runner will get the arguments passed in when called. Lush
        System.out.println(">> ==============================  BootRunner is running \n ... args :" + Arrays.toString(strings));
    }
}
