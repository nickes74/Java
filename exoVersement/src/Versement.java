import java.text.SimpleDateFormat;
import java.util.*;

class Versement implements Comparable<Versement>
{
    private Integer numero;
    private Date date;
    private Double montant;
    private Integer numeroContact;
    private String stringDate;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
   
    /*              SETTERS GETTERS      */
    
    /* ------------------ Numero -----------------------*/
    
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    /* ------------------ Date ------------------------*/
    
    public void setDate(Date date)
    {
        this.date = date;
    }
    public void setDateString(String date)
    {
        this.stringDate = date;
    }
    
    public Date getDate()
    {
        return date;
    }
    
    /* ------------------ Montant ------------------------*/
    
    public void setMontant(Double montant)
    {
        this.montant = montant;
    }
    
    public double getMontant()
    {
        return montant;
    }
    
    /* ---------------Numero Contact ---------------------*/
    
    public void setNumContact(int numeroContact)
    {
        this.numeroContact = numeroContact;
    }
    public int getNumContact()
    {
        return numeroContact;
    }
    
    /* --------------méthode compareTo -------------------*/
    
    public int compareTo(Versement v)
    {
        return getDate().compareTo(v.getDate());
    }

    /* --------------méthode toString -------------------*/
    
    public String toString()
    {
        return numero + ";" + formatter.format(date)  + ";" + montant + ";" + numeroContact;
    }
    
}
