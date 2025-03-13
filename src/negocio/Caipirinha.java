package negocio;

public class Caipirinha extends Drink implements Mixer{

    @Override
    public void misturar() {
        super.adicionar(new Ingredientes("Cachaca", 100, "ml"));
        super.adicionar(new Ingredientes("Limão", 3, "unidades"));
        super.adicionar(new Ingredientes("Açucar", 5, "g"));
        super.adicionar(new Ingredientes("Gelo", 8, "pedras"));

    }
}
