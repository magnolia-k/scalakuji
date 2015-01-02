import scala.util.Random

object Main extends App {
    val omikuji = Array(
            "大吉",
            "中吉",
            "小吉",
            "吉",
            "半吉",
            "末吉",
            "末小吉",
            "凶",
            "小凶",
            "半凶",
            "末凶",
            "大凶"
            )

    Random.setSeed(System.currentTimeMillis)
    val result = omikuji(Random.nextInt(omikuji.length))
    println(result)
}
