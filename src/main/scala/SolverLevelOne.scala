import scalaj.http.{Http, HttpRequest, HttpResponse, Token}

object SolverLevelOne extends App {
  println("Scala task solver for Daniel Server v.0.1A")

  val token = "28076f4c-a6a8-4379-ae38-6fa4ca9b2125"

  //val response = Http("http://34.122.17.54:8080/api/sign-up")
  //  .postData("{ \"name\": \"Gennady\" }")
  //  .asString
  //println("My token is " + response)

  //val response = Http("http://34.122.17.54:8080/api/task/help")
  //  .header("puzzle_session", token)
  //  .asString
  //println("My task is " + response)

  val task = Http("http://34.122.17.54:8080/api/task")
    .header("puzzle_session", token)
    .asString
  println("My task is " + task)

  //Need to write a parser for tasks...

}
