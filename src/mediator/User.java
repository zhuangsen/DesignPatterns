package mediator;

public abstract class User {
	private Mediator mediator;
	
	public User(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public Mediator getmMediator(){
		return mediator;
	}
	
	public abstract void work();
}
