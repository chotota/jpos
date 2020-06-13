package Tools.Maven_Jpos;
import org.jpos.iso.*;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("---Test---");

        		try{
        			ISOMsg m = new ISOMsg();

        			 m.set(new ISOField(0,"0800"));
        			 m.set(new ISOField(3,"000000"));
        			 m.set(new ISOField(11,"000001"));
        			 m.set(new ISOField(41,"29110001"));
        			 m.set(new ISOField(60,"jPOS 6"));
        			 m.set(new ISOField(70,"301"));
        			System.out.println(m);
        		}catch(Exception e){
        			e.printStackTrace();
        		}
        	}
}
