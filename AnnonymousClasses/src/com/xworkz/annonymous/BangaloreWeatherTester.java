package com.xworkz.annonymous;

public class BangaloreWeatherTester {
	
	public static void main(String[] args) {
		
		BangloreWeather bangloreWeather = new BangloreWeather();
		bangloreWeather.tempInCent(22);
		bangloreWeather.AQI();
		bangloreWeather.humidity();
		
		//Annonymous class
		Weather weather = new Weather() {
			@Override
			public void tempInCent(int temp) {
				System.out.println("Temp in Delhi is :" + temp);
			}
			
			@Override
			public void AQI() {
				System.out.println("AQI in Delhi is :"+ 77);
			}

			@Override
			public void humidity() {
				System.out.println("Humidity in Delhi is :"+ 90 +" %");
			}
		};
		
		weather.tempInCent(26);
		weather.AQI();
		weather.humidity();
		
	}

}
