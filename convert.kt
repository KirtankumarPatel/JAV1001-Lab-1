import java.util.*

//Method to get distance in miles and convert into Kilometers 

fun convertIntoKms(mi: Double): Double {
    return 0.62 * mi
}

//Method to get distance in Kilometers and convert into miles

fun convertIntoMiles(km: Double): Double {
    return 1.61 * km
}

//Method to get distance in Inches and convert into Centimetres

fun convertIntoCm(in: Double): Double {
    return 0.39 * in
}

//Method to get distance in Centimetres and convert into Inches

fun convertIntoIn(cm: Double): Double {
    return 2.54 * cm
}

//Method to get distance in Pound and convert into Kilogram

fun convertIntoKg(lb: Double): Double {
    return 2.2 * lb
}

//Method to get distance in Kilogram and convert into Pound

fun convertIntoLb(kg: Double): Double {
    return 0.45 * kg
}
// Main Method of Program
fun main(args: Array<String>) {
    try {
        val sc = Scanner(System.`in`)
        
        //Input Distance in Mi
        println("Enter Distance in Mi : ")
        val mi: Double = sc.nextDouble()
        
        println("$mi Mi equal to :  ${convertIntoKm(mi)}  KM")
        
        //Input Distance in km
        println("Enter Distance in Km  : ")
        val km: Double = sc.nextDouble()
        
        println("$km   KM equal to   :  ${convertIntoMi(km)}  Mi")

        //Input Distance in Cm
        println("Enter Distance in Cm : ")
        val cm: Double = sc.nextDouble()
        
        println("$cm CM equal to :  ${convertIntoIn(cm)}  IN")
        
        //Input Distance in In
        println("Enter Distance in In  : ")
        val in: Double = sc.nextDouble()
        
        println("$in   IN equal to   :  ${convertIntoCm(in)}  CM")

        //Input Distance in Kg
        println("Enter Distance in Kg : ")
        val kg: Double = sc.nextDouble()
        
        println("$kg KG equal to :  ${convertIntoLb(kg)}  LB")
        
        //Input Distance in Lb
        println("Enter Distance in Lb  : ")
        val lb: Double = sc.nextDouble()
        
        println("$lb   LB equal to   :  ${convertIntoKg(lb)}  KG")

    } catch (E: Exception) {
        System.err.println("Exception : " + E.message)
    }
}
