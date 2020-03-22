package jp.covid19_kagawa.covid19information.data.entity

data class NewsData(
    val newsItems: List<NewsItem>
)

data class NewsItem(
    val date: String,
    val text: String,
    val url: String
)