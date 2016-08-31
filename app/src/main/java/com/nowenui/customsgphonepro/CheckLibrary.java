package com.nowenui.customsgphonepro;

class CheckLibrary {

	static String checkValidData(String data) {
		String tempData = data;
		if (tempData == null || tempData.length() == 0) {
			tempData = "NA";
		}
		return tempData;
	}

}
