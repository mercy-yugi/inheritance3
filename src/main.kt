fun main(){
    var car=Car("Fit","Honda",5,"Dark chocolate")
    car.carry(3)
    car.carry(10)
    car.identity()
    car.calculateParkingFees(2)


    var markx=Bus("NISSAN","XYZ",38,"White")

    markx.maxTripFare(50.0)
    markx.calculateParkingFees(5)

}

open class Car ( var model:String,  var make:String,   var capacity:Int, var color:String) {
    fun carry(people: Int) {
        var total= people-capacity

        if (people<=capacity){
            println("carry $people passengers")
        }
        else
            println("overcarrying by $total ")
    }
    fun identity() {
        println("I am a $color $make $model")

    }

    open fun calculateParkingFees(hours: Int): Int {
        var parkingFees = 20
        var total1=parkingFees * hours
        println(total1)
        return total1
    }
}

class Bus(model:String, make:String,capacity:Int,color:String):Car(model,make,capacity,color) {
    fun maxTripFare(fare: Double): Double {
        var max = 20
        var totalAmount = max * fare
        println(totalAmount)
        return totalAmount
    }

    override fun calculateParkingFees(hours: Int): Int {
        var product=hours*capacity
        println(product)
        return product

    }
}



