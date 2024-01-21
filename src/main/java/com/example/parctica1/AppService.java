package com.example.parctica1;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class AppService {
    private static final String URL = "https://api.waifu.pics/sfw/";
    String[] random = {"waifu", "neko", "shinobu", "megumin", "bully", "cuddle", "cry", "hug", "awoo", "kiss", "lick", "pat", "smug", "bonk", "yeet", "blush", "smile", "wave", "highfive", "handhold", "nom", "bite", "glomp", "slap", "kill", "kick", "happy", "wink", "poke", "dance", "cringe"};
    int r1;
    int r2;
    int r3;
    RestTemplate restTemplate= new RestTemplate();

    /*@Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.defaultHeader("X-RapidAPI-Key", "546f670d46msh5f8b43f184031c1p1f1994jsn163d8dfb16f7").build();
    }
    RestTemplate restTemplate = restTemplate(new RestTemplateBuilder());*/

    public Root getRoot1(){
        r1 =(int) (Math.random()*31);

        System.out.println(r1);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL+ random[r1]);
        return restTemplate.getForObject(
                builder.toUriString(), Root.class
        );
    }
    public Root getRoot2(){
        r2 =(int) (Math.random()*31);

        System.out.println(r2);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL+ random[r2]);
        return restTemplate.getForObject(
                builder.toUriString(), Root.class
        );
    }
    public Root getRoot3(){
        r3 =(int) (Math.random()*31);

        System.out.println(r3);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL+ random[r3]);
        return restTemplate.getForObject(
                builder.toUriString(), Root.class
        );
    }

}
