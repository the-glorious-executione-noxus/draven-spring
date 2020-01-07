```
2020-01-07 15:00:14.027 ERROR 15388 --- [ctor-http-nio-3] o.s.w.s.adapter.HttpWebHandlerAdapter    : [285611c6] Error [java.io.IOException: 你的主机中的软件中止了一个已建立的连接。] for HTTP GET "/applications", but ServerHttpResponse already committed (null)
```

```html
fegin：
Whitelabel Error Page
This application has no configured error view, so you are seeing this as a fallback.

Tue Jan 07 16:46:15 CST 2020
There was an unexpected error (type=Internal Server Error, status=500).
Could not extract response: no suitable HttpMessageConverter found for response type [reactor.core.publisher.Mono<java.lang.String>] and content type [text/plain;charset=UTF-8]
```



整合fegin + okhttp

```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
<dependency>
    <groupId>io.github.openfeign</groupId>
    <artifactId>feign-okhttp</artifactId>
</dependency>


feign:
  httpclient:
    enabled: false
  okhttp:
    enabled: true
```




 c.a.c.s.dashboard.metric.MetricFetcher   : Failed to fetch metric from