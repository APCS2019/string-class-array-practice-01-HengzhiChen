//Pastpaper 2015

//main idea:String,class
public class HiddenWord{
    String hiddenWord;
    String sth;
    public HiddenWord(String hiddenWord, String sth){
        this.hiddenWord = hiddenWord;
        this.sth = sth;
        }
    public String getHint( String hiddenWord, String sth){
        for(int i=0,i<hiddenWord.length(),i++){
            if(sth.get(i).equals(hiddenWord.get(i)){
                b+=hiddenWord.get(i);
            }
            if(sth.get(i).compareTo(hiddenWord)=-1){
                b+="*";}
            else
                b+="+";
                }
            return b;
            }
        
