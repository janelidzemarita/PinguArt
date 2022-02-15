package pgdp.pinguart;

import static pgdp.MiniJava.*;

public class PinguArt {

	public static void main(String[] args) {
		String[] ping = new String[8]; //String Array MJ
		String[] pinguArtt = new String[8];
		for (int i = 0; i < 8; i++){  // loop to get numbers
			ping[i] = readString("Please enter a Pingu Art number:");
			ping[i] = String.format("%08d", Integer.parseInt(ping[i]));  // put 0-s in front if length less than 8
			ping[i] = String.valueOf(ping[i]);  
		}

		for (int j = 0; j <= 7; j++) {   //loop to switch numbers to Symbols   MJ
			for (int i = 7; i >= 0; i--) {
				if (i==7){
					if (ping[j].charAt(i) == 49){
						pinguArtt[j] = "-";
					}else if (ping[j].charAt(i) == 50) {
						pinguArtt[j] = "~";
					}else if(ping[j].charAt(i) == 51){
						pinguArtt[j] = "P";
					}else{
						pinguArtt[j] = " ";
					}
				}else{
				if (ping[j].charAt(i) == 49){
					pinguArtt[j] += "-";
				}else if (ping[j].charAt(i) == 50) {
					pinguArtt[j] += "~";
				}else if(ping[j].charAt(i) == 51){
					pinguArtt[j] += "P";
				}else{
					pinguArtt[j] += " ";
				}
				}}
			}
		write("+---[PinguArt]---+");  //Final output start   MJ
			for (int i = 1; i <= 7; i++){
				write("|" + pinguArtt[i-1] + pinguArtt[i] + "|");
				i += 1;
			}
		write("+----------------+");  //final output finish   MJ
		}
	}
