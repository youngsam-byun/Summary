package ssl;

/**
 * Created by YS on 2017-01-08.
 */
public class SSLFlowExplanation {

    /**
     *
     * 1. client hello (cipher suite,key exchange, signature, compression)
     * 2. server hello (cipher suite,key exchange, signature, compression)
     * 3. server sends a certificate
     * 4. server hello done
     * 5. client receives a certificate
     *    inside it has a public key
     *    using this public key
     *    client sends a randomly created value - premaster secret, which encrypted by public key
     * 6. server receives this message, decrpt using its own private key
     *    and find a premaster secret
     * 7. both party will create a master secret value which is a encryption key
     * 8. client sends change cipher spec message
     *    server sends change cipher spec message
     * 9. client finished
     *
     *
     *
     * */

}
