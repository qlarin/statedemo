
public class AttackState implements State {
	
	public void doAction(Context context){
		System.out.println("Player is in attack state, you can attack your opponent now!");
		context.setState(this);
	}

	public String toString(){
		return "Attack State";
	}
}
