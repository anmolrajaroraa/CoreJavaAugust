package com.company.billing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.company.billing.model.Product;

public interface ExcelReader {
	public static ArrayList<Product> readXLS(File file) throws IOException {
		
		boolean isFirstPass = true;
		ArrayList<Product> productsList = new ArrayList<>();
		
		try(FileInputStream fis = new FileInputStream(file);
				HSSFWorkbook workbook = new HSSFWorkbook(fis);){
			HSSFSheet productsSheet = workbook.getSheet("Sheet1");
			Iterator<Row> rows = productsSheet.rowIterator();
			while(rows.hasNext()) {
				int cellCounter = 1;
				Row currentRow = rows.next();
				
				if(isFirstPass) {
					isFirstPass = false;
					continue;
				}
				
				Product product = new Product();
				Iterator<Cell> cells = currentRow.cellIterator();
				while(cells.hasNext()) {
					Cell currentCell = cells.next();
					switch(cellCounter) {
					case 1: 
						product.setName(currentCell.getStringCellValue());
						break;
					case 2: 
						product.setCategory(currentCell.getStringCellValue());
						break;
					case 3: 
						product.setId(currentCell.getStringCellValue());
						break;
					case 4: 
						product.setPrice(currentCell.getNumericCellValue());
						break;
					case 5: 
						product.setPath(currentCell.getStringCellValue());
						break;
					case 6: 
						product.setDescription(currentCell.getStringCellValue());
						break;
					case 7: 
						product.setBrand(currentCell.getStringCellValue());
						break;
					}
					cellCounter++;
				}  // cell loop ends here
				productsList.add(product);
			}
			return productsList;
		}
	}
}