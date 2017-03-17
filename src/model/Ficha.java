package model;

public class Ficha {

	
	ArrayList<Vacina> vacina;
	ArrayList<Consulta> consultas;
	
	
	
	public Ficha(ArrayList<Vacina> vacina, ArrayList<Consulta> consultas) {
		super();
		this.vacina = vacina;
		this.consultas = consultas;
	}



	public ArrayList<Vacina> getVacina() {
		return vacina;
	}



	public void setVacina(ArrayList<Vacina> vacina) {
		this.vacina = vacina;
	}



	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}



	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}



	public Ficha() {
		// TODO Auto-generated constructor stub
	}

}
