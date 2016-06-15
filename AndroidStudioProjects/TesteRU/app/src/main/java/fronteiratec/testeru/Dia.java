package fronteiratec.testeru;

/**
 * Created by aluno-local on 14/06/16.
 */
public class Dia {
    private String salada1;
    private String salada2;
    private String salada3;
    private String food1;
    private String food2;
    private String food3;
    private String meat;
    private String dessert;

    public Dia(){}

    public Dia(String salada1, String salada2, String salada3, String food1, String food2, String food3, String meat, String dessert){
        this.salada1=salada1;
        this.salada2=salada2;
        this.salada3=salada3;
        this.food1=food1;
        this.food2=food2;
        this.food3=food3;
        this.meat=meat;
        this.dessert=dessert;
    }

    //------getters and setters--------------
    public String getSalada1(){
        return salada1;
    }
    public void setSalada1(String salada1){
        this.salada1=salada1;
    }
    public String getSalada2(){
        return salada2;
    }
    public void setSalada2(String salada2){
        this.salada2=salada2;
    }
    public String getSalada3(){
        return salada3;
    }
    public void setSalada3(String salada3){
        this.salada3=salada3;
    }
    public String getFood1(){
        return food1;
    }
    public void setFood1(String food1){
        this.food1=food1;
    }
    public String getFood2(){
        return food2;
    }
    public void setFood2(String food2){this.food2=food2;}
    public String getFood3(){
        return food3;
    }
    public void setFood3(String food3){
        this.food3=food3;
    }
    public String getMeat(){
        return meat;
    }
    public void setMeat(String meat){
        this.meat=meat;
    }
    public String getDessert(){
        return dessert;
    }
    public void setDessert(String dessert){
        this.dessert=dessert;
    }

}
