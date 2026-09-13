public class Dosen extends Person {
    private String nidn;

    public Dosen(String nama, String email, String alamat, String nidn) {
        super(nama, email, alamat);
        this.nidn = nidn;
    }

    public void mengajar() {
        System.out.println(getNama() + " " + "sedang mengajar");
    }
}