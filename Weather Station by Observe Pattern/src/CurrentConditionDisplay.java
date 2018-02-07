//import java.util.Observable;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer , DisplayElement {
	
	Observable observable ;
	private float temperature ;
	private float humidity ; 
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable ;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherData) {
			
			WeatherData weatherData = (WeatherData)o ;
			this.temperature = weatherData.getTemperature();
			this.humidity    = weatherData.getHumidity();
			display();
			
		}
		
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current condition: "+ temperature +"F degrees and "+ humidity + "% humidity");
		
	}

}
