package sample;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Mobil extends Kendaraan {

    private double pokokpkb;
    private double pokokswk;
    private double bulan;

    public Mobil(double pkb, double swk, double bulan) {
        this.pokokpkb = pkb;
        this.pokokswk = swk;
        this.bulan = bulan;
    }

    public void setPkb(double pkb)
    {
        pokokpkb = pkb;
    }

    public void setSwk(double swk)
    {
        pokokswk = swk;
    }

    public void setBulan(int b)
    {
        bulan = b;
    }
    public double getPokokpkb(){
        return pokokpkb;
    }
    public double getPokokswk(){
        return pokokswk;
    }
    public double getBulan(){
        return bulan;
    }
    public String hitung(){

        double hitungmobil;
        bulan = getBulan();

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);


        if(bulan == 0 ){

            hitungmobil = (pokokpkb + pokokswk);
        }
        else{
            hitungmobil = ((pokokpkb * (0.25) * (bulan/12)) + 100000) + pokokpkb + pokokswk;
        }

        return kursIndonesia.format(hitungmobil);
    }

}
