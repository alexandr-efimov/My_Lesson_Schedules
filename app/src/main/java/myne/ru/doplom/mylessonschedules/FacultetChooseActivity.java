package myne.ru.doplom.mylessonschedules;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import src.FAO.ReadSheduler;

public class FacultetChooseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultet_choose);


        ListView lvMain = (ListView) findViewById(R.id.listView);
        //список факультетов
//        String[] facuktets = null;
//        String myFile = "Shududer_1kurs.xls";
//        File fileExcel = new File(myFile);

        try {
            File file = new File("testFile.txt");
            if (!file.exists()){
                file.createNewFile();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


//        try {
//            facuktets = ReadSheduler.readFromExcelFacultets(fileExcel);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, facuktets);
//
//        // присваиваем адаптер списку
//        lvMain.setAdapter(adapter);
    }


}
