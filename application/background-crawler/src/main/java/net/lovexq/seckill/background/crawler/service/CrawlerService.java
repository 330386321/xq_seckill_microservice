package net.lovexq.seckill.background.crawler.service;

import net.lovexq.seckill.common.model.JsonResult;

import java.util.Map;

/**
 * Created by LuPindong on 2017-4-27.
 */
public interface CrawlerService {
    JsonResult invokeInitialize(String baseUrl, String region, Integer curPage, Integer totalPage);

    JsonResult invokeCheck(String batch, String baseUrl, String region);

    JsonResult invokeUpdate(String batch, Integer curPage);

    void saveInitializeData(byte[] dataArray) throws Exception;

    void saveCheckData(byte[] dataArray) throws Exception;

    void generateStaticPage(Map dataMap, String templateName) throws Exception;
}