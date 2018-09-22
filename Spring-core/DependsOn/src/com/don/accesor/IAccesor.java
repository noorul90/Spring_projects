package com.don.accesor;

import java.io.IOException;

public interface IAccesor {
	Object getData()throws Exception;
	String getKey();
	void setKey(String key);

}
