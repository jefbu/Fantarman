package main.graphics.gameScreen.homeScreen.randomNews.yourArmyNews;

import java.util.Random;

import main.Main;

public abstract class BoardReaction {
	
	static Random random = new Random();
	
	public static String getBoardReaction() {
		
		int roll = random.nextInt(5);
		if (Main.yourArmy.boardSatisfaction > 70) {
			switch(roll) {
			case 0: return "There's an email from the Board of Directors, telling you that they're pleased with your"
					+ " curent KPI scores and that they're expecting you to carry on "
					+ "and lead the team to further greatness. ...What a load of garbage.";
			case 1: return "You've been invited to the stockholders' general meeting, a rare honour you would happily"
					+ " have gone without. Still, the invite shows a remarkable trust in your achievements, as directors"
					+ " tend to jealously guard this apparent privilege to themselves.";
			case 2: return "Your manager huddles over to talk to you at the coffee machine. He tries to be casual, "
					+ "but fails. Piercing through the meaningless persiflage of a conversation, you understand that your"
					+ " good results imply that we'll need to upscale your end of year bonus. Now we're talking!";
			case 3: return "You thought this part of your life was over after you had left elementary school, "
					+ "but apparently important people like to go and spend the weekend together in a cabin in a forest "
					+ "well beyond middle age. Only, they call it a Leadership Retreat. "
					+ "And since you've been so successful, you've been invited to participate. Glee.";
			case 4: return "Nobody could fault your performance, except of course your manager, "
					+ "who is never satisfied no matter what you pull out of your sleeve. "
					+ "Your weekly report has got pretty much everything in green, "
					+ "but their reply focuses on the one small"
					+ " area where you only achieved average results, asking you how you're going to improve on that."
					+ "Would it really hurt to say thank you once in a while?";
			default: return "Error in board satisfaction > 70";
			}
		}
		else if (Main.yourArmy.boardSatisfaction > 50) {
			switch(roll) {
			case 0:  return "Your manager has informed you that your performance has been average, "
					+ "but can surely be built upon."
					+ " Somehow, they also believe that it's their responsibility to turn you into a top achiever. "
					+ "You've been invited into a 360 Degree Feedback session. "
					+ "Lauded by modern managers all over the world, "
					+ "you've only ever seen this end up in rancour and rifts. Oh well, tough luck."; 
			case 1: return "Your performance appraisal has been somewhat of a dud. "
					+ "You're not outright doing terribly, but it's clear they hired you for loftier achievements."
					+ " Still, management must still believe in you, since they've decided to spend money on a personal"
					+ " Strengths Coach to help you improve. Thanks, I guess?";
			case 2: return "The Board of Directors is getting angsty with your performance. It's not that it's bad,"
					+ " it's that they're hoping it'll be better soon. They've asked you to work out a PdP, "
					+ "with the subtle implication that the next step might be a PiP...";
			case 3: return "It's clear to management that your performance is suffering because of not fully understanding"
					+ " the company's culture yet. They've appointed a mentor, who's been here for decades, to guide and"
					+ " steer you towards greatness. It's unfortunately someone you cannot stand...";
			case 4: return "If you're truly honest with yourself, you haven't been doing a terrific job yet."
					+ " Luckily for you, management seems to be more absorbed in delivering petty comeuppance and so"
					+ " hasn't really taken a keen interest in your results yet. Fly under the radar as long as you can, "
					+ "pilot!";
			default: return "Error in board satisfaction > 50";
			}
		}
		else {
			switch(roll) {
			case 0: return "You know you haven't performed all that well. "
					+ "You could even accept the axe of contract termination come chopping down."
					+ " But what really rattles is how management is holding interviews for finding your "
					+ "replacement right where you can see them...";
			case 1: return "Your manager is actually a former sergeant major in the army."
					+ " You are lightly reminded of this as he gives you a solid shouting to for your "
					+ "pitiful excuse of results. The spit produced by his quavering voice is flying all around "
					+ "and his bulging eyes and pronounced veins are making you wonder if he'll have a stroke. "
					+ "All in all, you've had better days.";
			case 2: return "You used to be popular. People sought you out for a quick chat, or went with you for lunch."
					+ " Now though, it's as if you caught a highly infectious disease. You're avoided, evaded and dodged,"
					+ " and people actually stop talking when you join them. Almost as if they're talking about you...";
			case 3: return "Management has been very worried with your performance, and that of your team. "
					+ "They've held a brainstorm session to help you find ways to better your results. "
					+ "The idea that got the highest rating, which they're presenting to you "
					+ "with a certain feigned decorum and crystal clear finality is... unpaid overtime?";
			case 4: return "Everything has gone awry. Team spirit is a joke, the budget is down the drains and the fans "
					+ "are shouting for your head. But worst of all, your manager has decided to step in and shackle you. "
					+ "All your decisions must now be approved by them beforehand, which is bad enough since they've not "
					+ "been in an operational role for decades, but is even worse considering they just don't have the "
					+ "time. So now a bunch of requests are piling up on their bottleneck of a desk.";
			default: return "Error in board satisfaction > 0";
			}
		}			
		
	}

}

	
