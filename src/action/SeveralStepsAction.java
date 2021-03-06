package action;

public class SeveralStepsAction extends Action{

	protected String mess;
	private int stepstoperform;
	private int stepsdone = 0;
	
	public SeveralStepsAction(int steps){
		super();
		this.stepstoperform = steps;
	}
	
	public SeveralStepsAction(String string, int steps) {
		super(string);
		mess = string;
		this.stepstoperform = steps;
		this.updateMessageStatus();
	}

	public int getStepstoperform() {
		return stepstoperform;
	}

	public void setStepstoperform(int stepstoperform) {
		this.stepstoperform = stepstoperform;
	}

	@Override
	public void doStep() {
		stepsdone++;
		this.updateMessageStatus();
		System.out.println(""+this.getMessage());
		
	}

	@Override
	public boolean stopCondition() {
		return  stepsdone>=stepstoperform;
	}

	private void updateMessageStatus(){
		this.setMessage(mess + "(" + stepsdone + "/" + stepstoperform + ")");
	}
	
}
