package com.company.billing.utils;

import java.util.ResourceBundle;

public interface ConfigReader {
	ResourceBundle CONFIG_BUNDLE = ResourceBundle.getBundle("config");
	String DB_USERID = "userid";
	String DB_PWD = "password";
	String DB_URL = "dburl";
	String DRIVER = "driver";
	String BROWSE_PATH = "excel_products_upload_path";
}
