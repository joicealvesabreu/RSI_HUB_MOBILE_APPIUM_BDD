package br.com.rsinet.bdd.mobile.appium.utility;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {

	public static String dataHoraParaArquivo() {
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyy-MM-dd-hh_mm_ss").format(ts);
		
	}
}
