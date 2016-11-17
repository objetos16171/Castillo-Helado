import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dulcePrincesa here.
 * 
 * @author Soto Avila Karolina, Escobar Chavez Jose Emmanuel  
 * @version 4 de noviembre del 2016
 */
public class dulcePrincesa extends Actor
{
    private int velX=1;
    private int dirY=2;
    private GifImage dulcePrincesaGifIzquierda = new GifImage("dulcePrincesa.gif");
    private GifImage dulcePrincesaGifDerecha = new GifImage("dulcePrincesa2.gif");
    /**
     * Act - do whatever the dulcePrincesa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {        
       setImage(dulcePrincesaGifIzquierda.getCurrentImage());
       setLocation( getX()+velX , getY() + dirY );
       vuelaAterriza();
       avanzaRetrocede();
       arrojaCorazon();
    }
    
    /**
     *La dulce princesa arrojara corazones hacia el contador cuando aparezca en
     *el mundo creando un objeto de tipo ricardio que es un icono para las vidas
     *accediendo al metodo agrgar objeto en MyWorld  
     */
    public void arrojaCorazon()
    {
       World mundo=getWorld();
       ricardio Ricardio= new ricardio();
        
       if(this.getY()== 460 && ( ( this.getX() == 192 ) ||    
                                 ( this.getX() == 316 ) ||
                                 ( this.getX() == 378 ) ||
                                 ( this.getX() == 502 ) 
                                 ) )
       {    
       mundo.addObject(Ricardio, this.getX() ,this. getY());
       Greenfoot.playSound("ricardioUhSi.wav");
       }
       
    }
    
    /**
     * Cambiara el sentido en el que la princesa avanza por el ancho del mundo
     * modificando el valor de la variable velX de positivo y negativo llegando
     * a los limites del ancho del mundo y al principio del mundo 
     */
    public void avanzaRetrocede()
    {
        
       if(getX()>10)
       {
          velX = velX*-1;   
       }
       
       if(getX()<=getWorld().getWidth()-50)
       {
          velX = velX*-1;
       }
    }
    
    /**
     * Cambiara la direccion de y cuando llege a limite establecido
     * y bajara cuando llega a mas de la mitad del mundo mediante la
     * modificacion de la variable dirY
     */
    public void vuelaAterriza(){
        
        if(getY() >= 350)
       {
          dirY = dirY*-1;  
       }
       
       if(getY()<=getWorld().getHeight()-30)
       {
          dirY = dirY*-1;
       }
    }
}
