package com.example.shreyas.jokersjoke;


import java.util.Random;

class JokeBook {

    private String[] jokes = {
            "Can a kangaroo jump higher than a house?  - Of course, a house doesn’t jump at all. ",
            "I wonder what my parents did to fight boredom before the internet. I asked my 17 brothers and sisters and they didn't know either.",
            "I saw two guys wearing matching clothing and I asked if they were gay. They quickly arrested me.",
            "Diet Day #1- I removed all the fattening food from my house. It was delicious.",
            "if 4 out of 5 people suffer from diahrea does that mean one dude enjoys it.",
            "So, after beating the crap out of the nerdy kid in my class who always gets things right, I returned to the front of the classroom and resumed teaching.",
            "Behind every angry woman is a man who has absolutely no idea what he did wrong.",
            "Whenever someone calls me ugly, I get super sad and hug them, because I know how tough life is for the visually impaired.",
            "I wonder what my parents did to fight boredom before the internet. I asked my 17 brothers and sisters and they didn't know either."
    };

    String getJoke()
    {
        Random randomGenerator= new Random();
        int randomNumber = randomGenerator.nextInt(jokes.length);
        return jokes[randomNumber];
    }
}
