public class Manecilla{
  private int limite;
  private int tiempo;
  public int getLimit(){
      return this.limite;
    }
  public void setLimit(int limite){
      this.limite=limite;
    }
  public int getTime(){
      return this.tiempo;
    }
  public void setTime(int tiempo){
    if(tiempo<0||tiempo>=getLimit()){
      this.tiempo=0;

    }else{
      this.tiempo=tiempo;

    }
  }
  public Manecilla(int limite, int tiempo){
    this.limite=limite;
    this.tiempo=tiempo;
  }
  public Manecilla(){
    this.limite=0;
    this.tiempo=0;
  }
  public boolean avanzar(){
    this.tiempo++;
    if (this.tiempo==this.limite){
      this.tiempo=0;
      return true;
    }else{
      return false;
    } 
  }
}