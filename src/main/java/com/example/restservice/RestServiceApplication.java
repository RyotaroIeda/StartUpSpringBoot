package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringInitializerはアプリケーションクラスを作成する
@SpringBootApplication
public class RestServiceApplication {
//    @SpringBootApplicationは、以下のすべてを追加する便利な注釈です。
//    - Configuration: アプリケーション コンテキストの Bean 定義のソースとしてクラスにタグを付けます。
//    - EnableAutoConfiguration: クラスパス設定、他の Bean、およびさまざまなプロパティ設定に基づいて Bean の追加を開始するように Spring Boot に指示します。たとえば、 がspring-webmvcクラスパス上にある場合、このアノテーションはアプリケーションを Web アプリケーションとしてフラグ付けし、 の設定などの主要な動作をアクティブ化しますDispatcherServlet。
//    - ComponentScan: Spring にパッケージ内の他のコンポーネント、構成、サービスを検索してcom/exampleコントローラーを見つけるように指示します。
    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
