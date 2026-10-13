
class Re{

  public static void main(String [] args)

  {
    String input = "Hello World";
   // String enter = input.nextLine();
    char [] array = input.toCharArray();
    char find = input.charAt(0);
    char find2 = Character.toUpperCase(find);
    char find3 = Character.toLowerCase(find); 
    for (int i=0;i<array.length;i++)
    {
      if((find2==array[i])|| ( find3==array[i]))
      {
        array[i] =  (char)(i);
      }
      else
      {
         array[i] =array[i];
       }
    }

    for(int i=0;i<array.length;i++)
      {
         System.out.print(array[i]);
      }
  }
}