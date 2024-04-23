import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> st;
  public RandomStringChooser(String [] s){
    st = new ArrayList<String>();
  for(String w; s)
    st.add(w);
  }
  public String getNext(){
  if(st.size() == 0)
    return "NONE";
  int i = (int)(Math.random()*st.size());
    return st.remove(i);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
