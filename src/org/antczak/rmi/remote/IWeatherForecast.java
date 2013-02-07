package org.antczak.rmi.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IWeatherForecast extends Remote {

	public String[][] getConditions(String city) throws RemoteException;

}