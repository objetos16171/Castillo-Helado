import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReyHelado here.
 * 
 * @author Soto Avila Carolina, Jose Emmanuel Escobar Chavez
 * @version 4 de Noviembre del 2016
 */
public class ReyHelado extends Actor
{
    private int velX;
    private int velY;
    private int ydireccion=460;
    private int xdireccion=352;
    
    private GreenfootSound agarrarPrincesa = new GreenfootSound ("amoAlasprincesas.wav");
    private GreenfootSound reyHeladoGrito = new GreenfootSound ("reyHeladoGritando.wav");
    private GreenfootSound agarraPinguino = new GreenfootSound ("quien te dijo que puedes Volar.wav");
    
    //private int velXp;
    //private int velYp;
    //private int ypdireccion=338;
    //private int xpdireccion=118;
    /**
     * Act - do whatever the ReyHelado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ydireccion= ydireccion + velY*1;
        xdireccion= xdireccion + velX*1;
        //ypdireccion= ypdireccion + velYp*1;
        //xpdireccion= xpdireccion + velXp*1;
        setLocation(xdireccion,ydireccion);  
        mueve();
        agarraPinguino();
        siguientePlataforma();
        agarraPrincesa();
    }    
    
   /**
    * Mueve al ReyHelado con las teclas izquierda y derecha
    */
    public void mueve()
    {
         if(Greenfoot.isKeyDown("left")){
           velX = -3;
       } 
        if(Greenfoot.isKeyDown("right")){
           velX = 3;
       } 
        if(Greenfoot.isKeyDown("up")){
           velY = -3;
       }  
       if(ydireccion < 200){
            velY = 3;
        }
       if(ydireccion > 500){
            velY=-3;
        }
    }
    
    public void siguientePlataforma(){
        if(isTouching(plataforma.class)){
           ydireccion=280;
           if(xdireccion>700){
            velX=-2;
          }
           if(xdireccion<2){
            velX=2;
          }
          velY=0;
        }
       }
    
    /**
     * Este método nos ayudara para poder 
     * agarrar pinguinos que van cayendo del cielo 
     * usa el metodo getOneObjectAtOffset usando como de referencia la
     * posicion de este mismo objeto accediendo al mundo para eliminarlo.
     */
    public void agarraPinguino()
    {
        MyWorld mundo = (MyWorld)getWorld();
       
        Actor Pinguino;
        Pinguino = getOneObjectAtOffset(0,0,Pinguino.class);
        if(Pinguino != null)
        {
            mundo.incrementaPinguinos();
            mundo.removeObject(Pinguino);
            if(Greenfoot.getRandomNumber(5)<2){
                Greenfoot.playSound("quien te dijo que puedes Volar.wav");
            }
            else
            {
            Greenfoot.playSound("reyHeladoGritando.wav");
            }
            
        }
        
    }
    
    public void agarraPrincesa()
    {   
        World mundo =getWorld();
        Actor Princesa;
        Princesa = getOneObjectAtOffset(0,0,Princesa.class);
        if(Princesa!=null)
        {
           mundo.removeObject(Princesa);
           Greenfoot.playSound("amoAlasprincesas.wav");
        }
    }
}
