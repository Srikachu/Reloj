public class Reloj{
  Secundero s;
  Minutero min;
  Horario h;
  public Reloj(){
    s= new Secundero(0);
    min=new Minutero(0);
    h=new Horario(0);
  }
  public Reloj(Secundero s, Minutero min, Horario h){
    this.s= s;
    this.min=min;
    this.h=h;
  }
  public void SetS(Secundero s){
    this.s=s;
  }
  public Secundero GetS(){
    return s;
  }
  public void SetMin(Minutero min){
    this.min=min;
  }
  public Minutero GetMin(){
    return min;
  }
  public void SetH(Horario h){
    this.h=h;
  }
  public Horario GetH(){
    return h;
  }
  public void incrementar(){
    if(s.avanzar()){
      if(min.avanzar()){
        h.avanzar();
      }
    }
  } 
  String imprimir(){
    String time="";
    if(h.getTime()<10){
      time=time+"0"+h.getTime()+":";
    }else{
      time=time+h.getTime()+":";
    }
    if(min.getTime()<10){
      time=time+"0"+min.getTime()+":";
    }else{
      time=time+min.getTime()+":";
    }
    if(s.getTime()<10){
      time=time+"0"+s.getTime();
    }else{
      time=time+s.getTime();
    }
    return time;
  }
}