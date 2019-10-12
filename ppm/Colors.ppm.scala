import ammonite.ops._

@main
def main(filename: String) = {
  val outputFile = os.pwd/filename
  write.over(outputFile, "P3\n256 256\n255\n")
  for ((r,g) <- (0 to 255 by 1).zip(255 to 0 by -1)) {
    write.append(outputFile, List.tabulate(256)(b => s"$r $g $b").mkString("", " ", "\n"))
  }
}

