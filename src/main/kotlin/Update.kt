import java.sql.DriverManager
import java.util.*

fun insert() {
    val url = "jdbc:sqlite:/home/INFORMATICA/alu10211999/IdeaProjects/id_usuario.sqlite"
    val con = DriverManager.getConnection(url)

    val st = con.createStatement()
    println("Añade una nueva fila")
    println("Introduce el nombre:")
    val nombre = Scanner(System.`in`).nextLine()
    println("Introduce el nickname:")
    val nickname = Scanner(System.`in`).nextLine()
    println("Introduce la contraseña:")
    val pass = Scanner(System.`in`).nextLine()
    println("Introduce el teléfono:")
    val tlf = Scanner(System.`in`).nextInt()
    println("Introduce el email:")
    val email = Scanner(System.`in`).nextLine()

    st.executeUpdate("INSERT OR REPLACE INTO USUARIO (nombre, user, password, tlf, email) VALUES ('$nombre', '$nickname', '$pass', $tlf, '$email')");

    println("Se ha ejecutado el insert correctamente")
    println()

    select()


    st.close()
    con.close()
}