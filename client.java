import java.net.*;
import java.io.*;

public class client{
	public static void main(String[] args) throws IOException {
		Socket sk = new Socket("127.0.0.1",5000);
	  BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
	  PrintStream sout=new PrintStream(sk.getOutputStream());
	  BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
	  String s;
	  while (  true )
	  {
	   System.out.print("Client : ");
	   s=stdin.readLine();
	   sout.println(s);
	                        if ( s.equalsIgnoreCase("BYE") )
	                        {
	                           System.out.println("Connection ended by client");
	                           break;
	                        }
	   s=sin.readLine();
	   System.out.print("Server : "+s+"\n");
	     
	  }
	   sk.close();
	   sin.close();
	   sout.close();
	   stdin.close();
	}
}


/*
import java.net.*;
import java.io.*;

public class client{
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 4999); 

		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("hello");
		pr.flush();
	}

}
*/