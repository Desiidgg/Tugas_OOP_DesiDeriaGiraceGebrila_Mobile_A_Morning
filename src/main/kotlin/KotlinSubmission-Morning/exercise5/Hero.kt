package id.infinitelearning.KotlinSubmission.exercise5

class Hero(var name: String = "", var age: Int = 0, var height: Double = 0.0) {
    fun setProfile(name: String, age: Int, height: Double) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun displayProfile() {
        println("Profile:")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println()
    }

    fun activityChallenge(activity: String, times: Int) {
        repeat(times) {
            println("$name sedang $activity")
        }
    }

    fun displayStatus() {
        println("Status Terkini:")
        displayProfile()
    }
}

fun main() {
    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     */
    val hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     */
    hero.setProfile("Desi", 20, 166.0)

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     */
    hero.displayProfile()

    /**
     * Challenge:
     * Codenesia -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
     */

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     */
    hero.activityChallenge("jalan", 2)
    hero.activityChallenge("lari", 2)
    hero.activityChallenge("makan", 1)
    hero.activityChallenge("minum", 3)
    hero.activityChallenge("lompat", 1)
    hero.activityChallenge("duduk", 2)

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     */
    hero.displayStatus()
}
