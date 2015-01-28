package hojanper;


public class linjaAuto {
    private int paikkoja;
    private int paikkojaVapaana;

    public linjaAuto() {
        this(,0); //kutsutaan jälkimmäistä konstruktoria
    }
    
    public linjaAuto(int maxPaikkoja) {
        paikkoja = maxPaikkoja;
        paikkojaVapaana = maxPaikkoja; 
    }    

    public void lisaaMatkustaja()
    {
        if(paikkojaVapaana > 0)
            paikkojaVapaana = paikkojaVapaana - 1;
        else
            System.out.println("Paikat täynnä");
            
    }

    public void poistaMatkustaja()
    {
        if(paikkojaVapaana = paikkoja)
            System.out.println("Kaikki paikat tyhjiä");
        else
            paikkojaVapaana = paikkojaVapaana - 1;
            
    }

    
    public static void main(String[] args) 
    {
        int i;
        linjaAuto auto = new linjaAuto(1);
        for(i=0;i<5;i++)
        auto.lisaaMatkustaja();
        
//        for(i=0;i<5;i++)
            auto.poistaMatkustaja();
    }
    
    
}
