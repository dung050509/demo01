package vn.rikkeisoft.bai10;

public class VanBan {
    private String noidung;
    
    
    public int countWord(String xau) {
    	final char SPACE=' ';
    	final char TAB='\t';
    	final char BREAK_LINE='\n';
    	
    	if(xau==null) {
    		return -1;
    	}
    	int count =0;
    	int n= xau.length();
    	boolean notCounted=true;
    	for(int i=0;i<n;i++) {
    		if(xau.charAt(i)!=SPACE && (xau.charAt(i)!=TAB) && (xau.charAt(i)!=BREAK_LINE)) {
    			if(notCounted) {
    				count++;
    				notCounted=false;
    			}
    		}
    		else {
    			notCounted=true;
    		}
    	}
    	return count;
    }
    public String chuanhoa(String xau) {
    	String xauOK=xau.trim();
    	while(xauOK.indexOf(" ")!=-1) {
    		xauOK=xauOK.replaceAll(" "," ");
    	}
    	return xau;
    }
    public int countH(String xau) {
    	int count =0;
    	int n =xau.length();
    	for(int i=0;i<n;i++) {
    		if((xau.charAt(i)=='h')||(xau.charAt(i)=='H')) {
    			count ++;
    		}
    	}
    	return count;
    }
	public VanBan() {
		super();
	}

	public VanBan(String noidung) {
		super();
		this.noidung = noidung;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
    
}
