public class Mahasiswa extends Person {
    private String nim;
    private String nama;
    private String programStudi;
    private int semester;
    private double ipk;

    public Mahasiswa(String nim, String nama, String email, String alamat, String programStudi, int semester, double ipk) {
        super(nama, email, alamat);

        this.nim = nim;
        this.programStudi = programStudi;
        this.semester = semester;
        this.ipk = 0.0;
        setIpk(ipk);
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public String getName() {
        return nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public int getSemester() {
        return semester;
    }

    public void setIpk(double ipk) {
        if(ipk < 0.0 || ipk > 4.0) {
            System.out.println("IPK harus berada dalam rentang 0.0 hingga 4.0");
            return;
        }
        this.ipk = ipk;
    }

    public void naikSemester() {
        semester++;
    }

    public String cekPredikat() {
        if(ipk >= 3.50) return "Cumlaude";
        if(ipk >= 3.00) return "Sangat Memuaskan";
        return "Memuaskan";
    }
}