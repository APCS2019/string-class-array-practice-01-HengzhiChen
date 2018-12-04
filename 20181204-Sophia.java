//Pastpaper 2015

//main idea:String,class
public class HiddenWord{
    private String puzzel;
    public HiddenWord(String hiddenWord){
        this.puzzel = hiddenWord;
        }
    public String getHint( String guess){
        String b="";
        for(int i=0,i<puzzel.length(),i++){
            if(guess.substring(i,i+1).equals(puzzel.substring(i,i+1))){
                b+=puzzel.get(i);
            }
            if(puzzel.indexOf(guess.substring(i,i+1)=-1)){
                b+="*";}
            else
                b+="+";
                }
         }
            return b;
            }
       } 
        
