package Exploration;

public class Ile {
	

    private String nomIle;
    private int NbMonument = 18;
    private int nbVisite;
	
    
    public Ile() {    	

    }

    public Ile(String ile,int n) {    	
    this.nomIle = ile;
	this.nbVisite = n;
    
    }
    
    public String nameIle() { 
        return this.nomIle; 
    }
    
    public int nbVisiteIle() { 
        return this.nbVisite; 
    }
    
    public int getNbMonument()
    {
        return this.NbMonument;
    }

}
