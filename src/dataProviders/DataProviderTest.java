package dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @DataProvider(name="teacher")
  
  public String[][] myData() {
	  String data[][]={{"Dhanshri","Kadam","9878987898"},{"Varsha","Adake","6746758789"},{"Alka","Sawant","6565456545"}};
	  return data;
  
}
  @DataProvider(name="student")
  public String[][] myData1(){
	  String data[][]= {{"Sakshi","Chaudary","8787876567"},{"Sahil","Nikhumbh","9878787878"},{"Shreyash","Karanjkar","989898989"}};
	  return data;
	  }
  }
