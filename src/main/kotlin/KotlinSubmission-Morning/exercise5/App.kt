package id.infinitelearning.KotlinSubmission.exercise5

class AppHero(var name: String, var age: Int, var height: Double) {

    var jalanCount: Int = 0
    var lariCount: Int = 0
    var makanCount: Int = 0
    var minumCount: Int = 0
    var lompatCount: Int = 0
    var dudukCount: Int = 0

    fun setProfile(name: String, age: Int, height: Double) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun showProfile() {
        println("Profile:")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println()
    }

    fun jalan() {
        jalanCount += 2
    }

    fun lari() {
        lariCount += 2
    }

    fun makan() {
        makanCount += 1
    }

    fun minum() {
        minumCount += 3
    }

    fun lompat() {
        lompatCount += 1
    }

    fun duduk() {
        dudukCount += 2
    }

    fun showActivityStatus() {
        println("Activity Status:")
        println("$name berjalan sebanyak: $jalanCount kali")
        println("$name berlari sebanyak: $lariCount kali")
        println("$name makan sebanyak: $makanCount kali")
        println("$name minum sebanyak: $minumCount kali")
        println("$name lompat sebanyak: $lompatCount kali")
        println("$name duduk sebanyak: $dudukCount kali")
        println()
    }
}

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    val hero = AppHero("Desi", 20, 166.0)

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    hero.setProfile("Desi", 20, 166.0)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     *
     */
    hero.showProfile()


    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    hero.jalan()
    hero.lari()
    hero.makan()
    hero.minum()
    hero.lompat()
    hero.duduk()


    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    hero.showActivityStatus()

}
