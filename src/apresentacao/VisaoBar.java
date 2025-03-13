package apresentacao;

import negocio.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VisaoBar {
    public static void main(String[] args) {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Drink objDrink = null;
        int opcao = 0;

        try{
            System.out.println("+==================+");
            System.out.println("|     Cardápio     |");
            System.out.println("+==================+");
            System.out.println("| 1 - Caipirinha  |");
            System.out.println("| 2 - Dry Martini |");
            System.out.println("| 3 - Old Fashion |");
            System.out.println("| 4 - Moscow Rule |");
            System.out.println("+==================+");
            System.out.println("Digite a sua opcao: ");
            opcao = Integer.parseInt(leitor.readLine());

            switch(opcao){
                case 1:
                    objDrink = new Caipirinha();
                    break;
                case 2:
                    objDrink = new DryMartini();
                    break;
                case 3:
                    objDrink = new OldFashion();
                    break;
                case 4:
                    objDrink = new MoscowMule();
                    break;
                default:
                    System.out.println("Nenhuma das opções selecionadas");
            }
            ((Mixer)objDrink).misturar();
            objDrink.beber();



        }catch (Exception Error){
            System.out.println(Error);
        }
    }
}
