fun main(){
manyOperation(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    var small=Person("ann",30,175.5,60.8)
   println( small.decending())
    println( threeName("Regina","Chege","Wairimu"))
}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
fun manyOperation(numbers:Array<Int>){
    var sum=numbers[1]+numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray())
}
//2. Given a list of Person objects, each with the attributes, name, age,
//height, and weight. Sort the list in order of descending age (2 points)
class Person(var name:String,var age:Int,var height:Double,var weight:Double){
    fun decending():List<Int>{
    var decend= mutableListOf(23,45,34,12,56)
    return decend.sortedDescending()
    }
}

//3. Create a function that takes in 3 names and returns a string array
//containing all 3 names. (2 points)
fun threeName(name:String,name2:String,name3:String):String{
    var combine= arrayOf(name,name2,name3)
    return combine.contentToString()
}
//4. Write a function that takes in a list of Car objects each with a registration
//and mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)
class Car(var registration:String,var milage:Double){
    fun averageMillage(cars:List<Car>):Double{
            var totalMileage = 0.0
            for (car in cars) {
                totalMileage += car.milage
            }
            return totalMileage / cars.size
        }
    }
