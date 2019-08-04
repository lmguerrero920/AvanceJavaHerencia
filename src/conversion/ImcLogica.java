package conversion;


public class ImcLogica extends Imc {



    public double calcularImc()
    {
        return (this.getPeso()/(this.getEstatura()*this.getEstatura()));
    }

}
