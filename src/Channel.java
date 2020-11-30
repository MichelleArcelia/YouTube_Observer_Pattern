
import java.util.*;

public class Channel implements Subject {
	
	
	
	private ArrayList <Observer> observers = new ArrayList<Observer>();
	
	private String channelName;
	
	private String status;
	
	public Channel(String channelName, String status) {
		this.channelName = channelName;
		this.status = status;
	}
	
// GET & SET - CHANNEL NAME	
	
	public String getChannelName() {
		return channelName;
	}
	
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
//GET & SET - STATUS	
	
	public String getStatus() {
		return status;
	}
	
	
	public void setStatus(String status) {
		this.status = status;
		notifyObservers();
	}

	
	public void registerObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer obs : observers) {
			obs.update(this.status);
			
		}
	}
}
