package com.liyosi.springjokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by liyosi on Aug, 2018
 */

//@Configuration
public class ChuckConfiguration {

//  @Bean
  public ChuckNorrisQuotes chuckNorrisQuotes() {
    return new ChuckNorrisQuotes();
  }
}
