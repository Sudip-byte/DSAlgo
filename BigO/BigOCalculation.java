class BigOCalculation {
  public static void main(String[] args) {
    int result = funChallenge();
    System.out.println(result);
  }

 public static int funChallenge() {
  int a = 10;
  a = 50 + 3;

  int[] input = {1,2,3,4,5};
  for (int i = 0; i < input.length; i++) {
    
    anotherFunction(); 
    // Will exeecute based on the length of input array O(n)
    
    boolean stranger = true; 
    // Will exeecute based on the length of input array O(n)
    
    a++;// Will exeecute based on the length of input array O(n) and return
  }
  return a; //O(1)
}

  public static void anotherFunction()
  {
    System.out.println("Dummy Function");
  }
  
}

//The time complexity of the above code segment is O(n)