package day0319;

import java.util.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class DateNumberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss EEE");
		System.out.println(sdf2.format(date));
		
		//숫자 포맷양식
		int money=5678900;
		double average=98.7657;
		NumberFormat nf1=NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(money));
		
		System.out.println(NumberFormat.getInstance().format(money));
		System.out.println(NumberFormat.getCurrencyInstance().format(money));
		
		NumberFormat nf2=NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(1);
		System.out.println(nf2.format(average));
	}
	
}
