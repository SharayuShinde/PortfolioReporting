package com.dao;


import com.pojo.Future;
import com.pojo.Security;

public interface FutureDAO {
	public Future getFuture(String SecuritySymbol);
	public Future updateFuture(Future F,String SecuritySymbol);
	public Future deleteFuture(Future F,String SecuritySymbol);
	public Future addFuture(Future F,Security s);
}
