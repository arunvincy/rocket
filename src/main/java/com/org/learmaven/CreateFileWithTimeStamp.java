package com.org.learmaven;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.james.mime4j.field.datetime.DateTime;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
public class CreateFileWithTimeStamp {
	

	public static void main(String[] args) throws IOException{
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM_dd_yy_HH");
		String time = dateFormat.format(now);
		File dir = new File("E://"+time);
		dir.mkdir();
		String pathname = "E://"+time+"//";
		System.out.println(time);
		String destination =  "E:\\tester\\logo.png";
		File f = new File(destination, pathname); 
		
		//Files.move(new File("E:\\test1").toPath(), new File("E:\\test2").toPath(), StandardCopyOption.REPLACE_EXISTING);
		
		 
		Files.copy(Paths.get(destination), Paths.get(pathname), REPLACE_EXISTING);
		//FileUtils.copyFile(destination, new File(pathname)); 
	}
	
		/**	
		DateTime now = DateTime.now( DateTimeZone.UTC );
		String output = now.toString().replace( ":" , "-" ); // Replace colons for compatibility with the Mac HFS+ file system.
		File f = new File( output );
		f.mkdir();
	}
		
	
	 Date date =new Date();
    String s=""+date;
    File file = new File("E:\\"+s);
    file.mkdir();
}
	{
		Date now = new Date();
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("hh mm ss");
	String time = dateFormat.format(now);
	File dir = new File(time);
	dir.mkdir();
	}
	 /** 
    {
		GetCurrentTimeStamp();
    }

  //Create a new file
    public static void CreateFileWithTimeStamp(String filename) {
        //get current project path
        String filePath = System.getProperty("user.dir");
        //create a new file with Time Stamp
        File file = new File(filePath + "\\" + filename+GetCurrentTimeStamp().replace(":","_").replace(".","_")+".txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File is created; file name is " + file.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        // Get current system time
    public static String GetCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");// dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }
    // Get Current Host Name
    public static String GetCurrentTestHostName() throws UnknownHostException {
        InetAddress localMachine = InetAddress.getLocalHost();
        String hostName = localMachine.getHostName();
        return hostName;
    }

    // Get Current User Name
    
    public static String GetCurrentTestUserName() {
        return System.getProperty("user.name");
    }
**/

    }	


