package Inicio;

import java.util.ArrayList;

public class Proceso {
    
    private ArrayList<Object> array = new ArrayList<Object>();
    
    public Proceso()
    {
        
    }
    
    public Proceso(ArrayList<Object> array)
    {
        this.array=array;
    }
    
    public void agregarRegistro(Registro p){
        this.array.add(p);
    }

    public void modificarRegistro(int i, Registro p){
        this.array.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.array.remove(i);
    }
    
    public Registro obtenerRegistro(int i){
        return (Registro)array.get(i);
    }
    
    public int cantidadRegistro(){
        return this.array.size();
    }
    
    public int buscaCodigo(int codigo){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(codigo == obtenerRegistro(i).getMatricula())return i;
        }
        return -1;
    }
    
}
