package ca.gforcesoftware.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


/**
 * @author gavinhashemi on 2024-10-05
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;


    /* Unlike we are using constructor to instantiate the bean,
        we are using 'new' in here for creating an object from third party application in the @Service (here is the Chuck Norris dependency)
     */
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
