package com.boonamber.examples;

import com.boonamber.AmberV2Client;

public class connect {

	public static void main(String[] args) {
		try {
			AmberV2Client amber = new AmberV2Client("default", "~/.Amber.license");
			System.out.println(amber.getVersion().toString());
		} catch (Exception e) {
			System.out.println("Amber cloud error");
		}
	}

}