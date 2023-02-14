import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    String outputString = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message")) {
            String query = url.getQuery();
            outputString += query.substring(2, query.length()) + "\n";
            return(outputString);
        }
        else {
            return "Error 404";
        }
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("ERROR - Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
