package ¸¨Öú¹¤¾ß°ü;

public class stu {
	String stuID;
	String stuname;
	String classname;
	int classID;
	String institute;
	int achievement;
	
	public stu() {
		// TODO Auto-generated constructor stub
	}
	
	public stu(String stuID, String stuname, String classname, int classID, String institute, int achievement) {
		super();
		this.stuID = stuID;
		this.stuname = stuname;
		this.classname = classname;
		this.classID = classID;
		this.institute = institute;
		this.achievement = achievement;
	}
	
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public int getAchievement() {
		return achievement;
	}
	public void setAchievement(int achievement) {
		this.achievement = achievement;
	}
}
