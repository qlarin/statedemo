
public class StateTest {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		IdleState idleState = new IdleState();
		AttackState attackState = new AttackState();
		
		idleState.doAction(context);
		System.out.println(context.getState().toString());
		
		attackState.doAction(context);
		System.out.println(context.getState().toString());
	}

}
