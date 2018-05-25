import java.io.DataOutputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class HTTPRequest  {

    public static void main(String[] args){
        try {

            //lav en connection på følgende måde:

            URL url = new URL("https://www.br.dk/");
            //open connection laver et connection object, men laver ikke forbindelsen endnu
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // GET, POST, HEAD, OPTIONS, PUT, DELETE ELLER TRACE
            con.setRequestMethod("GET");

        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
