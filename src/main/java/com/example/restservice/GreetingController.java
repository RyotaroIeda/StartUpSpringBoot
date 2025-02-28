package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // @GetMappingアノテーションによりHTTPリクエストが/greetingメソッドにマッピングされることが保証される
    @GetMapping("/greeting")
    // @RequestParamクエリ文字列パラメータの値をメソッドのパラメータnameにバインドする。
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        // 属性を持つ新しいGreetingオブジェクトを作成し返し、greetingを使用し指定されたid, content, counter, name, templateをフォーマットする。
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
