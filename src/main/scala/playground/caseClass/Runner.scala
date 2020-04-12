package playground.caseClass

object Runner {
  // pattern matching
  def getPrintableString(p: Person): String = p match {
    case Student(name, year) =>
      s"$name is a student in Year $year"
    case Teacher(name, speciality) =>
      s"$name teaches $speciality"
    //case _ => "case not covered"
    case default => "Case not covered: " + default
  }

  def main(args: Array[String]) = {
    val s = Student("Al", 1)
    val t = Teacher("Bob Donnan", "Mathematics")
    val e = Janitor(name="Willi")

    println(getPrintableString(s));
    println(getPrintableString(t));
    println(getPrintableString(e));
  }
}
