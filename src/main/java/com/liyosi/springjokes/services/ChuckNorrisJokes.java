package com.liyosi.springjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class ChuckNorrisJokes extends ChuckNorrisQuotes implements JokesService {

  @Override
  public String randomJoke() {
    return getRandomQuote();
  }
}
