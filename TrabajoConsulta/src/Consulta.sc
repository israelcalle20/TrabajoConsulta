
  def integracion(f: Double => Double, a: Double, b: Double): Double = {
    val xBarra = (a + b) / 2
    ((b - a) / 6) * (f(a) + 4 * f(xBarra) + f(b))
  }

  def error(valorEsperado: Double, valorObtenido: Double): Double =
    math.abs(valorEsperado - valorObtenido)


  // EJEMPLOS

  val f1 = (x: Double) => -x*x + 8*x - 12
  val i1 = integracion(f1, 3, 5)
  println("Integral 1 = " + i1)

  val f2 = (x: Double) => 3*x*x
  val i2 = integracion(f2, 0, 2)
  println("Integral 2 = " + i2)

  val f3 = (x: Double) => x + 2*x*x - x*x*x + 5*x*x*x*x
  val i3 = integracion(f3, -1, 1)
  println("Integral 3 = " + i3)

  val f4 = (x: Double) => (2*x + 1) / (x*x + x)
  val i4 = integracion(f4, 1, 2)
  println("Integral 4 = " + i4)

  val f5 = (x: Double) => math.exp(x)
  val i5 = integracion(f5, 0, 1)
  println("Integral 5 = " + i5)

  val f6 = (x: Double) => x / (x - 1)
  val i6 = integracion(f6, 2, 3)
  println("Integral 6 = " + i6)

  val f7 = (x: Double) => 1 / (1 + x*x)
  val i7 = integracion(f7, 0, 1)
  println("Integral 7 = " + i7)


