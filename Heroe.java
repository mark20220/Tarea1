
/**
 * Caracteristicas de un heroe de Dota 2.
 * 
 * Marcelo
 * 08/04/2021
 */
public class Heroe
{
    String Nombre;
    //Atributo Pricipal del Heroe
    String Atributo;
    //Estadisticas Generales
    int Vida;
    int Escudo;
    int Daño;
    //Estadisticas de Atributos
    int Fuerza;
    int Agilidad;
    int Inteligencia;
    //Método constructor
    Heroe(String Nombre, String Atributo, int Vida, int Escudo, int Daño, int Fuerza, int Agilidad, int Inteligencia){
        this.Nombre=Nombre;
        this.Atributo=Atributo;
        this.Vida=Vida;
        this.Escudo=Escudo;
        this.Daño=Daño;
        this.Fuerza=Fuerza;
        this.Agilidad=Agilidad;
        this.Inteligencia=Inteligencia;
    }
    //Métodos Atacar y Defender
    void Atacar(Heroe otro){
        otro.Vida=otro.getVida()-(Daño-otro.getEscudo());
    }
    
    void Defendes(Heroe otro){
        Vida=Vida-(otro.getDaño()-Escudo);
    }
    //Métodos get
    String getNombre(){
        return Nombre;
    }
    
    String getAtributo(){
        return Atributo;
    }
    
    int getVida(){
        return Vida;
    }
    
    int getEscudo(){
        return Escudo;
    }
    
    int getDaño(){
        return Daño;
    }
    
    int getFuerza(){
        return Fuerza;
    }
    
    int getAgilidad(){
        return Agilidad;
    }
    
    int getInteligencia(){
        return Inteligencia;
    }
    //Métodos set
    void setNombre(String Nom){
        Nombre=Nom;
    }
    
    void setAtributo(String Atri){
        Atributo=Atri;
    }
    
    void setVida(int Vid){
        Vida=Vid;
    }
    
    void setEscudo(int Escud){
        Escudo=Escud;
    }
    
    void setDaño(int Dañ){
        Daño=Dañ;
    }
    
    void setFuerza(int Fuer){
        Fuerza=Fuer;
    }
    
    void setAgilidad(int Agil){
        Agilidad=Agil;
    }
    
    void setInteligencia(int Inte){
        Inteligencia=Inte;
    }
}
