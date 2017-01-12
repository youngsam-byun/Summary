package second;

/**
 * Created by YS on 2017-01-08.
 * TCP IP definition
 * UDP definition
 * difference
 *
 */
public class TcpipVSUDP {

    /**
     * tcp/ip
     *
     * tcp is a transmission control protocol
     * 1. to establish a connection, it uses a methodology called 3 way handshake
     * 2. it has a reliability
     * 3. it uses error correction
     * 4. it has congestion control
     * 5. slow compare to UDP
     * 6. heavy weighted compare to UDP
     * 7. common header value both protocol has
     *    source port, destination port, checksum
     * 8. additionally TCP/IP has
     *    seq, ack etc
     *    20 bytes header where as UDP 8 byte
     *
     * 9. in most of the aspect that I mentioned before,
     *    UDP is opposite
     * 10. suitable for application requires reliabilty
     *     HTTP, FTP, TELNET
     *
     * UDP
     * 1. user datagram protocol
     * 2. it is fast because it doesn't have error correction
     * 3. packet header is smaller then TCP
     * 4. it does not have congestion control
     * 5. light weight
     * 6, DNS, DHCP, VOIP, video streaming services
     *
     *
     *
     * 3 WAY HANDSHAKE
     * in TCP/IP, this is a methodology used to establish the connection
     * between 2 party
     *
     * 1. host A sends a packet to B
     *    saying "hello" with sequence number x
     *
     * 2. host B responds to A
     *    saying "hi there, and your message well received"
     *    host B sends 2 information
     *    seq number Y
     *    ack  x+1
     *
     * 3. host A
     *    "I also received well"
     *    ack y+1
     *
     *
     * */
}
