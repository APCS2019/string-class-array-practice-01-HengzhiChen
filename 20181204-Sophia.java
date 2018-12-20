//Pastpaper 2015

//main idea:String,class
public class HiddenWord{
    private String puzzle;
    public HiddenWord(String hiddenWord){
        this.puzzle = hiddenWord;
        }
    public String getHint(String guess){
        String b="";
        for(int i=0,i<puzzle.length(),i++){
            if(guess.substring(i,i+1).equals(puzzle.substring(i,i+1))){
                b+=puzzle.substring(i，i+1);
            }
            if(puzzle.indexOf(guess.substring(i,i+1)=-1)){
                b+="*";}
            else
                b+="+";
                }
         }
            return b;
            }
       } 
        
