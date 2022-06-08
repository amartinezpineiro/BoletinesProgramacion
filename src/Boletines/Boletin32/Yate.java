package Boletines.Boletin32;

public class Yate extends Barco{
    float potencia;
    int camarote;

    public Yate(String matricula, float eslora, float potencia, int camarote) {
        super(matricula, eslora);
        this.potencia = potencia;
        this.camarote = camarote;
    }

    @Override
    public float calcularPrecio(int dias) {
        return (((2*this.potencia)+(25*camarote)+(10*eslora))*dias);
    }
}
