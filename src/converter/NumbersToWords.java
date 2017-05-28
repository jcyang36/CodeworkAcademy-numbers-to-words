package converter;
import java.util.Scanner;
public class NumbersToWords{
    public static void main(String[] args){
    	System.out.println("Your number here: ");
    	Scanner receiveInput=new Scanner(System.in);
    	Integer inputNumber=receiveInput.nextInt();
    	//Integer inputNumber=525600; 
    	String numStr= inputNumber.toString(); //char array was giving errors
    											//what makes Integer work when int doesn't
    int inputLength=numStr.length();
        int counter=inputLength-1;
        int currentDigit=1;
		String outputNumber ="";
        while (counter>=0){
        	
        	currentDigit=(int)(numStr.charAt(inputLength-counter-1)-'0');
        	//System.out.println("223".charAt(2));
        	//System.out.println(inputLength);
        	//System.out.println(Long.toString(currentDigit));//currentDigit is at 3-2-1=0, then 3-1-1=1
        													//toString converts to Long
        	
	        if (currentDigit!=0){
	        	int inputTenCubed=(int)(inputLength-1)/3;
				//if (counter%3==2 && ( counter/3==0 || (int)(numStr.charAt(inputLength-counter)-'0')!=0) ){
	        	if (counter%3==2){
					if (currentDigit==1){
					outputNumber=outputNumber+" one";
					}else if (currentDigit==2){
					outputNumber=outputNumber+" two";
					}
					else if (currentDigit==3){
					outputNumber=outputNumber + " three";
					
					}else if(currentDigit==4){
						outputNumber=outputNumber+ " four";
								
					}else if (currentDigit==5){
						outputNumber=outputNumber+ " five";
					}else if (currentDigit==6){
						outputNumber=outputNumber+ " six";
					}else if (currentDigit==7){
						
						outputNumber=outputNumber+ " seven";
					}else if (currentDigit==8){
						outputNumber =outputNumber +" eight";
					}else if (currentDigit==9){
						outputNumber =outputNumber +" nine";
					}
					
				
					outputNumber=outputNumber+" hundred";}
				if (counter%3==2 && counter/3==1 &&(int)(numStr.charAt(inputLength-counter)-'0')==0&&(int)(numStr.charAt(inputLength-counter+1)-'0')==0) {
					outputNumber=outputNumber + " thousand";
				}
				if (counter%3==2 && counter/3==2 &&(int)(numStr.charAt(inputLength-counter)-'0')==0&&(int)(numStr.charAt(inputLength-counter+1)-'0')==0) {
						outputNumber=outputNumber + " million";
				}
				
					
				//end of hundreds
				// tens digit is one—these are the teen cases
				if (currentDigit!=0 && counter%3 ==1 && currentDigit!=1){
					
					if (currentDigit==2){
						outputNumber=outputNumber+" twenty";}
					if (currentDigit==3) {
						outputNumber=outputNumber+" thirty";}
					if (currentDigit==4){
						outputNumber=outputNumber+" forty";}
					if (currentDigit==5){
						outputNumber=outputNumber+" fifty";}
					if (currentDigit==6){
						outputNumber=outputNumber +" sixty";}
					if (currentDigit==7){
						outputNumber =outputNumber +" seventy";}
					if (currentDigit==8){
						outputNumber =outputNumber +" eighty";}
					if (currentDigit==9){
						outputNumber =outputNumber +" ninety";}
					if (counter%3==1 && counter/3==1 &&(int)(numStr.charAt(inputLength-counter)-'0')==0){
					outputNumber=outputNumber +" thousand";
					}
					if (counter%3==1 && counter/3==2 &&(int)(numStr.charAt(inputLength-counter)-'0')==0){
						outputNumber=outputNumber +" million";
						}
						
				}//end if for tens
				if( currentDigit==1 && counter %3 ==1){ 
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " ten";}
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " eleven";}
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " twelve";}
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " thirteen";}
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " fourteen";}
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " fifteen";}
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " sixteen";}
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " seventeen";}
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " eighteen";}
						if ((int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber+ " nineteen";}
						if (counter%3==1 && counter/3==1 &&(int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber +" thousand";
							}
						if (counter%3==1 && counter/3==2 &&(int)(numStr.charAt(inputLength-counter)-'0')==0){
							outputNumber=outputNumber +" million";
							}
							
					}	//End If for teens
					 inputTenCubed=(int)(counter)/3;
					if(counter%3 ==0 && (int)(numStr.charAt(inputLength-counter-2)-'0')!=1){
						if (currentDigit==1){outputNumber=outputNumber+" one";}
						
						if (currentDigit==2){outputNumber=outputNumber+" two";}
						
						if (currentDigit==3){outputNumber=outputNumber+" three";}
						
						if (currentDigit==4){outputNumber=outputNumber+" four";}
						
						if (currentDigit==5){outputNumber=outputNumber+" five";}
						
						if (currentDigit==6){outputNumber=outputNumber+" six";}

						if (currentDigit==7){outputNumber=outputNumber+" seven";}

						if (currentDigit==8){outputNumber=outputNumber+" eight";}

						if (currentDigit==9){outputNumber=outputNumber+" nine";}

					
					
					
						if (inputTenCubed==0){outputNumber=outputNumber+"";}
					
						if (inputTenCubed==1){outputNumber=outputNumber+" thousand";}
						if (inputTenCubed==2){outputNumber=outputNumber+" million";}
						}//End if for units
				
				
	        }
	        
	        counter=counter-1;
	        
        }
    System.out.println("Your number is: " + outputNumber);
   
    }
    }
