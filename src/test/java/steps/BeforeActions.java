package steps;




import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class BeforeActions  {

	
	@Before
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
				
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/resources/Configurations/LoggerConfigurations.properties");
		SeleniumDriver.setUpDriver();      
      
    }
	
	
	
	public void ReadDataFromExcelSheet() throws FilloException {
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection(System.getProperty("user.dir")+"/src/test/resources/TestData");
		String strQuery="Select * from Sheet1 where ID=100 and name='John'";
		Recordset recordset=connection.executeQuery(strQuery);
		 
		while(recordset.next()){
		System.out.println(recordset.getField("Details"));
		}
		 
		recordset.close();
		connection.close();
	}
	
	
}
