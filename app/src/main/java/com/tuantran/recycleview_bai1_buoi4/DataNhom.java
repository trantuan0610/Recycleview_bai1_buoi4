package com.tuantran.recycleview_bai1_buoi4;

public class DataNhom {
    private int HinhAnh;
    private String Ten;
    private String SoLuongThanhVien;
    private String SoLuongBaiViet;
    private String TrangThai;

    public DataNhom(int hinhAnh, String ten, String soLuongThanhVien, String soLuongBaiViet, String trangThai) {
        HinhAnh = hinhAnh;
        Ten = ten;
        SoLuongThanhVien = soLuongThanhVien;
        SoLuongBaiViet = soLuongBaiViet;
        TrangThai = trangThai;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSoLuongThanhVien() {
        return SoLuongThanhVien;
    }

    public void setSoLuongThanhVien(String soLuongThanhVien) {
        SoLuongThanhVien = soLuongThanhVien;
    }

    public String getSoLuongBaiViet() {
        return SoLuongBaiViet;
    }

    public void setSoLuongBaiViet(String soLuongBaiViet) {
        SoLuongBaiViet = soLuongBaiViet;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }
}
