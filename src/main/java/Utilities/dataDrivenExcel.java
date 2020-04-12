package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenExcel {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("C:\\Users\\Chitra\\GitProject\\src\\main\\java\\dataFiles\\dataFilenew.xlsx");
//HSSFWorkbook hwb = new HSSFWorkbook(fis);

XSSFWorkbook xwb = new XSSFWorkbook(fis);
//HSSFWorkbook class is for xls file and XSSFWorkbook class is for xlsx
XSSFSheet xsheet =  xwb.getSheet("Sheet1");



	}

}
