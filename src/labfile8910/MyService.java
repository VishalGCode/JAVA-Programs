package labfile8910;
import org.springframework.stereotype.Component;

@Component  // This tells Spring to treat it as a bean
public class MyService {
    public void serve() {
        System.out.println("Service is running...");
    }
}
