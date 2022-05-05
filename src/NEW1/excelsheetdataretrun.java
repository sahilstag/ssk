package NEW1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheetdataretrun {
	public static  String exceldata(int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\Desktop\\\\\\\\cam\\\\\\\\Book1.xlsx");
		String value= WorkbookFactory.create(file).getSheet("cred1").getRow(row).getCell(cell).getStringCellValue();
		return value;}
	
	
	public static void main (String[] args ) throws EncryptedDocumentException, IOException {
		String value=excelsheetdataretrun.exceldata(0, 1);
		System.out.println(value);
	
		
	}

}
