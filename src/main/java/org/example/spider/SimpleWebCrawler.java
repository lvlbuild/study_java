package org.example.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class SimpleWebCrawler {

    /**
     * 主函数，程序入口点
     * 启动图书网站爬虫程序，爬取指定URL的图书信息
     *
     * @param args 命令行参数数组，本程序未使用
     */
    public static void main(String[] args) {
        String url = "https://books.toscrape.com/"; // 测试用的图书网站

        try {
            System.out.println("开始爬取: " + url);
            // 调用爬虫方法爬取图书网站数据
            crawlBookWebsite(url);
        } catch (IOException e) {
            System.err.println("爬取失败: " + e.getMessage());
        }
    }


    /**
     * 爬取图书网站信息
     * 该函数连接指定的图书网站URL，解析HTML文档并提取图书信息进行展示
     *
     * @param url 要爬取的图书网站URL地址
     * @throws IOException 当网络连接或IO操作出现异常时抛出
     */
    public static void crawlBookWebsite(String url) throws IOException {
        // 连接网站并获取HTML文档
        Document doc = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                .timeout(10000)
                .get();

        // 提取所有图书信息
        Elements books = doc.select(".product_pod");
        System.out.println("找到 " + books.size() + " 本图书");

        // 遍历每本图书并输出详细信息
        for (Element book : books) {
            String title = book.select("h3 > a").attr("title");
            String price = book.select(".price_color").text();
            String availability = book.select(".availability").text();

            System.out.println("标题: " + title);
            System.out.println("价格: " + price);
            System.out.println("库存: " + availability);
            System.out.println("---");
        }
    }

}
