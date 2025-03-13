package negocio;

public class DryMartini extends Drink implements Mixer{
    @Override
    public void misturar(){
        super.adicionar(new Ingredientes("Gyn", 100, "ml"));
        super.adicionar(new Ingredientes("Vodka", 50, "ml"));
        super.adicionar(new Ingredientes("Vermuth", 10, "ml"));
        super.adicionar(new Ingredientes("Gelo", 3, "Pedras"));

        super.adicionar(new Ingredientes("Azeitona", 3, "Unidades"));
    }
}
