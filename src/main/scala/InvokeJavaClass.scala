object InvokeJavaClass {

  def main(args :Array[String])={
    val javaClass = new MnistClassifier();
    javaClass.run();
    println("build model finished");
  }

}