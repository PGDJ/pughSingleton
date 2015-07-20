package com.astobie.singleton;

import java.io.Serializable;

public class PughSerializableSingleton implements Serializable {
	
	private static final long serialUID = -8123424535302323232L;
	
	private PughSerializableSingleton (){}
	
	private static class SingletonHelper{
        private static final PughSerializableSingleton instance = new PughSerializableSingleton();
    }
	
	public static PughSerializableSingleton getInstance() {
		return SingletonHelper.instance;
	}
	
	protected Object readResolve() {
	    return getInstance();
	}
}
