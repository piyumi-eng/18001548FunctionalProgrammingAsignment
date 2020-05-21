package question_01

object q02 {
  
  def main(args:Array[String])
  {
    val pi:String = "pi"
    var volume_of_sphere = volume(5)+pi
    println("Volume of the sphere with pi is a symbol : " + volume_of_sphere)
    
    var vol_of_sphere = vol(5)
    println("Volume of the sphere with pi has a constant value : " + vol_of_sphere)
  }
  
  def volume(r:Float):Float=     //when pi is the symbol//
  {
    var volume:Float = (4*r*r*r)/3
    return volume
  }
  
  def vol(r:Double):Double=     //when pi has a constant value//
  {
    val pi:Double = 3.142
    var vol:Double = (4*r*r*r*pi)/3
    return vol
  }
}