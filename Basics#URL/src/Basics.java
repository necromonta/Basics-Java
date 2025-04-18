
import java.io.BufferedReader;
import java.net.*;   
import java.io.IOException;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
public class Basics {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
 //url basic stuff
// URL url=new URL("http://195.199.226.34/helyettesites/");    
//   System.out.println("Protocol: "+url.getProtocol());  
//System.out.println("Host Name: "+url.getHost());  
//System.out.println("Port Number: "+url.getPort());  
//System.out.println("File Name: "+url.getFile());  

    
//source code of the webpage 
   // try{    
//URL url2=new URL("http://195.199.226.34/helyettesites/");    
//URLConnection urlcon=url2.openConnection();    
//InputStream stream=urlcon.getInputStream();    
//int i;    
//while((i=stream.read())!=-1){    
//System.out.print((char)i);    
//}    
//}catch(Exception e){System.out.println(e);}  
 
  //idk dates
//    try{    
//URL url3=new URL("http://195.199.226.34/helyettesites/");    
//HttpURLConnection huc=(HttpURLConnection)url3.openConnection();  
//for(int i=1;i<=8;i++){  
//System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
//}  
//huc.disconnect();   
//}catch(Exception e){System.out.println(e);}    
    
   // ip adddress of a website
//    try{  
//InetAddress ip=InetAddress.getByName("http://195.199.226.34/helyettesites/");  
//  
//System.out.println("Host Name: "+ip.getHostName());  
//System.out.println("IP Address: "+ip.getHostAddress());  
//}catch(Exception e){System.out.println(e);}  
    


//reading text
//Instantiating the URL class
//      String custom="http://195.199.226.34/helyettesites/";
//      URL url = new URL("http://195.199.226.34/helyettesites/");
//      //Retrieving the contents of the specified page
//      Scanner sc = new Scanner(url.openStream());
//      //Instantiating the StringBuffer class to hold the result
//      StringBuffer sb = new StringBuffer();
//      while(sc.hasNext()) {
//         sb.append(sc.next()+" ");
//         System.out.println(sc.next());
//      }
//      //Retrieving the String from the String Buffer object
//      String result = sb.toString();
//      //Removing the HTML tags
//      result = result.replaceAll("<[^>]*>", " ");
//      System.out.println("Contents of the web page: "+result);


//reding from webpage still
//var url = new URL("http://195.199.226.34/helyettesites/");
//        try (var br = new BufferedReader(new InputStreamReader(url.openStream()))) {
//
//            String line;
//
//            var sb = new StringBuilder();
//
//            while ((line = br.readLine()) != null) {
//
//                sb.append(line);
//                sb.append(System.lineSeparator());
//            }
//
//            System.out.println(sb);
//        }
//
    }
  
   
}
