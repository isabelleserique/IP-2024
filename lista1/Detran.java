public class Detran {
    private float vel_car, vel_max;

    //constructor
    Detran(float vel_car, float vel_max;){
        this.setVelCar(vel_car);
        this.setVelMax(vel_max);
    }

    public float getVelCar(){return this.vel_car;}
    public float getVelMax(){return this.vel_max;}
    public void setVelCar(float novoValor){this.vel_car = novoValor;}
    public void setVelMax(float novoValor){this.vel_max = novoValor;}

    public void fx(){
        /*Valor da Multa
     		0    - se abaixo ou igual o valor maximo permitido
     		200  - se acima da velocidade permitida ate 20% (incluso)
     		500  - se acima de 20% da velocidade permitida ate 50% (incluso)
     		2000 - se acima de 50% da velocidade maxima permitida */
        float multa = 
        
    }

}
