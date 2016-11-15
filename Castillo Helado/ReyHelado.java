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
     
    private GifImage gifReyHelado = new GifImage("gifReyNuevo.gif");
    
    private GreenfootImage reyHeladoIzquierda = new GreenfootImage("sprite2Izquierda.png");
    private GreenfootImage reyHeladoDerecha = new GreenfootImage("sprite3Derecha.png");
    private GreenfootImage reyHeladoEspacio = new GreenfootImage("spriteSalto.png");
    
     private boolean bajaConPlataforma2 = true;
    
    /**
     * Act - do whatever the ReyHelado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
   
        
        setImage(gifReyHelado.getCurrentImage());
        controlIzqDer();
        bajaConPlataforma();
        saltoConGravedad();
        agarraPinguino();
        agarraPrincesa();
        golpeAlReyHelado();
       
    }    
    
    /**
     * Este metodo se encarga de subir al rey helado en la plataformas que se elevan y bajan mediante una variable boleeana y al tocar la plataforma  
     */
    public void bajaConPlataforma(){    
        if (isTouching(plataforma2.class)) 
        {
            if(this.getY() >= getWorld().getHeight()) {
                bajaConPlataforma2 = true;
            }
            else if(this.getY() <= 0)
            {
                bajaConPlataforma2 = false;
            }
            if(bajaConPlataforma2) 
            {
                setLocation( this.getX() , this.getY()-10 );
            }
            else 
            {
                setLocation ( this.getX() , this.getY()+10 ); 
            }
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
            else if(Greenfoot.getRandomNumber(8)<2)
            {
                        Greenfoot.playSound("que.wav");
            
            }
            
        }
        
    }
    /**
     * Cuando el rey helado coincide con las coordenadas de un objeto tipo princesa
     * es eliminado del mundo y se incrementa el contador de princesas
     */
    public void agarraPrincesa()
    {   
        
        MyWorld mundo =(MyWorld)getWorld();
        Actor Princesa;
        Princesa = getOneObjectAtOffset(0,0,Princesa.class);
        
        if(Princesa!=null)
        {
           mundo.removeObject(Princesa);
           mundo.incrementaPrincesas();
           Greenfoot.playSound("amoAlasprincesas.wav");
           ((MyWorld)mundo).incrementaPrincesas();
        }
    }
    
    /**
     *Se utiliza para mover de izquierda y derecha al Rey Helado 
     */
     public void controlIzqDer()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
            setImage(reyHeladoDerecha);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
            setImage(reyHeladoIzquierda);
        }
        
          
    }
    
    /**
     * Se encarga de simular un salto mediante nuestro mundo utilizando
     * el metodo setLocation y utilizando una variable de instancia para 
     * desplazarse decrementando el valor de Y del objeto rey Helado
     */
    public void salta()
    {
        setLocation(getX(),getY()-velocidad);
    }
    
    /**
     * Devuelve las coordenadas del objeto tipo plataforma utilizando como
     * valor valor central en y y todo el ancho de x estor siempre y cuando
     * no sea 
     */ 
    public boolean onFloor()
    {
        Actor actor = getOneObjectAtOffset (0, getImage().getHeight()/2,plataforma.class);    
        return actor != null;
    } 
    
        
    public void fall()
    {
        if (!onFloor())
        {
            MyWorld mundo=(MyWorld)getWorld();
            if(getY()<=mundo.getHeight()-getImage().getWidth()/2)
            setLocation(getX(), getY()+ velocidad);

        }
        
    }
    
    
    public boolean saltoConGravedad(){
        boolean TeclaPresionada = false;
        
        if (Greenfoot.isKeyDown("space")) 
        {
            if (!TeclaPresionada) 
            {
              TeclaPresionada = true;
              salta();
              setImage(reyHeladoEspacio);
            }
        }
        else{
        TeclaPresionada = false;
        fall();
       
        }
        return TeclaPresionada ;
    }
    
    public void golpeAlReyHelado(){
        MyWorld mundo=(MyWorld)getWorld();
        if(isTouching(Arcoiris.class))
        {
            mundo.decrementaVidas();
            this.setLocation( getWorld().getWidth()/2 , 0 );
            Greenfoot.playSound("si yo no hice nada.wav");
        }
    }
   
}
