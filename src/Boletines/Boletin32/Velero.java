package Boletines.Boletin32;

public class Velero extends Barco{
    int mastiles;

    public Velero(String matricula, float eslora, int mastiles) {
        super(matricula, eslora);
        this.mastiles = mastiles;
    }

    @Override
    public float calcularPrecio(int dias) {
        return (((8*this.mastiles)+(10*eslora))*dias);
    }
}
