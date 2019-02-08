package okteweb.moveblocks.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {


    @MessageMapping("/msg") // /allowDestinationPrefix/msg
    @SendTo("/chanelName/output")
    public void greeting(InputModel inputModel) throws Exception {
        System.out.println(inputModel);
    }


}
