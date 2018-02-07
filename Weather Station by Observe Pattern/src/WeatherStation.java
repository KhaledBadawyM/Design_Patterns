
public class WeatherStation {
	
	public static void main(String[]args) {
		//System.out.println("i'm in weatherStation");
		WeatherData weatherData = new WeatherData() ;
		CurrentConditionDisplay CurrentDisplay = 
				new CurrentConditionDisplay(weatherData) ;
		
		weatherData.setMeasurements(80 , 65 , 30.4f) ;
		weatherData.setMeasurements(82 , 70 , 29.2f) ;
	}

}
