package base;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress tao = InetAddress.getByName("TAO");
        System.out.println(tao);

        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);

        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);

        String hostName = byName.getHostName();
        System.out.println(hostName);
    }
}
