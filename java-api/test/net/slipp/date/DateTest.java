package net.slipp.date;

import java.util.Date;

import junit.framework.TestCase;

public class DateTest extends TestCase {
	public void testDate() throws Exception {
		Date now = new Date();
		System.out.println("���� �ð� : " + now);
		System.out.println("���� �и��� : " + now.getTime());
		
		Date date = new Date(00,1,23);
		System.out.println("2013-01-23 : " + date);
		System.out.println(date.getTime());
		
		date = new Date(2013, 1, 22, 11, 23, 33);
		System.out.println("2013-01-23 11:23:33 : " + date);
	}
}
