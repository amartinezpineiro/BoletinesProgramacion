package Boletines.Boletin20.Boletin20_1;

public class Gato extends Mamifero implements IPodeNadar{
    @Override
    public void caminar() {
        super.caminar();
    }

    @Override
    public void nadar() {
        System.out.println("nada");
    }
}
