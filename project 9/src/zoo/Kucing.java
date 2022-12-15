
package zoo;


public class Kucing extends Animal{
    private String jenis;
    public Kucing (){
        super(); jenis = "Kucing Putih";
    }
    public void cekKondisiTumbuh() { 
        if(getJumlahAir() >=2 && getJumlahIkan() >=3) { tumbuh();
        } 
    }
    public void tumbuh() { 
        if(getStatusTumbuh() <4) { 
            setJumlahAir(getJumlahAir() - 2); 
            setJumlahIkan(getJumlahIkan() - 3); 
            setStatusTumbuh(getStatusTumbuh() + 1); } }
    
    public String getJenis() { 
        return jenis;
    }

}
