package com.juaracoding.pageobjectkuis.drivers.strategies;


import com.juaracoding.pageobjectkuis.drivers.strategies.GoogleChrome;
import com.juaracoding.pageobjectkuis.drivers.strategies.*;
import com.juaracoding.pageobjectkuis.drivers.strategies.MozillaFirefox;

public class  DriverStrategy2Implementer {

	public static DriverStrategy2 chooseStrategy(String strategy) {
		switch (strategy) {
		case "Chrome":
		return new GoogleChrome();
		
		case "Firefox":
		return new MozillaFirefox();
		default:
			return null;
		}
		
	}

	}

	




