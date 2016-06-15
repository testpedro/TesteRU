package fronteiratec.testeru; /**
 * Created by aluno-local on 06/06/16.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import fronteiratec.testeru.Dia;

public class CreateDB extends SQLiteOpenHelper{

    private static final String DB_NAME = "rubanco";
    private static final int VERSAO = 1;



    //Class Constructor
    public CreateDB(Context context){
        super(context, DB_NAME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sqlCreateRU = "CREATE TABLE dia("
                + "salada1 TEXT,"
                + "salada2 TEXT,"
                + "salada3 TEXT,"
                + "food1  TEXT,"
                + "food2  TEXT,"
                + "food3  TEXT,"
                + "meat TEXT,"
                + "dessert TEXT,"
                +")";
        db.execSQL(sqlCreateRU);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        String sqlDropTableDia = "DROP TABLE dia";
        db.execSQL(sqlDropTableDia);
        onCreate(db);
    }

    public void insertDia(Dia dia){
      SQLiteDatabase db = getWritableDatabase();
      ContentValues cv = new ContentValues();
      //valor da Coluna que quero inserir
      cv.put("salada1", dia.getSalada1());
      cv.put("salada2", dia.getSalada2());
      cv.put("salada3", dia.getSalada3());
      cv.put("food1", dia.getFood1());
      cv.put("food2", dia.getFood2());
      cv.put("food3", dia.getFood3());
      cv.put("meat", dia.getMeat());
      cv.put("dessert", dia.getDessert());

      db.insert("dia", null, cv);
      db.close();
    }

    public List<Dia>selectDays(){
      List<Dia>listDia = new ArrayList<Dia>();

      SQLiteDatabase db= getReadableDatabase();

      String sqlSelectDays = "SELECT * FROM dia"; //seleciona todos os dias

      Cursor c = db.rawQuery(sqlSelectDays, null);

      if(c.moveToFirst()){ //move pro primeiro e retorna true da primeira posicao
        Dia day = new Dia();
        do {
            day.setSalada1(c.getString(0)); //passa como o parametro o número da coluna (aqui é a primeira)
            day.setSalada2(c.getString(1));
            day.setSalada3(c.getString(2));
            day.setFood1(c.getString(3));
            day.setFood2(c.getString(4));
            day.setFood3(c.getString(5));
            day.setMeat(c.getString(6));
            day.setDessert(c.getString(7));
            listDia.add(day);
        }while(c.moveToNext());
      }
      db.close();
      return listDia;
    }


}







