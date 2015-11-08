package bpm_vvg_2015.procesiugovaranjaprikljucaka;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MjernoMjesto implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "mjerno mjesto id")
   private java.lang.Integer mjernoMjestoId;
   @org.kie.api.definition.type.Label(value = "datum aktiviranja")
   private java.util.Date datumAktiviranja;
   @org.kie.api.definition.type.Label(value = "prikljucak")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.Prikljucak prikljucak;
   @org.kie.api.definition.type.Label(value = "vodomjer")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.Vodomjer vodomjer;

   public MjernoMjesto()
   {
   }

   public java.lang.Integer getMjernoMjestoId()
   {
      return this.mjernoMjestoId;
   }

   public void setMjernoMjestoId(java.lang.Integer mjernoMjestoId)
   {
      this.mjernoMjestoId = mjernoMjestoId;
   }

   public java.util.Date getDatumAktiviranja()
   {
      return this.datumAktiviranja;
   }

   public void setDatumAktiviranja(java.util.Date datumAktiviranja)
   {
      this.datumAktiviranja = datumAktiviranja;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.Prikljucak getPrikljucak()
   {
      return this.prikljucak;
   }

   public void setPrikljucak(
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Prikljucak prikljucak)
   {
      this.prikljucak = prikljucak;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.Vodomjer getVodomjer()
   {
      return this.vodomjer;
   }

   public void setVodomjer(
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Vodomjer vodomjer)
   {
      this.vodomjer = vodomjer;
   }

   public MjernoMjesto(java.lang.Integer mjernoMjestoId,
         java.util.Date datumAktiviranja,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Prikljucak prikljucak,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Vodomjer vodomjer)
   {
      this.mjernoMjestoId = mjernoMjestoId;
      this.datumAktiviranja = datumAktiviranja;
      this.prikljucak = prikljucak;
      this.vodomjer = vodomjer;
   }

}