package com.example.main;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class DaoGeneratorClass {

	private static final String GENERATE_PATH = "src-gen";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//package name off the generated file
		Schema schema = new Schema(1, "com.example.daotest");
		System.out.println("main-----------------");
		addPlanList(schema);
		try {
			
			new DaoGenerator().generateAll(schema, GENERATE_PATH);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void addPlanList(Schema schema){
		Entity planlist = schema.addEntity("SimBean");
		planlist.addIntProperty("pid").primaryKey();
		
		planlist.addLongProperty("mId");
		planlist.addDoubleProperty("mTracffic");
		
	}
	

}
