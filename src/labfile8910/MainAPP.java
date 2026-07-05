package labfile8910;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

// MainApp is also a Spring component
@Component
public class MainApp {

    @Autowired
    private MyService myService; // Dependency injected by Spring

    public void run() {
        myService.serve(); // Call the service method
    }

    public static void main(String[] args) {
        // Create Spring container using annotation config
        ApplicationContext context = new AnnotationConfigApplicationContext("labfile8910");

        // Get MainApp bean and call run()
        MainApp app = context.getBean(MainApp.class);
        app.run();
    }
}

