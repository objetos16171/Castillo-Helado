import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plataforma here.
 * Este objeto sirve para que el rey helado pueda quedarse resguardarseun rato
 * pero como son de hielo patinará cuando se encuentre encima de esta. 
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
 */
public class plataforma extends Actor
{
    private int velX=2;
    private int xdireccion=120;
    
    /**
     * Act - do whatever the plataforma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+velX, getY()); 
        muevePlataforma();
    }    
    
    /**
     * mueve la plataforma de derecha a izquierda 
     * 
     */
    public void muevePlataforma(){
       World mundo=getWorld();
        
       if(this.getX()>=getWorld().getWidth()-getImage().getWidth()/2){
            velX=velX*-1;
        }
       if(this.getX()<=getImage().getWidth()/2){
           velX=velX*-1;
        }
       }
    }

