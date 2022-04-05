class Main {
  public static void main(String[] args) {
    int z,x;
    for(z=0;z<5;z++)
    {
      for(x=0;x<5*2;x++)
      {
      if(x>(z)) 
      {
      System.out.print(" "); 
      }
        else 
      {
        System.out.print("*");
      }
      }
       System.out.println();
    }
    
  }
}