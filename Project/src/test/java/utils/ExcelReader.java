package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static FileInputStream file;
    /*
     * Method name : getExcelData
     * Author name : C Sai Kiran
     * Description : To send the data from ExcelReader to the DataProviderr
     * Return Type : String data
     * Parameter : path, sheetName
     */
    public static String readData(String path, String sheetName, int r , int c){
        try {
            file = new FileInputStream(path);
            workbook=new XSSFWorkbook(file);
            sheet=workbook.getSheet(sheetName);
            row=sheet.getRow(r);
            cell=row.getCell(c);
            String value=cell.toString();
            return value;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
 
}