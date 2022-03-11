fun main(){
   caps(arrayOf("harare","mumbai","dodoma","jakarta"))
    Strings("Stanley","Antony","Zipporah","Susan")
    val y=name(arrayOf("Wambui","Veronicah","Florence"))
    println(y)
    sum()
}
//Create a function that takes in 4 strings  and creates an array out of them then
//prints out the array
fun Strings(w:String,x:String,y:String,z:String){
    var name= arrayOf(w,x,y,z)
    println(name.contentToString())
}


//Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.

fun caps(cities:Array<String>){
    cities.forEach { x->
        println(x.capitalize())
    }
}
//Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements(1 point)
//(ii) prints out the index of 158                                                                                (1 point)
//(iii) prints out the elements in ascending order (2 points)
fun sum(){
var num= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var addition=num[1] + num[4]
    println(addition)
    println(num.indexOf(158))
    var int=num.sortedArray()
    println(int.contentToString())


}







//4.Create a function that takes in 3 names and returns a string array containing

fun name(word:Array<String>):String{
    val firstname=word.contentToString()
    return firstname
}