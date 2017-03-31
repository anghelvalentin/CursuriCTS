package decorator;

import codulexistent.PachetTuristic;

public class OfertaPachetCazare extends OfertaPachetTuristic {

	public OfertaPachetCazare(PachetTuristic pachetTuristic){
		super(pachetTuristic);
	}
	@Override
	public void anulareRezervare() {
		System.out.println("Rezervarea de cazare a fost anulata.");
	}
}
