package bpm_vvg_2015.procesiugovaranjaprikljucaka;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MjernoMjesto implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Broj_mjernog_mjesta")
   private java.lang.String brojMjernogMjesta;
   @org.kie.api.definition.type.Label("Datum_aktiviranja")
   private java.util.Date datumAktiviranja;
   @org.kie.api.definition.type.Label("Broj_vodomjera")
   private java.lang.String brojVodomjera;

   @org.kie.api.definition.type.Label(value = "Aktiviran_korisnik")
   private java.lang.Boolean aktiviranKorisnik;

   public MjernoMjesto()
   {
   }

   public java.lang.String getBrojMjernogMjesta()
   {
      return this.brojMjernogMjesta;
   }

   public void setBrojMjernogMjesta(java.lang.String brojMjernogMjesta)
   {
      this.brojMjernogMjesta = brojMjernogMjesta;
   }

   public java.util.Date getDatumAktiviranja()
   {
      return this.datumAktiviranja;
   }

   public void setDatumAktiviranja(java.util.Date datumAktiviranja)
   {
      this.datumAktiviranja = datumAktiviranja;
   }

   public java.lang.String getBrojVodomjera()
   {
      return this.brojVodomjera;
   }

   public void setBrojVodomjera(java.lang.String brojVodomjera)
   {
      this.brojVodomjera = brojVodomjera;
   }

   public java.lang.Boolean getAktiviranKorisnik()
   {
      return this.aktiviranKorisnik;
   }

   public void setAktiviranKorisnik(java.lang.Boolean aktiviranKorisnik)
   {
      this.aktiviranKorisnik = aktiviranKorisnik;
   }

   public MjernoMjesto(java.lang.String brojMjernogMjesta,
         java.util.Date datumAktiviranja, java.lang.String brojVodomjera,
         java.lang.Boolean aktiviranKorisnik)
   {
      this.brojMjernogMjesta = brojMjernogMjesta;
      this.datumAktiviranja = datumAktiviranja;
      this.brojVodomjera = brojVodomjera;
      this.aktiviranKorisnik = aktiviranKorisnik;
   }

}