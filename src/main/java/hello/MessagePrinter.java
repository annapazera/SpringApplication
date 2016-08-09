package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Anna Kacprzak on 2016-08-09.
 */@Component
public class MessagePrinter{
        final private MessageService service;

        @Autowired
        public MessagePrinter(MessageService service) {
            this.service = service;
        }

        public void printMessage() {
            System.out.println(this.service.getMessage());
        }
}
