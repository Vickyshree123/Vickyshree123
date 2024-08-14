package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream Fi=new FileInputStream("D:\\Data1\\Shree1.xlsx");
				String F2 = WorkbookFactory.create(Fi).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
				System.out.println(F2);
	}                                                                                                                                                                                                                                                                                   

}
