package com.vah.august;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;

import java.util.stream.Stream;

import static org.apache.http.HttpHeaders.ACCEPT;
import static org.apache.http.HttpHeaders.CONTENT_TYPE;

public class Main {
    public static void main(String[] args) {
        HttpPost post = new HttpPost();

        post.setHeader(ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
        post.setHeader(CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType());

        Stream.of(post.getAllHeaders()).forEach(System.out::println);
    }
}
