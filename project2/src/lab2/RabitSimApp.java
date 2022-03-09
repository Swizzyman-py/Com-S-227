package lab2;
import plotter.SimulationPlotter;

public class RabitSimApp {
	public static void main(String[] args) {
		
		SimulationPlotter plotter = new SimulationPlotter();
		RabbitModel myModel = new RabbitModel();
		plotter.simulate(myModel);
		
		
	}
}
