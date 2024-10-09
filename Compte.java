package TP2;

public class Compte {
		public static int ref=0;
	    public int num;
	    private float solde = 0;
	    
	    public void deposer(float m) {
	        solde=solde+m;
	    }

	    public void retirer(float m) {
	        solde=solde-m;
	    }

	    public float avoirSolde() {
	        return solde;
	    }

	    public void transferer(float m, Compte c){
	        this.retirer(m);
	        c.deposer(m);
	    }
	    
	    public Compte() {
	    	ref++;
	    	this.num=ref;
	    	solde=0;
	    }
	}
