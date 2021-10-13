package Topik3;

public class Main {
    public static void main(String[] args){
        //Objek pertama
        Jurusan d3if = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Mahasiswa rendi = new Mahasiswa("6701", "Rendi");
        Mahasiswa chaca = new Mahasiswa("6702", "Chaca");
        Mahasiswa agus = new Mahasiswa("6703", "Agus");

        d3if.addMhs(rendi);
        d3if.addMhs(chaca);
        d3if.addMhs(agus);

        //Objek kedua
        Jurusan d3si = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");
        Mahasiswa ridwan = new Mahasiswa("6301", "Ridwan");
        Mahasiswa siska = new Mahasiswa("6302", "Siska");
        Mahasiswa zayn = new Mahasiswa("6303", "Zayn");
        Mahasiswa rahmat = new Mahasiswa("6304", "Rahmat");

        d3si.addMhs(ridwan);
        d3si.addMhs(siska);
        d3si.addMhs(zayn);
        d3si.addMhs(rahmat);

        //Output D3IF
        System.out.println("Kode: " + d3if.getKode());
        System.out.println("Nama: " + d3if.getNama());
        System.out.println("Daftar Mahasiswa: ");
        for (int i = 0; i<d3if.getMhs().size(); i++){
            System.out.println((i + 1) + ". " + d3if.getMhs().get(i).getNim() + " - " + d3if.getMhs().get(i).getNama());
        }

        System.out.println();

        //Output D3SI
        System.out.println("Kode: " + d3si.getKode());
        System.out.println("Nama: " + d3si.getNama());
        System.out.println("Daftar Mahasiswa: ");
        int nilai = 1;
        for (Mahasiswa mahasiswa : d3si.getMhs()){
            System.out.println(nilai++ + ". " + mahasiswa.getNim() + " - " + mahasiswa.getNama());
        }

    }
}
