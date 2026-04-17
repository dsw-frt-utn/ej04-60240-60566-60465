package domain;

public abstract class Vehiculo {
    protected String patente;
    protected String modelo;
    protected int anio;
    protected double capacidadCarga;
    protected Sucursal sucursal;
    private VehiculoTipo tipo;
    private Marca marca;
    
    public Vehiculo(VehiculoTipo tipo, String patente, Marca marca, String modelo, int anio, double capacidadCarga, Sucursal sucursal) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.capacidadCarga = capacidadCarga;
        this.sucursal = sucursal;
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }
    
    public VehiculoTipo getTipo(){
        return tipo;
    }
    
    public double getCapacidadCarga(){
        return capacidadCarga;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public String getCodigoSucursal(){
        return sucursal.getCodigo();
    }
    
    public double calcularConsumo(double kilometros) {
        if(kilometros <= 0)
        {
          return 0;  
        }
        return 0;
    }

    public boolean esDe(VehiculoTipo tipo){
        return this.tipo == tipo;
    }
    @Override
    public String toString() {
        return marca + " " + modelo + " - Sucursal: " + sucursal.getCodigo();
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
