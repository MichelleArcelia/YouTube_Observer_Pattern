
public class Follower implements Observer {

	private String followerName; 
	
	
	public Follower(String followerName) {
		this.followerName = followerName;
	}
	
	
// GET & SET
	
	public String getFollowerName() {
		return followerName;
	}
	
	public void setFollowerName(String followerName) {
		this.followerName = followerName;
	}
	
	
// will send a message to the followers that we are LIVE
	
	public void update(String status) {
		System.out.println("Your Channel status is: " + status);
	}
	
	public void play() {
		System.out.println("The Channel is playing");
	}
}
