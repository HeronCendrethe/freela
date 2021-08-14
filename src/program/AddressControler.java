package program;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;





public class AddressControler extends Address{
	
	
	 public  String findCep(String cep) {
	       
		 
		 String json;
		 String x = null;

	        try {
	            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
	            URLConnection urlConnection = url.openConnection();
	            InputStream is = urlConnection.getInputStream();
	            BufferedReader br = new BufferedReader(new InputStreamReader(is));

	            StringBuilder jsonSb = new StringBuilder();
	            
	            br.lines().forEach(l -> x.chars());
	            
	          
	           
	           


	           

	     

	            

	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }

	      return x;
	     
	    }




	 public void setAddress (String json) {
		 
		Address ad = new Address ();
		
	
	
}
 
}