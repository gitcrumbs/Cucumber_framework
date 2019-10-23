package utils;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelSheetHelper {
	
	
	public void ReadDataFromExcelSheet(HashMap<String,String>testData,String testclassname) throws FilloException {
		
		String classname = this.getClass().getSimpleName();
		
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection(System.getProperty("user.dir")+"/src/test/resources/TestData/"+testclassname+".xlsx");
		String strQuery="Select * from Sheet1 where ID=100 and name='John'";
		Recordset recordset=connection.executeQuery(strQuery);
		 
		while(recordset.next()){
		System.out.println(recordset.getField("Details"));
		}
		 
		recordset.close();
		connection.close();
	}
	
	public void WritetoExcelSheet(HashMap<String,String>testData,String testclassname) {
		
		Fillo fillo=new Fillo();
		Connection connection;
		String strQuery="Update Sheet1 Set Country='US' where ID=100 and name='John'";
		try {
			connection = fillo.getConnection(System.getProperty("user.dir")+"/src/test/resources/TestData/"+testclassname+".xlsx");
			connection.executeUpdate(strQuery);
			 
			connection.close();
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	//Where condition
	//Recordset recordset=connection.executeQuery("Select * from Sheet1").where("ID=100").where("name='John'");
	
	//Multiple Where conditions
	//Recordset recordset=connection.executeQuery("Select * from Sheet1 where column1=value1 and column2=value2 and column3=value3");	
	
	//LIKE Operator
	//Recordset recordset=connection.executeQuery("Select * from Sheet1 where Name like 'Cod%'");	 
		
		
	//	Set table starting row and column
		
		/*
		 * System.setProperty("ROW", "5");//Table start row System.setProperty("COLUMN",
		 * "3");//Table start column Fillo fillo=new Fillo(); Connection
		 * connection=fillo.getConnection(strFile);
		 */	
		
		
	}
	

}
