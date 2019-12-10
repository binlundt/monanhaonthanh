package database;

public class dsmon {
    public String loai ;
    public String ten ;
    public String nguyenlieu ;
    public String cachlam ;
    public int gia ;
    public byte[] anh ;

    public dsmon(String loai, String ten, String nguyenlieu, String cachlam, int gia, byte[] anh) {
        this.loai = loai;
        this.ten = ten;
        this.nguyenlieu = nguyenlieu;
        this.cachlam = cachlam;
        this.gia = gia;
        this.anh = anh;
    }
}
