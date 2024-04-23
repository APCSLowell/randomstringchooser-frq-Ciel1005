import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> str;
  public RandomStringChooser(String [] s){
    str = new ArrayList<String>();
  for(int i = 0; i < s.length;i++)
    str.add(s[i]);
  }
  public String getNext(){
  if(str.size() == 0)
    return "NONE";
  int i = (int)(Math.random()*str.size());
    return str.remove(i);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
