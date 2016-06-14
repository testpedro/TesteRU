package fronteiratec.testeru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    Dia segunda = new Dia("alface", "Rucula", "Beterraba", "Arroz", "Feijao", "Strogonoff", "Hamburguer", "gelatina");

    SecondActivity option = new SecondActivity();

    //Método que captura cliques nos botões
    //retorna a id de qual botão foi clicado
    public String selectedButton(Button button){
        int id = button.getId();


        if(id == R.id.button){
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




}
