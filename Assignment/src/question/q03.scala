package question_01

object q03 {
  def main(args:Array[String])
  {
    var n = total(24.95,60).toInt
    var m = total(24.95,60)
    var cents = ((m-n)*100).toInt
    println("Total wholesale cost is "+n+ " Rupees and " +cents+" Cents")
  }
  
  def total(x:Double,y:Int):Double=
  {
    var discount_unit_price = (x*60)/100
    var total_discount_price = (discount_unit_price)*60
    if(y>50)
    {
      var total_shipping_cost = (50*3)+((y-50)*0.75)
      var z = (total_shipping_cost+total_discount_price)
      return z
    }
    
    else
    {
      var total_shipping_cost = y*3
      var z = (total_shipping_cost+total_discount_price)
      return z
    }
    
    
     
  }
}