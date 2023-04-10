package com.containment;

public class Author {
  private int aid;
  private String name;
  private int age;
  
  Author(){
	   
  }
  
  Author(int aid,String name, int age){
	  this.aid=aid;
	  this.name=name;
	  this.age=age;  
  }
  
  public int getAid() {
	  return aid;
  }
  public void setAid(int aid) {
	  this.aid=aid;
  }
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  this.name=name;
  }
  public int getAge() {
	  return age;
  }
  public void setAge(int age) {
	  this.age=age;
  }
  public String toString() {
	  return "Author :"+aid+" "+name+" "+age;
  }
}
