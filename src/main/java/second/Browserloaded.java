package second;

/**
 * Created by YS on 2017-01-08.
 */

/**
 *
 * explain things happedning in the browser
 * when user type google.com
 * */
public class Browserloaded  {

    /**
     * download of source is concurrent and multiple
     * iimied to browser spec
     * for the multiple request
     *
     * BUT js will be executed in single thread
     * one by one
     *
     *
     *
     * 1. user open browser
     * 2. type url and hit enter
     * 3. local computer will lookup DNS ip address
     * 4. query typed domain to dns
     * 5. dns will return ip
     * 6. browser will make a request to that server, domain replaced with ip address
     * 7. server will respond the result
     * 8. browser wait and receive the server response
     *
     * 10. for HTML
     *     once it receives, HTML parser will process, it will construct DOM tree, document object model tree
     *     after stylsheet downloaded, Stylesheet parser process it, and attach result to DOm tree and,
     *     js downloaded and interpreted by js interpreter
     *     above all result put together, rendered and displayed to the browser
     *
     * */
}
