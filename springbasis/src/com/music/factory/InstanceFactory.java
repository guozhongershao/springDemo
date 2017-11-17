package com.music.factory;

import com.music.bean.User;

public class InstanceFactory {
	
	public User instanceGetUser(){
		return new User();
	}
}
