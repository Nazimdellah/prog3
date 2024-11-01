package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val tableau: Array<String> = arrayOf(
        "pomme",
        "banane",
        "orange",
        "kiwi",
        "fraise",
        "mangue",
        "raisin",
        "ananas",
        "cerise",
        "melon"
    )

    try{
        trouvrveru(tableau, "")
    }catch (e:Exception){
        print(e)

    }

}
fun trouvrveru(tableau :Array<String> , element :String):Int {
    for (i in tableau.indices) {
        if (tableau[i] == element) {
            return i;
        }

    }
    throw  Exception();
}
