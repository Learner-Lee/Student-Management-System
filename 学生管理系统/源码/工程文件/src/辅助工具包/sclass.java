package ¸¨Öú¹¤¾ß°ü;

public class sclass {
	String classID;
	String classname;
	String teaname;
	String institute;
	public sclass() {
		// TODO Auto-generated constructor stub
	}
	public sclass(String classID, String classname, String teaname, String institute) {
		super();
		this.classID = classID;
		this.classname = classname;
		this.teaname = teaname;
		this.institute = institute;
	}
	public String getClassID() {
		return classID;
	}
	public void setClassID(String classID) {
		this.classID = classID;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getTeaname() {
		return teaname;
	}
	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	
}
