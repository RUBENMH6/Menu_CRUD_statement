import java.sql.DriverManager
import java.util.Scanner

fun main(args: Array<String>) {
    val url = "jdbc:sqlite:/home/INFORMATICA/alu10211999/IdeaProjects/id_usuario.sqlite"
    val con = DriverManager.getConnection(url)
    create(url,con)

    while(true) {
        println("Menú de opciones (0 para salir):")
        println("1. Select")
        println("2. Insert")
        println("3. Update")
        println("4. Delete")
        val input = Scanner(System.`in`).nextInt()
        when (input) {
            0 -> {
                con.close()
                System.exit(1)
            }
            1 -> select(url, con)
            2 -> insert(url, con)
            //3 -> update()
        }
    }
}