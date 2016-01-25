package memento;

public class Storage {

	private Memento memento;
	
	public Storage(Memento memento) {
		this.setMemento(memento);
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
