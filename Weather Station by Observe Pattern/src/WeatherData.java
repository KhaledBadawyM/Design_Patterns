
import java.util.Observable;
//import java.util.Observer;
public class WeatherData extends Observable {

		private float temperature ;
		private float humidity ;
		private float pressure ;
		
		public WeatherData() {}
		
		public void measurmentsChanged() {
			setChanged();
			notifyObservers();
		}
		
		public void setMeasurements(float temperature ,float humidity ,float pressure ) {
			this.temperature = temperature ;
			this.pressure = pressure;
			this.humidity = humidity ;
			measurmentsChanged() ;
			
		}
		
		public float getTemperature() {
			return temperature ;
		}
		
		public float getPressure() {
			return pressure ;
		}
		
		public float getHumidity() {
			return humidity ;
		}
		
}
