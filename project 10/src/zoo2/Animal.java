
package zoo2;


public class Animal {
    private int statusTumbuh;//0-4 
    private int jumlahAir; 
    private int jumlahIkan;
    public Animal() { 
        statusTumbuh = 0; 
        jumlahAir = 0; 
        jumlahIkan = 0;
    }
    public int getJumlahAir(){ 
        return jumlahAir;
    }
    public void setJumlahAir(int n){ 
        jumlahAir = n;
    }
    public int getJumlahIkan(){ 
        return jumlahIkan;
    }
    public void setJumlahIkan(int n){ 
        jumlahIkan = n;
    }

    public void setStatusTumbuh(int n){ 
        statusTumbuh = n;
    }
    public void beriMinum() { 
        jumlahAir++; 
        cekKondisiTumbuh();
    }
    public void beriMakan() { 
        jumlahIkan++; 
        cekKondisiTumbuh();
    }
    public void cekKondisiTumbuh() { 
    //cek kecukupan air dan Ikan
    if(jumlahAir >=2 && jumlahIkan >=3) { 
        tumbuh();
        } 
    }
    public void tumbuh() { 
        if(statusTumbuh <4) { 
            jumlahAir = jumlahAir - 2; 
            jumlahIkan = jumlahIkan - 3; 
            statusTumbuh++;}}
    public void displayAnimal() {
    System.out.println(getStatusTumbuhText());
    System.out.println("Jumlah Air:" + jumlahAir);
    System.out.println("Jumlah Ikan:" + jumlahIkan);}

    public String getStatusTumbuhText() { 
    switch(statusTumbuh) {  
        case 0: return "Bayi Kucing"; 
        case 1: return "Kucing"; 
        case 2: return "Kucing Dewasa";
    } return "Telah Berkembang";
    }
    
    public int getStatusTumbuh() { 
        return statusTumbuh;
    }
    public String getImagePath() {
    String tImagePath = "img/seed.png"; 
    switch(statusTumbuh) { 
        case 0: tImagePath = "img/seed_11zon.png"; break; 
        case 1: tImagePath = "img/sprout_11zon.png"; break;
        case 2: tImagePath = "img/small_11zon.png"; break; 
        case 3: tImagePath = "img/big_11zon.png"; break; 
        case 4: tImagePath = "img/blossom_11zon.png"; break;
    } return 
      tImagePath;
    }
}

