package action;


public class Scenario extends Ordonnanceur {

	@Override
	public void internalStep() {
		Action action;
		action = this.getActions().get(0);
		System.out.print(""+this.getMessage());
		action.doStep();
		if(action.isFinished()){
			this.getActions().remove(0);
		}
	}
	
	/**
	 */
	public void add(Action action){
		this.getActions().add(action);
	}
	
}
