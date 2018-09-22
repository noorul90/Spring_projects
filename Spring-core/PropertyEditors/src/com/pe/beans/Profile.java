package com.pe.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;

public class Profile {
	private int profileId;
	private String displayName;
	private File profPic;
	private URL site;
	private String[] frnds;
	
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public void setProfPic(File profPic) {
		this.profPic = profPic;
	}
	public void setSite(URL site) {
		this.site = site;
	}
	public void setFrnds(String[] frnds) {
		this.frnds = frnds;
	}
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", displayName="
				+ displayName + ", profPic=" + profPic + ", site=" + site
				+ ", frnds=" + Arrays.toString(frnds) + "]";
	}
	
	
}
