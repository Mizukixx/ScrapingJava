package jp.sample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class ScrapeService {
    private String url = "https://www.yodobashi.com/product/100000001001889493/";

    public String getTitle() throws IOException {
        Document document = Jsoup.connect(url).get();
        //String doc = document.text();
        //Document document1 = Jsoup.parse(doc);
        //String html = "<div class=\"content-text right-align bold-font\">foo</div>";
        //Jsoup.parse(document);
        //System.out.println(document.text());
        //Elements title = document.select("span.p13n-sc-price");
        Elements title = document.select("div.valueAvg");
        for(Element i: title){
            System.out.println(i);
        }
        return title.text();
        //return document.html();
    }
}