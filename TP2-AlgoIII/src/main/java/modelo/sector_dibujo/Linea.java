package modelo.sector_dibujo;

public abstract class Linea {
    
	Posicion punto1;
    Posicion punto2;
    Color color;
    
    //REVISAR NULLOBJECT
    //QUE LINEA SEA UNA INTERFAZ Y QUE LA IMPLEMENTEN LINEA Y LINEANULA
    public Linea(Posicion unPunto, Posicion otroPunto){
        this.punto1 = unPunto;
        this.punto2 = otroPunto;
    }
    
    public Linea(Linea otraLinea){
    	this.punto1 = otraLinea.getPunto1();
    	this.punto2 = otraLinea.getPunto2();
    }

    public Posicion getPunto1() {return punto1;}
    public Posicion getPunto2() {return punto2;}
    
    public void setPunto1(Posicion unPunto) {this.punto1 = unPunto;}
    public void setPunto2(Posicion unPunto) {this.punto2 = unPunto;}

    
    public boolean igualA(Linea otraLinea) {
    	
    	if(this.color == otraLinea.getColor()) {
    		
    		if((this.punto1).igualA(otraLinea.getPunto1()) && (this.punto2).igualA(otraLinea.getPunto2())){
    	    	return true;
    	    }
    	    	
    	    if((this.punto2).igualA(otraLinea.getPunto1()) && (this.punto1).igualA(otraLinea.getPunto2())){
    	    	return true;
    	    }
    	}
	    	
	    return false;
    }
    
    public boolean mismaUbicacion(Linea otraLinea){
    	    	
		if((this.punto1).igualA(otraLinea.getPunto1()) && (this.punto2).igualA(otraLinea.getPunto2())){
	    	return true;
	    }
	    	
	    if((this.punto2).igualA(otraLinea.getPunto1()) && (this.punto1).igualA(otraLinea.getPunto2())){
	    	return true;
	    }
	    
	    return false;
	}
    
    public abstract Color getColor();
    
}
    

