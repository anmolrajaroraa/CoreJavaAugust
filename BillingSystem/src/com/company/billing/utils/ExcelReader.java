package com.company.billing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public interface ExcelReader {
	public static ArrayList readXLS(File file) throws IOException {
		try(FileInputStream fis = new FileInputStream(file);
				HSSFWorkbook workbook = new HSSFWorkbook(fis);){
			HSSFSheet productsSheet = workbook.getSheet("Sheet1");
			return null;
		}
	}
}