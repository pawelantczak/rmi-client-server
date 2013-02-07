package org.antczak.rmi.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

import org.antczak.rmi.resources.Messages;

public class WeatherForecast extends UnicastRemoteObject implements
		IWeatherForecast {

	/**
		 * 
		 */
	private static final long serialVersionUID = 7176608305492692370L;
	int i = 0;

	public WeatherForecast() throws RemoteException {
		super();
	}

	@Override
	public String[][] getConditions(String city) throws RemoteException {
		String[][] forecastData = new String[5][5];
		Random generator = new Random(i++);

		if (city.equals(Messages.getString("WeatherServer.3"))) { //$NON-NLS-1$
			for (int i = 0; i < 5; i++) {
				forecastData[i][0] = cutValue(generator.nextFloat() * 60 - 30);
				forecastData[i][1] = (generator.nextInt(82) + 972) + ""; //$NON-NLS-1$
				forecastData[i][2] = cutValue(generator.nextFloat() * 32);
				forecastData[i][3] = cutValue(generator.nextFloat() * 160);
				forecastData[i][4] = cutValue(generator.nextFloat() * 160);
			}
		} else if (city.equals(Messages.getString("WeatherServer.5"))) { //$NON-NLS-1$
			for (int i = 0; i < 5; i++) {
				forecastData[i][0] = cutValue(generator.nextFloat() * 70 - 40);
				forecastData[i][1] = (generator.nextInt(82) + 972) + ""; //$NON-NLS-1$
				forecastData[i][2] = cutValue(generator.nextFloat() * 32);
				forecastData[i][3] = cutValue(generator.nextFloat() * 160);
				forecastData[i][4] = cutValue(generator.nextFloat() * 160);
			}
		}
		return forecastData;
	}

	private String cutValue(float value) {
		String tmp = value + ""; //$NON-NLS-1$
		if (value < 0) {
			tmp = tmp.substring(0, 6);
		} else {
			tmp = tmp.substring(0, 5);
		}
		return tmp;
	}
}