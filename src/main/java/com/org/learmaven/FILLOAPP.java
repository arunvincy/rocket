package com.org.learmaven;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebElement;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FILLOAPP {
	
	//public static String strQuery;
	//Fillo fillo;
	//static Connection connection;
	//static Recordset recordset;
		// TODO Auto-generated constructor stub
	
	 
	public static String getTestValue(String fieldName, String qry) throws FilloException{
	    	
	    	//System.out.println("TCID1="+TCID);
	    	System.out.println("fieldName1="+fieldName);
	        String testString=xlTesting(fieldName,qry);
	        System.out.println("testString="+testString);
	        return testString;

	    }
	public static String xlTesting(String fieldName, String qry) throws FilloException{
        String testval=null;
       // System.out.println("tstval="+testval);
        Fillo fillo=new Fillo();
       
		Connection connection=fillo.getConnection("resources/TestData.xlsx");
       String strQuery=qry;
        Recordset recordset=connection.executeQuery(strQuery);
        System.out.println();
        
		while(recordset.next()){
            ArrayList<String> dataColl=recordset.getFieldNames();
            System.out.println(dataColl);
            Iterator<String> dataIterator=dataColl.iterator();
            System.out.println(dataColl.size());  

            while(dataIterator.hasNext()){
                for (int i=0;i<=dataColl.size()-1;i++){
                    System.out.println(i);
                    String data=dataIterator.next();
                   
                    System.out.println("data="+data);
                    String dataVal=recordset.getField(data);
                    System.out.println("dataVal="+dataVal);
                  if (data.equalsIgnoreCase(fieldName)){
                        System.out.println("passed");
                        //i=i+1;
                        System.out.println(i);
                        String testData=dataColl.get(i);
                        System.out.println("testData="+testData);
                        System.out.println(recordset.getField(testData));   
                        String testValue= recordset.getField(testData);
                        System.out.println("testValue="+testValue);
                        testval=testValue;
                    }

                }

                break;
            }
        }

        recordset.close();
        connection.close();
        return testval; 
    }


    public static void inputText(WebElement driver, String fieldName, String  qry) throws FilloException{
    	 System.out.println("fieName="+fieldName);
    	 //System.out.println("TID="+TCID);
    	// System.out.println("we="+we);
    	String fval=getTestValue(fieldName, qry);
    	 System.out.println("fval="+fval);
        driver.sendKeys(fval);

    }
    
    
}
