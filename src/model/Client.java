package model;

public class Client {

	private String nome;
	private String morada;
	private String email;
	private String telemovel;
	private ArrayList<Animal> animais;
	int id;
	
	
	public Client(int id) {
		super();
		this.id = id;
	}

	public Client(String nome, String morada, String email, String telemovel) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telemovel = telemovel;
		animais = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMorada() {
		return morada;
	}


	public void setMorada(String morada) {
		this.morada = morada;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelemovel() {
		return telemovel;
	}


	public void setTelemovel(String telemovel) {
		this.telemovel = telemovel;
	}


	public Client() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
