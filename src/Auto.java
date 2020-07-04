
public class Auto {
	
	//atributos private
	private String color;
	private int puertas;
	private String modelo;
	private String marca;
	
	public Auto() {
		color = "";
		puertas = 0;
		modelo = "";
		marca = "";
	}
	
	public Auto(String c, int puertas, String model, String marca) {
		this.color = c;
		this.puertas = puertas;
		this.modelo = model;
		this.setMarca(marca);
		//this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}

}
