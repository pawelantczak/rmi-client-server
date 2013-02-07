package org.antczak.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import org.antczak.rmi.remote.WeatherForecast;
import org.antczak.rmi.resources.Messages;

public class WeatherServer {

	WeatherForecast weather;

	public WeatherServer() {

		try {
			weather = new WeatherForecast();
			Naming.rebind(Messages.getString("WeatherServer.0"), weather); //$NON-NLS-1$
		} catch (RemoteException e) {
			System.out
					.println(Messages.getString("WeatherServer.1") + e.getMessage()); //$NON-NLS-1$
		} catch (MalformedURLException e) {
			System.out
					.println(Messages.getString("WeatherServer.2") + e.getMessage()); //$NON-NLS-1$
		}
	}

	public static void main(String[] args) {

		System.setSecurityManager(new RMISecurityManager());
		new WeatherServer();
	}
}
