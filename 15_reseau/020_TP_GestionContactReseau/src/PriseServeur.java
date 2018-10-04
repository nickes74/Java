
class PriseServeur
{

    private final String nomMachine;
    private final int numeroPort;
    private String formatDate = "yyyy/MM/dd";
    
    public PriseServeur(String nomMachine, int numeroPort)
    {
        this.nomMachine = nomMachine;
        this.numeroPort = numeroPort;
    }
    
    public void setFormatDate(String formatDate)
    {
        this.formatDate = formatDate;
    }
    
    public String getFormatDate()
    {
        return formatDate;
    }
    
    public String getNomMachine()
    {
        return nomMachine;
    }
    
    public int getNumeroPort()
    {
        return numeroPort;
    }
}
