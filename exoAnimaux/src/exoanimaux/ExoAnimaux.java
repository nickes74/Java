
package exoanimaux;


public class ExoAnimaux
{

    public static void main(String[] args)
    {
        Animal tableAnimal[] = new Animal[2];
        int iAnimal;
        
        tableAnimal[0] = new Vache (1);
        tableAnimal[1] = new Animal (2);
        
        while (Animal.getNombreAnimauxVivant() > 0)
        {
            for (iAnimal = 0; iAnimal < 2; iAnimal++)
            {
                if (tableAnimal[iAnimal].getVivant())
                {
                    tableAnimal[iAnimal].crier();
                    tableAnimal[iAnimal].vieillir();
                }
            }

        }
    }
    
}
