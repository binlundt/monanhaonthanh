package Resutl;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appmonan.R;

import FragmentLayout.callsugetfood;
import database.data;

public class resutl_price extends AppCompatActivity {
    private int dem ;
    int tien ;
    int loai ;
    private TextView textView , ten , nglieu , cachlam , gia ;
    ImageView anh ;
    final String DATABASE_NAMES  = "dsmonan.sqlite" ;
    SQLiteDatabase database ;
    public resutl_price(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result_price);
        choosemoney hh = new choosemoney();
        tien = hh.getvalue();
        callsugetfood kk = new callsugetfood();
        loai = kk.getvalue();

        if(tien == 1){
            switch (loai){
                case 1 : setvalue1(); break;
                case 2 :  setvalue4();break;
                case 3 : setvalue7(); break;
                case 4 : setvalue10(); break;
                case 5 : setvalue13(); break;
                case 6 :  setvalue16();break;
            }

        }
        if (tien==2){
            switch (loai){
                case 1 : setvalue2(); break;
                case 2 : setvalue5(); break;
                case 3 : setvalue8(); break;
                case 4 : setvalue11(); break;
                case 5 : setvalue14(); break;
                case 6 : setvalue17(); break;
            }
        }
        if (tien==3){
            switch (loai){
                case 1 : setvalue3(); break;
                case 2 : setvalue6(); break;
                case 3 : setvalue9(); break;
                case 4 : setvalue12(); break;
                case 5 : setvalue15(); break;
                case 6 : setvalue18(); break;
            }
        }
    }

    private void setvalue1(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 1 and gia <100000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);

    }
    private void setvalue2(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 1 and gia >100000 and gia < 200000  ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);


    }
    private void setvalue3(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 1 and gia > 200000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue4(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 2 and gia < 100000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue5(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 2 and gia > 100000 and gia < 200000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue6(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 2 and gia > 200000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue7(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 3 and gia < 100000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue8(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 3 and gia > 100000 and gia <200000", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue9(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 3 and gia > 200000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue10(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 4 and gia < 100000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue11(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 4 and gia <= 200000 and gia > 100000", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue12(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 4 and gia > 200000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue13(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 5 and gia < 100000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue14(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 5 and gia > 100000 and gia <200000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue15(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 5 and gia > 200000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue16(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 6 and gia < 100000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue17(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 6 and gia > 100000 and gia <200000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void setvalue18(){
        database = data.initDatabase(this , DATABASE_NAMES) ;
        Cursor cursor = database.rawQuery("SELECT * FROM danhsach WHERE loai = 6 and gia > 200000 ", null) ;
        cursor.moveToFirst();
        String ten = cursor.getString(2);
        String nguyenlieu = cursor.getString(3);
        String cachlam = cursor.getString(4) ;
        int tien = cursor.getInt(5);
        byte[] anh = cursor.getBlob(6);
        Bitmap anh2 = BitmapFactory.decodeByteArray(anh , 0 , anh.length);
        getdata(ten , nguyenlieu , cachlam , tien , anh2);
    }
    private void getdata(String name , String nguyenlieu , String clam , int tien , Bitmap image){
        anhxa();
        ten.setText(name);
        nglieu.setText(nguyenlieu);
        cachlam.setText(clam);
        gia.setText(tien + "VND");
        anh.setImageBitmap(image);

    }
    private void anhxa(){
        ten = (TextView) findViewById(R.id.id_ten);
        nglieu = (TextView) findViewById(R.id.id_nguyenlieu);
        cachlam = (TextView) findViewById(R.id.id_cachlam);
        gia = (TextView) findViewById(R.id.id_gia);
        anh = (ImageView) findViewById(R.id.id_anh) ;
    }

}