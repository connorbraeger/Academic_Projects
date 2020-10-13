#runs script of modified version of highlow game
from cards import Deck
from cards import Card
deck = Deck()
deck.shuffle()
print("Here is your card:")
first =deck.deal()
print(str(first))
print("Will the next card be higher or lower?")
last = deck.deal()
guess = input(">" )
if guess.lower() == "higher":
    if first > last:
        print("You guessed wrong.")
    else:
        print("Ding Ding Ding")
if guess.lower() == "lower":
    if first > last:
        print("You guessed right")
    else:
        print("wrong answer bud")
print("the final card was " + str(last))
