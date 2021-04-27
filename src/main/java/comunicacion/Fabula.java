package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	Pictograma objP;
	Escrito objE;
	
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	public int palabrasTotales(int num) {
		return num*objE.getPaginas();
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return objP.getOrigen()+"\n"+
			   objE.getTitulo()+"\n"+
			   objE.getAutor()+"\n"+
			   objE.getPaginas()+"\n"+
			   ensenanza;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
