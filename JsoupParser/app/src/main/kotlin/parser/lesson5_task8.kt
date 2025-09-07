package org.example.app

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()
    val quotes: Elements = doc.select("article.sc-14uz67c-0")

    for (textOfQuotes: Element in quotes) {
        val text = textOfQuotes.text()
        println(text)
    }
}
