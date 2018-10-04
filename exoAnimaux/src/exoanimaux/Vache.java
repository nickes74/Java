
package exoanimaux;


public class Vache extends Animal
{
    private static int ageMaximumVache = 5;
    
    public Vache(int age)
    {
        super(age);
    }
    
    public void crier()
    {
        System.out.println("MEUH !");
    }
    
     public void vieillir()
    {
        int age = super.getAge();
        age ++;
        super.setAge(age);
        
        if (age <= ageMaximumVache)
        {
             System.out.println("Cette Vache a maintenant " + age + " ans");  
        }
        else
        {
            mourir();
            System.out.println("Cette Vache est morte !\n");
        }
    }
    
    
}
