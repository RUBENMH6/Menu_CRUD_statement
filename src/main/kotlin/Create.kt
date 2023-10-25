import java.sql.Connection
import java.sql.DriverManager

fun create(url:String, con: Connection) {

    val st = con.createStatement()


    val sentSQL = "CREATE TABLE IF NOT EXISTS USUARIO ( " +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nombre VARCHAR(10), " +
            "nick VARCHAR(10)," +
            "password VARCHAR(10), " +
            "tlf NUMERIC," +
            "email VARCHAR(20) UNIQUE)"

    st.executeUpdate(sentSQL)
    st.close();

}