/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socket;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author TheJenos
 */
@ServerEndpoint("/AngulerJ")
public class Test {

    @OnMessage
    public String onMessage(String message) {
        return "";
    }
    
}
