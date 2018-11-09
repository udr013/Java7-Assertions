package asserts;

enum State {
	ON, OFF
}

public class TestInternalInvariants {

	private void machineState(State state){

		switch(state){
			case ON:
				System.out.println("system is ON");
			case OFF:
				System.out.println("System if OFF");
			default: assert false; // this should never happen, enum changed?
		}
	}

	private void machineState2(State state){

		if(State.OFF == state) {
			System.out.println("system is ON");
		}
		else if (State.ON == state) {
			System.out.println("System if OFF");
		}
			else {
				assert false; // this should never happen, enum changed?
		}
	}

}
