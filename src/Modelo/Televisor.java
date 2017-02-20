package Modelo;

public class Televisor extends Electrodomestico {

    protected double pulgadas;
    protected TipoTelevisor tipo;

    public Televisor() {
        super();
    }

    @Override
    public void setPrecio(double precioBase) {
        if (this.pulgadas > 40) {
            this.precio = 1.1 * precioBase;
        } else if (this.tipo == TipoTelevisor.PLASMA) {
            this.precio = 0.9 * precioBase;
        } else {
            this.precio = precioBase;
        }
    }

    @Override
    public String imprimirProducto() {
        String res = super.imprimirProducto() + "tipo de TV: " + this.tipo + "con " + this.pulgadas + " pulgadas";
        return res;

    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public TipoTelevisor getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelevisor tipoTelevisor) {
        this.tipo = tipoTelevisor;
    }

}
