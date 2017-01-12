package second;

/**
 * Created by YS on 2017-01-08.
 */
public class TcpFlowcontrol {


    //tcp flow control
    // what is it
    /**
    * flow control is a mechanism used in TCP/IP connection to find
    * a adequate sending rate and receiving rate between 2 party
    *
    * for instance
    * sender has a gbps internet connection where as receiver has a
    * dialup connection
    *
    * eventhough sender sends a data very fast,
    * due to client small band width
    * there will be the packet loss
    *
    * to prevent this scenario, to find a optimal rate of transmission
    * this mechanism is used in TCP/IP
    *
    * 1. stop and wait mechanism
    * this method will send 1 packet and wait 1 until it received
    * and moved to next one to process
    *
    * 2. sliding window
    *  window is a fixed size of buffer
    *  sender will send a packet with this window sized amount of packet
    *  without checking ack,repsonse from receiver
    *  when it receives the ack from receiver,
    *  it will slide, move to next data to process and send
    *
    *
    *
    * congestion control
     *
     * this is a mecahnism used in TCP/IP communication
     * to find a optimal rate between network and host
      * e.g: router and sender
       *
       * in networking environment,
       * you're not the only one who connects to router
       * that means you're sharing the network bandwidth with otheres
       *
       * so to find a optimal rate of data transmission,
       * there's a few methodology uses
       *
       * 1. AIMD
       * sender starts sending packet size of 1
       * everytime it sends successfully,
       * it will increase the size of buffer by 1
       * when collision detects, it will decrease buffer size by half of its current buffer size
       *
       * 2. slow start
       * seder start sending packet size of 1
       * but if it successfully sends a window size of packet,
        * it will muliple by 2
        * but collision detected , it will reduce the size to 1
        *
        *3. fast retransmit
        * similar as slow start mechanism,
        * when sender receives duplicated to ack from receiver,
         * it will window size decrease by half
        *
        *4. fast recovery
     *
     *
    * */
}
