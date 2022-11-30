import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double TB;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sinh viên: ");
        n=sc.nextInt();

        SinhVien sv[] = new SinhVien[n];
        for(int i=0;i<n;i++){
            System.out.println("Sinh vien thứ "+(i+1));
            sv[i]=new SinhVien();
            sv[i].nhap();
        }
        System.out.println("STT\tMASV\t\tHọ tên\t\t\tLớp\t\tĐịa chỉ\t\tĐiểm toán\tĐiểm lý\t\tĐiểm hóa\tĐiểm TB\t\t Xếp loại");
        for(int i=0;i<n;i++){
            System.out.print(i+1+"\t");
            sv[i].xuat();
            System.out.printf("%1.2f",sv[i].tinhDiemTB());
            System.out.print("\t\t\t");
            sv[i].xepLoai();
            System.out.println();
        }
    }
}