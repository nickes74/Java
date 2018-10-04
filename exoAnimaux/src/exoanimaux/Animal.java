
package exoanimaux;



public class Animal
{
    private int age;
    private boolean vivant;
    private static int nombreAnimauxVivants = 0;
    private static int ageMaximumAnimal = 3;

    
    public Animal (int age)
    {
        this.age = age;
        vivant = true;
        nombreAnimauxVivants++;
    }
    
    public static int getNombreAnimauxVivant()
    {
        return nombreAnimauxVivants;
    }
    
    public void vieillir()
    {
        age ++;       
        if (age <=ageMaximumAnimal)
        {
            System.out.println("Cet Animal a maintenant " + age + " ans"); 
        }
        else
        {
            mourir();
            System.out.println("Cet animal est mort !\n");           
        }
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void mourir()
    {
        vivant = false;
        nombreAnimauxVivants --;
    }
    
    public boolean getVivant()
    {
        return vivant;
    }
    
    public void crier()
    {
        System.out.println("Je suis un animal !"); 
    }
    
}
