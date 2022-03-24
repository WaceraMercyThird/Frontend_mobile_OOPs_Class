fun main(){
    var person = Human("Cate McGlee", 40, 66.5)
    person.eat(50)
    person.speak("I love speaking to people")
    person.birthday()
    println("${person.name} ${person.age} ${person.weight}")

    var Christine = Student("Sally", "Markle", "marklesally@gmail.com", 782987338)
    println("${Christine.firstName} ${Christine.firstName}")
}


class Human (var name:String, var age: Int,var weight:Double){

    fun eat(foodWeight:Int){
        println("I am eating ${foodWeight}kgs of food" )
        weight+=foodWeight
    }
    fun speak(speech: String){
        println(speech)
    }
    fun birthday(){
        age++
        println(age)
    }
}

data class Student(var firstName: String,var lastName: String, var email: String,var phoneNumber: Int)


