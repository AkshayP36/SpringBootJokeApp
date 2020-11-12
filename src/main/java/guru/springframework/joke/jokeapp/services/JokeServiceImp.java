package guru.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

//Defining Service annotation to make the class as service

@Service
public class JokeServiceImp implements JokeService {

    //Implementing actual Joke business logic specific to this class

    // -----------------Initialization----------------- //
    //Initializing fields and creating constructors
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImp() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }



    // --------------- Business logic in the service layer ----------- //
    //Create or POST


    //Update or PUT


    //Read or GET

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }


    //Delete or DELETE
}
