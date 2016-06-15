package fronteiratec.testeru;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Iterator;

import fronteiratec.testeru.CreateDB;


public class SecondActivity extends AppCompatActivity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    CreateDB cdb = new CreateDB(this);

    Dia segunda = new Dia("alface", "Rucula", "Beterraba", "Arroz", "Feijao", "Strogonoff", "Hamburguer", "gelatina");

    SecondActivity option = new SecondActivity();

    cdb.insertDia(segunda);

    for(Iterator iterator = listDia.iterator(); iterator.hasNext();){
        Dia dia = (Dia) iterator.next();
        Log.i("AppRU", dia.toString());
    }



    //Método que captura cliques nos botões
    //retorna a id de qual botão foi clicado
    public String selectedButton(Button button) {
        int id = button.getId();


        if (id == R.id.button) {
            return "Segunda";
        } else if (id == R.id.button2) {
            return "Terça";
        } else if (id == R.id.button3) {
            return "Quarta";
        } else if (id == R.id.button4) {
            return "Quinta";
        } else if (id == R.id.button5) {
            return "Sexta";
        } else {
            return "Contato";
        }
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Second Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://fronteiratec.testeru/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Second Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://fronteiratec.testeru/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
