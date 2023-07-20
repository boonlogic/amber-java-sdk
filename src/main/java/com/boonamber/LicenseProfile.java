package com.boonamber;

public class LicenseProfile {
	
	public String server = null;
	
	public String licenseKey = null;
	
	public String secretKey = null;
	
	public String oauthServer = null;
	
	public LicenseProfile(String server, String licenseKey, String secretKey) {
		this(server, licenseKey, secretKey, server);
	}
	
	public LicenseProfile(String server, String licenseKey, String secretKey, String oauthServer) {
		this.server = server;
		this.licenseKey = licenseKey;
		this.secretKey = secretKey;
		this.oauthServer = oauthServer;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getOauthServer() {
		return oauthServer;
	}

	public void setOauthServer(String oauthServer) {
		this.oauthServer = oauthServer;
	}

}
