import scalaj.http.{Http, Token}

object SolverLevelOne extends App {
  println("Scala task solver for Daniel Server v.0.1A")

  val response = Http("http://34.122.17.54:8080/api/sign-up")
    .postData("{ \"name\": \"Gennady\" }")
    .asString
  println("My token is " + response)

}
