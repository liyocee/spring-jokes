package com.liyosi.springjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class ChuckNorrisJokes implements JokesService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public ChuckNorrisJokes(ChuckNorrisQuotes chuckNorrisQuotes) {
    this.chuckNorrisQuotes = chuckNorrisQuotes;
  }

  @Override
  public String randomJoke() {
    return chuckNorrisQuotes.getRandomQuote();
  }
}
