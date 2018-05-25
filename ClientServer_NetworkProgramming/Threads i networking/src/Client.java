import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("192.168.0.2");
            Socket socket = new Socket(inetAddress, 6780);
            System.out.println("Oprettet forbindelse til server");
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader buff = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader buffKey = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                if (buff.ready()) {
                    System.out.println("from server: " + buff.readLine());
                }
                if (buffKey.ready()) {
                    printWriter.println(buffKey.readLine());
                }
                Thread.sleep(200);
            }
        } catch(Exception e) {

        }
    }
}
