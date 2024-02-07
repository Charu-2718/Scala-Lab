object Largest{  
    def main(args:Array[String]){  
        var num1:Double    = 0;
        var num2:Double    = 0;
        var maxNum:Double = 0;
        
        print("Enter number1: ")
        num1=scala.io.StdIn.readDouble()
        
        print("Enter number2: ")
        num2=scala.io.StdIn.readDouble()
        
        maxNum= scala.math.max(num1,num2)
        println("Maximum number: "+maxNum);
    }  
}