package exercicio;

import java.util.Date;

public class Data {
	
	//atributos
	private int dia, mes, ano;
	private Date dataAtual;
	
	//construtor
	public Data(int dia, int mes, int ano) {
		if(this.dia >=1 && this.dia <=30) {
			this.dia = dia;
		}else {
			this.dia = 1;
		}
		
		if(this.mes >=1 &&  this.mes <=12) {
			this.mes = mes;
		}else {
			this.dia = 1;
		}
		this.ano = ano;
	}
	
	//construtor sem parametros
	public Data() {
		Date dataAtual = new Date();
		this.dia = dataAtual.getDate();
		this.mes = dataAtual.getMonth() + 1;
 		this.ano = dataAtual.getYear() + 1900;
	}
	
	// Métodos set e get (dia - mes - ano)
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Método apresenta Data
	public void apresentaData() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}
		
	// Método apresenta Data 2
	public void apresentaData(boolean estacao) {
		String nomeMes = null;
		switch(this.mes)
		{
		    case 1:
		       nomeMes = "Janeiro";
		       break;
		    
		    case 2:
		    	nomeMes = "Fevereiro";
		    	break;
		    
		    case 3:
	    		nomeMes = "Março";
	    		break;
	    		
		    case 4:
	    		nomeMes = "Abril";
	    		break;
	    		
		    case 5:
	    		nomeMes = "Maio";
	    		break;
	    		
		    case 6:
	    		nomeMes = "Junho";
	    		break;
	    		
		    case 7:
	    		nomeMes = "Julho";
	    		break;
	    		
		    case 8:
	    		nomeMes = "Agosto";
	    		break;
		    
		    case 9:
	    		nomeMes = "Setembro";
	    		break;
	    		
		    case 10:
	    		nomeMes = "Outubro";
	    		break;
	    		
		    case 11:
	    		nomeMes = "Novembro";
	    		break;
	    		
		    case 12:
	    		nomeMes = "Dezembro";
	    		break;
		}
		if (estacao) {
			System.out.println(this.dia + " de " + nomeMes + " de " + this.ano);
			
			if(this.mes >=3 && this.mes <=5) {
				System.out.println("Outono");
			}else if(this.mes >=5 && this.mes <= 8) {
				System.out.println("Inverno");
			}else if(this.mes >=9 && this.mes<= 11) {
				System.out.println("Primavera");
			}else {
				System.out.println("Verão");
			}
			
		}else {
			System.out.println(this.dia + " de " + nomeMes + " de " + this.ano);
		}
	}
	
	// Método dia seguinte
	public void diaSeguinte() {
		this.dia++;
		if(this.dia > 30) {
			this.dia = 1;
			this.mes += 1;
			if(this.mes > 12) {
				this.mes = 1;
				this.ano++;
			}
		}
	}
	
	// Método soma tempo
	public void somaTempo(int dia) {
		for(int i=0; i<dia; i++) {
			diaSeguinte();
		}
	}
	

}
