/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerCommunication;

/**
 *
 * @author Tomek
 */
public interface AgentMsgSender {

    public void send(String msg, MessageType msgType);

}
