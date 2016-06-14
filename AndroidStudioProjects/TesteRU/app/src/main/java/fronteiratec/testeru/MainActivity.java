package fronteiratec.testeru;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showSecondActivity(View view){
        Intent SecondActivity = new Intent(this, SecondActivity.class);
        startActivity(SecondActivity);
    }
    public void showContactActivity(View view){
        Intent ContactActivity = new Intent(this, ContatoActivity.class);
        startActivity(ContactActivity);
    }


    //Método que captura cliques nos botões
    //retorna a id de qual botão foi clicado
//    public String selectedButton(Button button){
//        int id = button.getId();
//
//        if(id == R.id.button){
//            return "Segunda";
//        } else if (id == R.id.button2) {
//            return "Terça";
//        } else if (id == R.id.button3) {
//            return "Quarta";
//        } else if (id == R.id.button4) {
//            return "Quinta";
//        } else if (id == R.id.button5) {
//            return "Sexta";
//        } else {
//            return "Contato";
//        }
//    }



}
