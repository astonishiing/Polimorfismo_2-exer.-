package negocio;

public class MoscowMule extends Drink implements Mixer{
    @Override
    public void misturar(){
        super.adicionar(new Ingredientes("Cachaca", 100, "ml"));
        super.adicionar(new Ingredientes("Limão", 3, "unidades"));
        super.adicionar(new Ingredientes("Açucar", 5, "g"));
        super.adicionar(new Ingredientes("Gelo", 8, "pedras"));
        super.adicionar(new Ingredientes("Gengibre", 20, "g"));
        super.adicionar(new Ingredientes("Espuma de Gengibre", 50, "ml"));

    }
}
