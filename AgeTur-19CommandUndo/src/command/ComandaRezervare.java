package command;

import pachete.PachetTuristic;

public class ComandaRezervare implements Command {

	private PachetTuristic pachet;
	
	public ComandaRezervare(PachetTuristic pachet) {
		super();
		this.pachet = pachet;
	}
	
	@Override
	public void executa() {
		pachet.rezerva();
	}

	@Override
	public void unexecute() {
		pachet.anulareRezervare();		
	}

}
