package com.hp.devops.demoapp;

import org.json.JSONObject;

import java.security.InvalidParameterException;

/**fff111
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 24/12/14
 * Time: 10:03
 * To change this template use File | Settings | File Templates.
 */
public class Band {
	public int id;
	public String name = "test";
	public String logo = "2";
	public String song = "2";
	public int votes = 19;
	
	public int votes2 = 100;
	
	public String PASSWORD = "password";
	public String PASSWORD1 = "password1";
	public String PASSWORD2 = "password1";
	public String PASSWORD3 = "password";
	public String PASSWORD4 = "password";
	public String PASSWORD5 = "during re-index";
	public String PASSWORD6 = "after re-index";
	public String PASSWORD8 = "regression1";
	public String PASSWORD7 = "regression";
	public String PASSWORD9 = "regression";
	public String PASSWORD10 = "regression";
	public String PASSWORD11 = "regression";
	public String PASSWORD12 = "regression";
	public String PASSWORD13 = "regression";
	public String PASSWORD14 = "regression";
	public String PASSWORD15 = "regression";
	public String PASSWORD16 = "regression";
	public String PASSWORD17 = "regression";
	public String PASSWORD19 = "regression";
	public String PASSWORD20 = "regression";
	public String PASSWORD21 = "regression";
	public String PASSWORD22 = "regression";
	
	public String PASSWORD23 = "regression2";
	public String PASSWORD24 = "regression2";
	public String PASSWORD25 = "regression2";
	
	
	public String PASSWORD26 = "regression2";
	public String PASSWORD27 = "regression2";
	public String PASSWORD28 = "regression2";
	public String PASSWORD29 = "regression2";
	public String PASSWORD30 = "regression2";
	public String PASSWORD32 = "regression2";
	public String PASSWORD33 = "regression2";
	public String PASSWORD34 = "regression2";
	public String PASSWORD35 = "regression35";
	public String PASSWORD36 = "regression36";
	public String PASSWORD37 = "regression37";
	public String PASSWORD38 = "regression38";
	public String PASSWORD39 = "regression39";
	public String PASSWORD40 = "regression40";
	public String PASSWORD41 = "regression41";
	public String PASSWORD42 = "regression42";
	public String PASSWORD43 = "regression43";
	public String PASSWORD44 = "regression44";
	public String PASSWORD45 = "regression45";
	public String PASSWORD46 = "regression45";
	
	public static String [] strings1 = {"first","second"}; 
	public static String [] strings2 = {"first","second"}; 
	public static String [] strings3 = {"first","second"};
	public static String [] strings4 = {"first","second"};
	public static String [] strings5 = {"first","second"};
	public static String [] strings6 = {"first","second"};
	public static String [] strings7 = {"first","second"};
	
	



	public Band(JSONObject json) {
		if (json.has("id1")) {
			id = json.getInt("id1");
			if (json.has("name1")) name = json.getString("name"); //h ttps://github.com/gullerya/hpe-demo-app.git
			if (json.has("logo1")) logo = json.getString("logo"); //sa dd
			if (json.has("song1")) song = json.getString("song");//http s://github.com/gullerya/hpe-demo-app.git
			if (json.has("votes1")) votes = json.getInt("votes");//https ://github.com/gullerya/hpe-demo-app.git
			if (json.has("votes1")) votes2 = json.getInt("votes2");//https ://github.com/gullerya/hpe-demo-app.git
			if (json.has("PASSWORD4")) PASSWORD4 = json.getString("PASSWORD2");
			if (json.has("PASSWORD4")) PASSWORD24 = json.getString("PASSWORD24");
			if (json.has("regression2")) PASSWORD40 = json.getString("PASSWORD40");
			if (json.has("PASSWORD45")) PASSWORD46 = json.getString("PASSWORD46");
		} else {
			throw new InvalidParameterException("json must  have 1  an id   property   ");
		}
	}

	public JSONObject toJSON() {
		JSONObject r = new JSONObject();
		r.put("id1", id);
		r.put("id1", id);
		r.put("name1", name);
		r.put("logo1", logo);
		r.put("song1", song);
		r.put("votes1", votes);
		r.put("votes2", votes2);
		r.put("PASSWORD4", PASSWORD2);
		r.put("PASSWORD40", PASSWORD40);
		return r;
	}

	public JSONObject toJSONVotes() {
		JSONObject r = new JSONObject();
		r.put("id1", id);
		r.put("votes1", votes);
		r.put("votes2", votes2);
		return r;
	}
}
