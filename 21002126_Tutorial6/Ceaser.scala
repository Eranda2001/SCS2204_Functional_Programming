object Ceaser {
  def encryption(str: String, shift: Int): String = {
    val text = new StringBuilder //StringBuilder is a library used to append characters without creating objects at each instance

    for (cur <- str) {
      if (cur.isLetter) {
        val base = if (cur.isUpper) 'A' else 'a'
        val encrypted = ((cur - base + shift) % 26 + base).toChar
        text.append(encrypted)
      } else {
        text.append(cur)
      }
    }
    text.toString
  }

  def decryption(text: String, shift: Int): String = {
    encryption(text, 26-shift)
  }

  def cipher(data: String, shift: Int, encrypt_decrypt: (String, Int) => String): String = {
    encrypt_decrypt(data, shift)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the string to decrypt: ")
    val str = scala.io.StdIn.readLine()
    print("Enter the amount to switch: ")
    val shift = scala.io.StdIn.readInt()

    val encrypted = cipher(str, shift, encryption)
    println("Encrypted String:"+ encrypted)

    val decrypted = cipher(encrypted, shift, decryption)
    println("Decrypted String: "+ decrypted)
  }
}
