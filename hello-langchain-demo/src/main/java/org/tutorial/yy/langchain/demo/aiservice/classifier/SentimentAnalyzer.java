package org.tutorial.yy.langchain.demo.aiservice.classifier;

import dev.langchain4j.service.UserMessage;

/**
 * @author yyHuangfu
 * @create 2024/1/29
 * @description
 */
public interface SentimentAnalyzer {
    @UserMessage("Analyze sentiment of {{it}}")
    Sentiment analyzeSentimentOf(String text);

    @UserMessage("Does {{it}} have a positive sentiment?")
    boolean isPositive(String text);
}
