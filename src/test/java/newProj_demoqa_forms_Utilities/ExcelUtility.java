package newProj_demoqa_forms_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static Map<String,String> getMapData() throws IOException 
	{	Map<String,String> testData=new HashMap<String,String>();
		try {
			FileInputStream fileInputStream=new FileInputStream("./File/TryData.xlsx");
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet=workbook.getSheetAt(0);
			int lastRowNumber=sheet.getLastRowNum();
			
			for (int i=0;i<=lastRowNumber;i++)
			{
				Row row=sheet.getRow(i); // enitre row is stored
				Cell keyCell=row.getCell(0);
				String key=keyCell.getStringCellValue().trim();
				Cell valueCell=row.getCell(1);
				String value=valueCell.getStringCellValue();
				testData.put(key, value);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return testData;
	}


public void readExcelHashMap()
{
	try {
		Map<String,String> testData=getMapData();
		for (Entry<String, String> map: testData.entrySet())
		{
			System.out.println("Key= "+map.getKey()+"Value= "+map.getValue());
		}
		
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
