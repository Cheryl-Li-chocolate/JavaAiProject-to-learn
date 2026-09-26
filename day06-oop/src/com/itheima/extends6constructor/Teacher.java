package com.itheima.extends6constructor;

public class Teacher extends People{
    String skill;
    public Teacher(){}
    public Teacher(String name,int age,String skill){
        super(name,age);
        this.skill=skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    @Override
    public String toString(){
        return "Teacher:"+name+" Age:"+age+" Skill:"+skill;
    }
}
