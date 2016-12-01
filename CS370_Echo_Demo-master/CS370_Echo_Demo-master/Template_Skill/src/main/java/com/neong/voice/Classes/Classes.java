package com.neong.voice.Classes;

import java.awt.List;

public class Classes {
	private int id;
	private String shortDept;
	private String classNum;
	private String dept;
	private String section;
	private boolean satsEthReq;
	private boolean isLab;
	private float units;
	private String GE;
	private String className;
	private String type;
	private List days;
	private String time;
	private String instructor;
	public int getId() { return id;}
	public void setId(int x) {id = x;}
	public String getShortDept(){return shortDept;}
	public void setShortDept(String s){shortDept = s;}
	public String getClassNum(){return classNum;}
	public void setClassNum(String s){classNum = s;}
	public String getDept(){return dept;}
	public void setDept(String s){dept = s;}
	public String getSection(){return section;}
	public void setSection(String s){section = s;}
	public boolean getEth(){ return satsEthReq;}
	public void setEth(boolean b){ satsEthReq = b;}
	public boolean getIsLab(){return isLab;}
	public void setIsLab(boolean b){isLab = b;}
	public String getGE(){return GE;}
	public void setGE(String s){GE = s;}
	public float getUnits() {return units;}
	public void setUnits(float f){units = f;}
	public String getClassName() {return className;}
	public void setClassName(String s){className = s;}
	public String getType(){return type;}
	public void setType(String s){type = s;}
	public String getDayAt(int i){ return days.getItem(i);}
	public void addDay(String s){ days.add(s);}
	public String getTime(){return time;}
	public void setTime(String s){ time = s;}
	public String getInstructor(){return instructor;}
	public void setInstructor(String s) {instructor = s;}
	
	
	
}
