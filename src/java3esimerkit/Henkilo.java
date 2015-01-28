package java3esimerkit;
public class Henkilo {
  private final String hetu;
  private String nimi;
  private Henkilo puoliso;

  public Henkilo(String hetu) {
    this.hetu = hetu;
  }

  public String  getHetu()       { return hetu;       }
  public void    setNimi(String uNimi) { nimi = uNimi; }
  public String  getNimi()       { return nimi;       }
  public Henkilo getPuoliso()    { return puoliso;    }

  public void avioidu(Henkilo h) {
    //Varmistetaan, että kumpikaan osapuoli ei ole naimisissa.
    h.eroa();
    eroa();
    //Mennään naimisiin.
    puoliso = h;
    h.puoliso = this;
    
  }

  public void eroa() {
    if ( puoliso != null ) {
      puoliso.puoliso = null;
      puoliso = null;
    }
  }
  
  public static void main (String [] args) {
	Henkilo henk1 = new Henkilo("121280-0000");
    Henkilo henk2 = new Henkilo("121280-0000");
	henk1.setNimi("Harri");
    henk2.setNimi("Niina");
	System.out.println(henk1.getPuoliso());
	
	henk1.avioidu(henk2);
	System.out.println("Minun nimi on: "+ henk1.getNimi() + " ja puolisoni nimi on: " + henk1.getPuoliso().getNimi());
  }
  
}