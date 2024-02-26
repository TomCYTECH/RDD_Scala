import org.apache.spark.{SparkConf, SparkContext}

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

    // Afficher les résultats des exercices
    println("Exercice 1: RDD de tuples (nombre, carré)")

    println("Exercice 2: Nombres dont le carré est supérieur à 20")

    println("Exercice 3: Moyenne des carrés des nombres pairs")

    println("Exercice 4: Nombre maximum dans la RDD originale")

    println("Exercice 5: Nombre minimum dans la RDD originale")

    // Arrêter le contexte Spark
    sc.stop()
  }
}
