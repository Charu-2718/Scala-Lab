object Identifiers {
   def main(args: Array[String]) {

 // alphanumeric identifiers
    var x:Int = 20;
    var y:Int = 10;
    println(x);
    println(y);
 // Operator identifier 
    
    var sum = x + y; 
    println("The Sum is :");
    println(sum);

 // Mixed identifier
    var num_+ = 20;
    println("Display the result of mixed identifier:");
    println(num_+);

 // Valid literal identifiers
    var `name` = "Charu"
    var `age` = 20
    println("Name:" +`name`+" and " +"Age:" +`age`);
    
   }
}