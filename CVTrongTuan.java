package com.thanhvuong.baitapsociss;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class CVTrongTuan {
    private String mTieuDe;
    private String mMoTaCV;
    private Date mNgayHT;
    private Date mThoiGianHT;
    public String getmTieuDe() {
        return mTieuDe;
    }
    public String getmMoTaCV() {
        return mMoTaCV;
    }

    public void setmMoTaCV(String mMoTaCV) {
        this.mMoTaCV = mMoTaCV;
    }

    public Date getmNgayHT() {
        return mNgayHT;
    }

    public void setmNgayHT(Date mNgayHT) {
        this.mNgayHT = mNgayHT;
    }

    public Date getmThoiGianHT() {
        return mThoiGianHT;
    }

    public void setmThoiGianHT(Date mThoiGianHT) {
        this.mThoiGianHT = mThoiGianHT;
    }

    public CVTrongTuan(String mTieuDe, String mMoTaCV, Date mNgayHT, Date mThoiGianHT) {
        this.mTieuDe = mTieuDe;
        this.mMoTaCV = mMoTaCV;
        this.mNgayHT = mNgayHT;
        this.mThoiGianHT = mThoiGianHT;
    }

    public CVTrongTuan() {
        super();
    }
    public String getDateFormat(Date d)
    {
        SimpleDateFormat dft=new
                SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return dft.format(d);
    }
    /**
     * lấy định dạng giờ phút
     return
     */
    public String getHourFormat(Date d)
    {
        SimpleDateFormat dft=new
                SimpleDateFormat("hh:mm a", Locale.getDefault());
        return dft.format(d);
    }
    @Override
    public String toString() {
        return this.mTieuDe+"-"+
                getDateFormat(this.mNgayHT)+"-"+
                getHourFormat(this.mThoiGianHT);
    }
}
