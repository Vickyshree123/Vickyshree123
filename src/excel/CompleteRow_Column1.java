package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompleteRow_Column1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream myFile = new FileInputStream("D:\\exclsheets\\Vikrant.xlsx");
	Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	
	///read complete row
	for(int i=0;i<=2;i++)
	{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value+" ");
	}
	System.out.println();
	System.out.println("==================");
	//read complete column
	for(int i=0;i<=3;i++)
	{
	String value = mySheet.getRow(i).getCell(0).getStringCellValue();
	System.out.print(value+" ");
	}
	System.out.println();
	
	
	
	
}
}
