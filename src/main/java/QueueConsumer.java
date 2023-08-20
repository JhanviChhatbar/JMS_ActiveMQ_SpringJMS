import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {

    // destination is a queue name
    @JmsListener(destination = "demo")
    public void receiveMessage(String message){
        System.out.println(message);
    }
}
