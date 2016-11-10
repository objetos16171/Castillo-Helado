import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReyHelado here.
 * 
 * @author Soto Avila Carolina, Jose Emmanuel Escobar Chavez
 * @version 4 de Noviembre del 2016
 */
public class ReyHelado extends Actor
{
    //private int velX = 2;
    //private int velY = 2;
    //private int ydireccion=460;
    //private int xdireccion=352;
    private int velocidad=5;
    
    private GreenfootSound agarrarPrincesa = new GreenfootSound ("amoAlasprincesas.wav");
    private GreenfootSound reyHeladoGrito = new GreenfootSound ("reyHeladoGritando.wav");
    private GreenfootSound agarraPinguino = new GreenfootSound ("quien te dijo que puedes Volar.wav");
    
    
    /**
     * Act - do whatever the ReyHelado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //ydireccion= ydireccion + velY*1;
        //xdireccion= xdireccion + velX*1;
        //setLocation(xdireccion,ydireccion); 
        go();
        DetectaTecla();
        agarraPinguino();
        agarraPrincesa();
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
    
     public void go()
    {
       
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {

            setLocation(getX()-5, getY());
        }

    }
    
    public void salta(){
        setLocation(getX(),getY()-velocidad);
    }
    
    public boolean onFloor()
    {
        Actor below = getOneObjectAtOffset (getImage().getWidth(), getImage().getHeight(), plataforma.class);  
        return below != null; 
    }
 
    public void checkFall()
    {
        if (onFloor())
        {
           Actor below = getOneObjectAtOffset (getImage().getWidth(), getImage().getHeight(), plataforma.class);
           setLocation(below.getX(), below.getY());

        }
        
    }
    
    public void fall()
    {
        if (!onFloor())
        {
            MyWorld mundo=(MyWorld)getWorld();
            if(getY()<=mundo.getHeight()-20)
            setLocation(getX(), getY()+ velocidad);
        }
    }
    
    public boolean DetectaTecla(){
        boolean TeclaPresionada = false;
        
        if (Greenfoot.isKeyDown("space")) 
        {
            if (!TeclaPresionada) 
            {
              TeclaPresionada = true;
              //System.out.println("Estoy presionando espacio");
              salta();
            }
        }
        else{
          TeclaPresionada = false;
          //System.out.println("No se presiono espacio");
          fall();
        }
        return TeclaPresionada ;
    }
    
}
