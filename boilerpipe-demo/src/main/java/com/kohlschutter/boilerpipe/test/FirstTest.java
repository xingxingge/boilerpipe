package com.kohlschutter.boilerpipe.test;

import com.kohlschutter.boilerpipe.BoilerpipeExtractor;
import com.kohlschutter.boilerpipe.extractors.CommonExtractors;
import com.kohlschutter.boilerpipe.sax.BoilerpipeSAXInput;
import com.kohlschutter.boilerpipe.document.TextDocument;
import org.xml.sax.InputSource;
import java.net.URL;

public class FirstTest {
  public static void main(String[] args) throws Exception {
//    String url = "https://news.sina.com.cn/c/2019-04-22/doc-ihvhiewr7450645.shtml";//不准
//    String url = "https://news.sina.com.cn/o/2019-04-22/doc-ihvhiqax4286849.shtml";//准
//    String url = "http://politics.people.com.cn/n1/2019/0422/c1001-31041388.html";//不准
//    String url = "http://politics.people.com.cn/n1/2019/0422/c1001-31041389.html";//准
//    String url = "http://opinion.people.com.cn/n1/2019/0422/c1003-31041407.html";
//    String url = "https://news.sina.com.cn";
//    String url = "https://news.sina.com.cn/s/2019-04-23/doc-ihvhiewr7785029.shtml";
//    String url = "https://news.sina.com.cn/c/2019-04-24/doc-ihvhiewr7898591.shtml";
    String url = "https://mil.news.sina.com.cn/china/2019-04-23/doc-ihvhiqax4677733.shtml";
    TextDocument doc = new BoilerpipeSAXInput(new InputSource(new URL(url).openStream()))
        .getTextDocument();
    BoilerpipeExtractor extractor = CommonExtractors.ARTICLE_EXTRACTOR;
    System.out.println(extractor.process(doc));
    System.out.println("title:" + doc.getTitle());
    System.out.println("content:" + doc.getContent());

  }

}
