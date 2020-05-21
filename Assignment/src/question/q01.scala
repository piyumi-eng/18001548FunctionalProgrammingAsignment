package question_01

object q01 {
  def main(args:Array[String])
  {
    var temp=temperature(35)
    println(temp+"F")
  }
  
  def temperature(x:Int):Double=
  {
    var t = ((x*1.8000)+32.00)
    return t
  }
}