class StatiskTabell<T> implements Tabell<T> {//throws FullTabellUnntak UgyldigPlassUnntak{

    private int storrelse;
    private int kapasitet;
    private boolean first = true; 
    StatiskTabell(int kapasitet){
	T[] statiskTabell =(T[]) new Object[kapasitet];
	  
    }

    public int storrelse(){
	return storrelse;

    }
    public boolean erTom(){
	if (storrelse == 0)return true; 

    }

    public void settInn(T element){
	if (first == true){
	    storrelse = 0;
	    first = false;  
	    }
	if (storrelse == kapasitet){
	    throw new FullTabellUnntak;
	}
        else{
	    statiskTabell[storrelse] = element; 
	    storrelse ++;
	}
	

    }
    public T hentFraPlass(int plass){
	if (plass<storrelse||plass>storrelse){
	    throw new  UgyldigPlassUnntak; 
	   
	}
	else{
	    return statiskTabell[plass];
	}
		
    }
}
