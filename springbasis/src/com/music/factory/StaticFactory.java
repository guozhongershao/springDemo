package com.music.factory;

import com.music.bean.User;

public class StaticFactory {
	
	public static User staticGetUser(){
		return new User();
	}
}
