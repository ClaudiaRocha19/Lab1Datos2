/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author cmrocha
 */
class Nodo{
    String info;
    ArrayList<Nodo> hijos;
    Nodo(String dato){
        hijos = new ArrayList<>();
        info = dato;
        
    }
}
public class Tree {
   private Nodo raiz;
   public Tree(){
       raiz = null;
   }
   public Nodo BuscarNodo(String info){
       return (BuscarNodo(raiz,info));
   }
     Nodo result = null;
  private Nodo BuscarNodo(Nodo nodo, String info) { 
    if (nodo==null)
      result = null;      

    if (info.equals(nodo.info))        
      result = nodo; 
          
    for(Nodo n: nodo.hijos)    
      BuscarNodo(n, info); 
    
    return result;
  }   
    public void insertarNodo(String info, String infopadre)
  {      
      raiz = insertarNodo(raiz, info, infopadre);
  }
    
  private Nodo insertarNodo(Nodo nodo, String info, String infopadre)
  {              
      if(nodo == null)
          nodo = new Nodo(info);                                                                                             
      else 
      {          
          Nodo nodoPadre = BuscarNodo(infopadre);
          if(nodoPadre != null)          
              nodoPadre.hijos.add(new Nodo(info));
          else
              nodo.hijos.add(new Nodo(info));
      }
      System.out.println("NODO INFO : "+info);
      return nodo;
  }
}
