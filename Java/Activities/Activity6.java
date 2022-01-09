package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6{

	public static void main(String[] args) throws InterruptedException {
		Plane plane=new Plane(10);
		plane.onboard("Steve");
		plane.onboard("James");
		plane.onboard("Sam");
		plane.onboard("Harry");
		System.out.println("Plane Took off time : "+plane.takeOff());
		System.out.println("Passenger list "+plane.getPassengers());
		plane.Land();
		Thread.sleep(5000);
		System.out.println("Plane Landed at "+plane.getlasttimeLanded());
		
		}
		
	}
	
	
	class Plane{
		private List<String> Passengers;
		private Date lasttimeTookoff;
		private Date lasttimeLanded;
		private int maxPassengers;
		
		
		
		public Plane(int maxPassengers) {
			this.setMaxPassengers(maxPassengers);
			this.Passengers=new ArrayList<>();
		}
		public void onboard(String Passenger) {
			this.Passengers.add(Passenger);
		}
		public Date takeOff() {
			this.lasttimeTookoff=new Date();
			return lasttimeTookoff;
		}
		
		public void Land() {
			this.lasttimeLanded=new Date();
			this.Passengers.clear();
		}
		
		public Date getlasttimeLanded() {
			return lasttimeLanded;
		}
		public List<String> getPassengers(){
			return Passengers;
		}
		public int getMaxPassengers() {
			return maxPassengers;
		}
		public void setMaxPassengers(int maxPassengers) {
			this.maxPassengers = maxPassengers;
		}
		

		}
