/*import org.apache.spark.{SparkConf, SparkContext}

object ExerciseRDD {

  def main(args: Array[String]): Unit = {
    // Initialiser la configuration Spark
    val conf = new SparkConf().setAppName("ExerciseRDD").setMaster("local[*]")
    val sc = new SparkContext(conf)

    // Créer une RDD à partir d'une liste de nombres
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numbersRDD = sc.parallelize(numbers)

    // Filtrer les nombres pairs
    val evenNumbersRDD = numbersRDD.filter(num => num % 2 == 0)

    // Calculer le carré de chaque nombre
    val squaredNumbersRDD = evenNumbersRDD.map(num => num * num)

    // Calculer la somme des carrés
    val sumOfSquares = squaredNumbersRDD.reduce((x, y) => x + y)

    // Afficher le résultat
    println("La somme des carrés des nombres pairs est : " + sumOfSquares)

    // Exercices sur les pairs RDD

    // Exercice 1: Créer une RDD de tuples (nombre, carré)
    val numbersAndSquaresRDD = numbersRDD.map(num => (num, num * num))

    // Exercice 2: Filtrer les nombres dont le carré est supérieur à 20
    val filteredNumbersAndSquaresRDD = numbersAndSquaresRDD.filter(pair => pair._2 > 20)

    // Exercice 3: Calculer la moyenne des carrés des nombres pairs
    val averageSquareOfEvenNumbers = {
      val countOfEvenNumbers = evenNumbersRDD.count()
      val sumOfSquareOfEvenNumbers = evenNumbersRDD.map(num => num * num).reduce((x, y) => x + y)
      sumOfSquareOfEvenNumbers / countOfEvenNumbers.toDouble
    }

    // Exercice 4: Trouver le nombre maximum dans la RDD originale
    val maxNumber = numbersRDD.max()

    // Exercice 5: Trouver le nombre minimum dans la RDD originale
    val minNumber = numbersRDD.min()

    // Afficher les résultats des exercices
    println("Exercice 1: RDD de tuples (nombre, carré)")
    numbersAndSquaresRDD.collect().foreach(println)

    println("Exercice 2: Nombres dont le carré est supérieur à 20")
    filteredNumbersAndSquaresRDD.collect().foreach(println)

    println("Exercice 3: Moyenne des carrés des nombres pairs")
    println("La moyenne est : " + averageSquareOfEvenNumbers)

    println("Exercice 4: Nombre maximum dans la RDD originale")
    println("Le nombre maximum est : " + maxNumber)

    println("Exercice 5: Nombre minimum dans la RDD originale")
    println("Le nombre minimum est : " + minNumber)

    // Arrêter le contexte Spark
    sc.stop()
  }
}
*/