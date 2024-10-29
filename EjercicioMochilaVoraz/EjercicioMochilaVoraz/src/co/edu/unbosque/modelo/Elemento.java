package co.edu.unbosque.modelo;

public class Elemento {
    
	private String nombre;
    private double valor;
    private double peso;
    private int cantidad;
    private double valorpeso;
    private double factorDivision;
    

    
    public Elemento(String n, double v, double p, int cantidad, double factorDivision) {
        nombre=n;
        valor = ( v * cantidad ) ;
        peso  = ( p * cantidad );
        setValorpeso(valor / peso);
        this.setCantidad(cantidad);
        if(factorDivision != 0) {
        	this.setFactorDivision(factorDivision);
        }else {
        	this.setFactorDivision(1);
        }
        
    }
    

    @Override
    public String toString() {
        return String.format("%-15s | Peso: %10.2f kg | Precio: %10.2f | Unidades: %d | Porciones: %10.2f",
                             nombre, peso, valor, cantidad, factorDivision);
    }



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorpeso() {
		return valorpeso;
	}

	public void setValorpeso(double valorpeso) {
		this.valorpeso = valorpeso;
	}


	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getFactorDivision() {
		return factorDivision;
	}

	public void setFactorDivision(double factorDivision) {
		this.factorDivision = factorDivision;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

	
    
}
