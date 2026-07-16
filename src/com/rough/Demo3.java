package com.rough;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo3 {
	public static void main(String[] args) {
		BigInteger b = new BigInteger("454654564654654654654");
		BigInteger b1 = new BigInteger("4654654654546546546512653265432654654");
		BigDecimal d = new BigDecimal("65465454654.5654654654");
		BigDecimal d1 = new BigDecimal("654654465465464651224154651.56546540002132");
		System.out.println(b.add(b1));
		System.out.println(b.multiply(b1));
		System.out.println(d.add(d1));
		System.out.println(d.multiply(d1));
	}
}