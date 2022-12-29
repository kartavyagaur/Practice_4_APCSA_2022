/** 
  Author: Mark Estep
  Date: 1/5/22
  Edited:
**/

public class SubstitutionCipher implements Cipherable{
  private String key;
  public SubstitutionCipher(){
    key = ""; //make random key, print on screen
  }
  public SubstitutionCipher(String k){
    key = k;
  }
  public String encode(String in){
    String upper = in.toUpperCase();
    String ans = "";
 
    return ans;
  }
 
  public String decode(String in){
    String upper = in.toUpperCase();
    String ans = "";
 
    return ans;
  }
  public String getKey(){
    return key;
  }
}