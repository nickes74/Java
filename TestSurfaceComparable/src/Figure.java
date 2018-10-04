
abstract class Figure implements Comparable <Figure>
{   
 abstract Double getSurf();                                 /* on appelle la méthode revoyant la surface sous forme d'objet car "D"ouble */

//   public int compareTo(Figure figure)                    /* Méthode si on appelle pas un compare d'object mais de valeur */
//   {
//       if (figure.getSurf() >= this.getSurf())
//       {
//           if (figure.getSurf() == this.getSurf())
//           {
//               return 0;
//           }
//           else 
//           {
//               return -1;
//           }
//       }
//       else
//       {
//           return 1;
//       }
//   }
 
 @Override
 public int compareTo (Figure f)                            /* Méthode en appelant le compareTo sur des object (ici de type Double) */
 {
     return getSurf().compareTo(f.getSurf());
 }
 
}
