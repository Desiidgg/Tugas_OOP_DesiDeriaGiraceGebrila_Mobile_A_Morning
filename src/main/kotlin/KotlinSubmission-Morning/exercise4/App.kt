package id.infinitelearning.KotlinSubmission.exercise4

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini

fun test(a: Int, b: Int) : Any {
    return try {
        a/b
        //println("Hasilnya adalah: "+ a / b)
    }
    catch(e:Exception){
        println(e)
        "Apabila nilai b=10, maka hasilnya tidak terdefinisi"
    }
}
// main function
fun main(args: Array<String>) {
    var result1 = test(10,5 ) //execute try block
    println(result1)
    var result = test(10,0 ) // execute catch block
    println(result)
}


