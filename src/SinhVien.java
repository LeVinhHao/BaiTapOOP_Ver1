import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String diaChi;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    private  double diemTB=0;
    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String lop, String diaChi, double diemToan, double diemHoa, double diemLy) {
        this.maSV= maSV;
        this.hoTen=hoTen;
        this.lop=lop;
        this.diaChi=diaChi;
        this.diemToan = diemToan;
        this.diemLy=diemLy;
        this.diemHoa=diemHoa;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
    Scanner sc = new Scanner(System.in);

    public void nhap(){
        System.out.print("Nhập MASV: ");
        maSV=sc.nextLine();

        System.out.print("Nhập họ tên: ");
        hoTen=sc.nextLine();

        System.out.print("Nhập lớp: ");
        lop=sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        diaChi=sc.nextLine();

        System.out.print("Nhập điểm toán: ");
        diemToan=sc.nextFloat();

        System.out.print("Nhập điểm lý: ");
        diemLy=sc.nextFloat();

        System.out.print("Nhập điểm hóa: ");
        diemHoa=sc.nextFloat();
    }
    public void xuat(){
        System.out.print(maSV+"\t");
        System.out.print(hoTen+"\t");
        System.out.print("\t"+lop+"\t");
        System.out.print(diaChi+"\t\t");
        System.out.print(diemToan+"\t\t\t");
        System.out.print(diemLy+"\t\t\t");
        System.out.print(diemHoa+"\t\t\t");


    }
    public double tinhDiemTB(){
        return (diemToan+diemLy+diemHoa)/3;
    }

    public void xepLoai(){
        diemTB=(diemToan+diemLy+diemHoa)/3;
        if(diemTB<5){
            System.out.print("Kém");
        } else if (diemTB>=5&&diemTB<7.5) {
            System.out.print("Trung bình");
        }else if(diemTB>=7.5&&diemTB<8.5){
            System.out.print("Khá");
        }else {
            System.out.print("Giỏi");
        }
    }
}
