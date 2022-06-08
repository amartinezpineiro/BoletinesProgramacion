package Boletines.Boletin32;

public abstract class Barco{
    String matricula="";
    float eslora=0f;

    public Barco(String matricula, float eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
    }

    public abstract float calcularPrecio(int dias);
}
