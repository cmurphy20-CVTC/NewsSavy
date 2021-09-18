package edu.cvtc.cmurphy20;

import java.util.List;

import edu.cvtc.cmurphy20.Models.NewsHeadlines;

public interface OnFetchDataListener<NewsAPIResponse>{
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
