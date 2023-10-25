import java.sql.Connection
import java.sql.DriverManager
import java.util.Scanner

fun select(url: String, con: Connection) {

    val st = con.createStatement()

    println("¿Quieres algún filtrar por campos?")
    println("En caso afirmativo escribe los campos separados por comas")
    println("En otro caso escribe '*'")
    val input = Scanner(System.`in`).nextLine()

    if (input.equals('*')) {
        val sentSQL = "SELECT * FROM USUARIO"
    } else {
        val items = input.split(",")
    }

    val sentSQL = "SELECT * FROM USUARIO"

    val query = st.executeQuery(sentSQL)
    while (query.next()) {
        print("" + query.getString(1) + "\t")
        print("" + query.getString(2) + "\t")
        print("" + query.getString(3) + "\t")
        print("" + query.getString(4) + "\t")
        print("" + query.getInt(5) + "\t")
        print("" + query.getString(6) + "\t")
        println()
    }


    st.close()

}