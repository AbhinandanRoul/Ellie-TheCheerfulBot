package com.example.emotiontracer;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class listOfArticles {
    ArrayList<Article> listOfArticlesHappy = new ArrayList<>();
    ArrayList<Article> listOfArticlesSad = new ArrayList<>();
    ArrayList<Article> listOfArticlesAngry = new ArrayList<>();
    ArrayList<Article> listOfArticlesBored = new ArrayList<>();
    ArrayList<Article> listOfArticlesSomething = new ArrayList<>();

    public listOfArticles(){
        String title = "";
        String body = "";
        String source =  "";
        Article ob = null;
//happy
//        1
        title = "A Letter to You on Your Sad Days";
        body = "Life is not always easy. You get tired of fighting and faking a smile when your soul wants you to cry. It’s exhausting trying to deal with people.Covering up your sadness has become your norm and the way you’ve kept going is by ignoring it. But not anymore. You can’t do it any longer. You’ve lost interest in life and you can’t hide it anymore.It’s ok. You have the right to collapse. Trust me. Cry, scream out in pain, don’t smile if you don’t feel like it. Sometimes life is really tough.It’s not your job to always be fine or make people think you are. Remember that masks hurt too, because they conceal the real you and allow you to deny yourself.On your sad days, cry if that’s what you need, scream if you can’t take it anymore. It’s better to express how you feel than to let yourself drown.";
        source = "https://exploringyourmind.com/a-letter-to-you-your-sad-days/";
        ob = new Article(title, body, source);
        listOfArticlesSad.add(ob);

//        2
        title = "Overcome Sadness: 19 Simple Things You Didn’t Realize You Can Do";
        body = "“Forgiveness does not change the past but it does enlarge the future.” – Paul Boese.To overcome sadness, you need to let go of your old stories. You were born happy and you stayed happy until caregivers, teachers and peers unknowingly said unpleasant things to you. Now, new events can trigger these old hurts and thus make you feel more sad than they should. So when you catch yourself thinking about the old unpleasant events, engage in the tips below to overcome sadness.1. Decide you are ready to let go of the pain, no matter what.If you don’t make peace with the past, the associated toxic energy will eventually show up as health, weight and mood issues. You might even go to the grave with regrets. Let it go. It’s not worth the misery of bad mental and physical health.";
        source = "https://www.lifehack.org/articles/communication/overcome-sadness-19-simple-things-you-didnt-realize-you-can.html";
        ob = new Article(title, body, source);
        listOfArticlesSad.add(ob);

        //3
        title = "An Open message To You For When You’re Sad or Depressed";
        body = "I’m asking you to do one thing. One thing only. One thing as often as you can, as much as you can, for as long as you can. One thing, one word, one action that could change your life and harness the infinite power that you hold inside you to change that which is slowly killing you. One thing that could create for you a world which you’ve never dreamed, and will provide the start point for all other endeavors upon which this great life has the potential to carry you toward. I’m asking you to move. And that’s it.";
        source = "https://psiloveyou.xyz/an-open-letter-to-you-for-when-youre-sad-or-depressed-57b460fa025e";
        ob = new Article(title, body, source);
        listOfArticlesSad.add(ob);

        //4
        title = "Read This When You’re Feeling Sad And Don’t Know Why";
        body = "This is for you on the days when you feel like giving up; on the days when you wish you could hide away in your bed and never return. This is for you on the days when the clouds block any glimpse of sunlight, when the shadows paint the world around you. This is for you on the days when nothing feels right…when you’re drowning in helplessness, when you’re crawling out of your skin…when you’re falling, when you’re sinking, and when you don’t know if you can go on.Somedays life will be too hard…so much harder than you ever imagined. So much harder than you ever expected. These are the days that will wear you down…the days that will test you to the point of exhaustion.";
        source = "https://thoughtcatalog.com/colleen-george/2016/03/read-this-when-youre-feeling-sad-and-dont-know-why/";
        ob = new Article(title, body, source);
        listOfArticlesSad.add(ob);

        //5
        title = "Things to Do When You’re Sad – Self Care Tips";
        body = "1. CREATE ART / DIY CRAFTS.It’s not about creating something good enough to be seen and complimented on by others.Create for the sake of creating – do it for yourself.2. LISTEN TO BEAUTIFUL MUSIC Listen to your favorite songs. Whenever I feel sad, this is an absolute must for me. Music really does help to soothe a sad soul";
        source = "https://www.shihoriobata.com/blog/things-to-do-when-sad/";
        ob = new Article(title, body, source);
        listOfArticlesSad.add(ob);

        //Angry
        //1

        title = "The Right Way to Get Angry";
        body = "Anger is in itself neither good nor bad—it’s what you do with it that matters.Anger is best viewed as a tool that helps us read and respond to upsetting social situations. Research overwhelmingly indicates that feeling angry increases optimism, creativity, effective performance—and research suggests that expressing anger can lead to more successful negotiations, in life or on the job.";
        source = "https://greatergood.berkeley.edu/article/item/the_right_way_to_get_angry";
        ob = new Article(title, body, source);
        listOfArticlesAngry.add(ob);
//2

        title = "Feeling angry: Mental health and what to do";
        body = "Anger is a normal emotion that everyone experiences from time to time. However, if a person feels unable to control their anger, it can cause problems in relationships and at work. It might also affect their quality of life.";
        source = "https://www.medicalnewstoday.com/articles/326155";
        ob = new Article(title, body, source);
        listOfArticlesAngry.add(ob);

//3

        title = "Controlling anger before it controls you";
        body = "Anger is a completely normal, usually healthy, human emotion. But when it gets out of control and turns destructive, it can lead to problems—problems at work, in your personal relationships, and in the overall quality of your life. And it can make you feel as though you're at the mercy of an unpredictable and powerful emotion. This brochure is meant to help you understand and control anger.";
        source = "https://www.apa.org/topics/anger/control";
        ob = new Article(title, body, source);
        listOfArticlesAngry.add(ob);

//4

        title = "Self-care when you’re angry";
        body = "Survivors often experience anger due to the abusive things they’ve been put through, and self-care can be helpful for anyone- survivor or not – whose anger is getting the best of them. If you’re concerned that you’ve let your angry feelings lead you to choose abusive behaviors, contact love is respect.";
        source = "https://www.loveisrespect.org/resources/self-care-when-youre-angry/";
        ob = new Article(title, body, source);
        listOfArticlesAngry.add(ob);

//5

        title = "12 Ways To Calm Down When You're Pissed Off And Don't Want To Be";
        body = "Have you seen the animated movie Inside Out? There’s a character in it, Anger, whose head literally explodes every time he gets too worked up. It’s a great visual and it definitely doesn’t seem overly dramatic — we’ve all been there. Spoken over in a meeting, denied a raise or passed over for a promotion after going way above and beyond at work, let down by your partner when you needed them — you can probably feel your anger bubbling up right now just thinking about these things.";
        source = "https://www.buzzfeed.com/stephhallett/how-to-calm-down-when-angry";
        ob = new Article(title, body, source);
        listOfArticlesAngry.add(ob);

// bored
//1

        title = "Short Stories To Read If You’re Bored";
        body = "These are a couple original short stories written by me over the past three years, so I’m practically sharing with you, my entire junior high life for your amusement. You are so welcome.";
        source = "https://www.youthareawesome.com/short-stories-read-bored/";
        ob = new Article(title, body, source);
        listOfArticlesBored.add(ob);
//2

        title = "60 Things to Do When You’re Bored";
        body = "Boredom can feel impossible to escape. This is particularly true now, when many of us are stuck indoors due to social-distancing efforts necessary to slow the spread of COVID-19. Some people have children keeping them busy; others have even more work during this crisis. Others are just inside, looking at the same walls they’ve been looking at for days, potentially alone, and feeling like nothing can pull them out of this funk.";
        source = "https://www.thecut.com/article/things-to-do-when-bored.html";
        ob = new Article(title, body, source);
        listOfArticlesBored.add(ob);
//3

        title = "The Most Boring Article You'll Read Today.The kind of boredom you experience most often may be linked to your personality, say researchers.";
        body = "Who knew boredom could be so interesting? But it's not just being bored; it's what kind of boredom you are experiencing that has researchers intrigued.According to an article published in the journal Motivation and Emotion, there are five types of boredom—which is one more than the research team expected to identify. The boredom varieties range from a calm and pleasant experience to something more like depression.";
        source = "https://www.nationalgeographic.com/culture/article/131121-boredom-personality-psychology-students-science";
        ob = new Article(title, body, source);
        listOfArticlesBored.add(ob);
//4

        title = "What to Do When You’re Bored #SelfHelp";
        body = "When you’re bored, even thinking of what to do can be difficult. Whether we’re at home, work, in class, or out with friends, when we’re bored our mind begins to draw a blank, and we start to feel lazy for not knowing what we should be doing.Feeling lazy and feeling bored go hand in hand. Learning how to overcome laziness is one of the best things you can do to stop being bored, as once you no longer enjoy being lazy you realize just how many things there are out there for you to do, and your time starts to become much more precious to you.";
        source = "https://benjaminspall.com/bored/";
        ob = new Article(title, body, source);
        listOfArticlesBored.add(ob);
//5

        title = "How Boredom is Good for You";
        body = "Ifyou’re born in the good old 80ies, chances are, you remember the feeling of being bored. Lazy Sundays, with all your friends gone to visit their aunt Karin, you sitting around the house, not wanting to dig out the can full of Legos or play Street Fighter for the billionth time.Boredom. I very well remember this feeling (yep, I’m that old).But do you?What I did, when I was a bored kid";
        source = "https://medium.com/swlh/how-boredom-is-good-for-you-6a77a12287b8";
        ob = new Article(title, body, source);
        listOfArticlesBored.add(ob);
//Happy
//1

        title = "In Pursuit of Happiness.Is contentment the impossible dream?";
        body = "Why is happiness so hard to define?Happiness is a highly subjective thing. Everyone has different needs in life and everyone experiences happiness in different ways. One man’s happiness could mean solitude in front of the TV on a Friday night, while another’s could be at a wild party with thirty friends. Appearances of sheer ecstasy can easily be masks for anxiety and depression while a quiet demeanour can indicate comfort and contentment.";
        source = "https://www.explore-life.com/en/articles/in-pursuit-of-happiness";
        ob = new Article(title, body, source);
        listOfArticlesHappy.add(ob);
//2

        title = "Happy Thoughts: Here Are the Things Proven To Make You Happier";
        body = "What’s the secret to a head full of happy thoughts?Time to round up the research on living a happy life to see what we can use.First, yeah, a good chunk of happiness is controlled by your genes but there’s a lot you can do to make yourself happier. Many of these techniques have been repeatedly tested and even worked with the clinically depressed.Gratitude, Gratitude, Gratitude";
        source = "https://time.com/49947/happy-thoughts-here-are-the-things-proven-to-make-you-happier/";
        ob = new Article(title, body, source);
        listOfArticlesHappy.add(ob);
//3

        title = "20 Secrets to Living a Happier Life";
        body = "There’s an unfortunate reason why happiness is often elusive -- our brains simply aren’t wired that way. Instead, our brains have evolved to survive, to protect ourselves, to keep us safe. Sure, we have moments of elation and periods of contentment and bliss. But many of us are plagued with persistent negative emotions -- we are just plain stuck in the “blahs.”";
        source = "https://www.entrepreneur.com/article/315636";
        ob = new Article(title, body, source);
        listOfArticlesHappy.add(ob);
//4

        title = "How to Enjoy Your Day and Make It a Good Day";
        body = "How about making every day a wonderful and enjoyable day, different and better than today?You can enjoy beautiful, satisfying and wonderful days by making small changes in your daily life.Everyone encounters problems, difficulties and obstacles, which can spoil one’s day. However, with a changed attitude and a few steps, you will be able to make your days, at least to some extent, better and more enjoyable.";
        source = "https://www.successconsciousness.com/blog/happiness-fun/enjoy-your-day/";
        ob = new Article(title, body, source);
        listOfArticlesHappy.add(ob);
//5

        title = "Happiness Comes from Within";
        body = "The source of happiness is within us. Happiness starts from within us.External events might cause it to manifest, but the real source of happiness comes from within you.Happiness often seems to be the result of external factors, but actually, it starts and comes out into the open from inside us.There is inner happiness within everyone, but it is covered by layers of negative thoughts, fears, worries and anxieties. Inner happiness is an inseparable part of our inner being, of our essence, but we often allow various factors to hide it.";
        source = "https://www.successconsciousness.com/blog/happiness-fun/happiness-comes-from-within/";
        ob = new Article(title, body, source);
        listOfArticlesHappy.add(ob);

    }

}