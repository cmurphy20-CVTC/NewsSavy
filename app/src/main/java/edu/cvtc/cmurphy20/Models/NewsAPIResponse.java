package edu.cvtc.cmurphy20.Models;

import java.io.Serializable;
import java.util.List;

import edu.cvtc.cmurphy20.SelectListener;

public class NewsAPIResponse implements Serializable {
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsHeadlines> articles) {
        this.articles = articles;
    }

    int totalResults;
    List<NewsHeadlines> articles;
}
