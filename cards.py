import random
class Card:
    """stores information about rank, suit, and class of a card
    methods:.get_rank(), .get_suit(), .get_class()"""

    def __init__(self, rank, clazz, suit):
        """initialized self with rank, suit, class

        Card, str or int, str, str->None"""
        self.__rank = int(rank)
        if suit[0].lower() == "t":
            self.__suit= "triangles"
        if suit[0].lower() == "s":
            self.__suit = "squares"
        if suit[0].lower()== "p":
            self.__suit = "pentagons"
        if clazz[0].lower() == "c":
            self.__clazz = "common"
        else:
            self.__clazz = "royal"
    def get_rank(self):
        """returns rank as integer

        Card->int"""
        return self.__rank
    def get_suit(self):
        """returns suit as string

        Card-> str"""
        return self.__suit
    def get_class(self):
        """returns class in lowercase

        Card->str"""
        return self.__clazz
    def __repr__(self):
        """returns a str of the form Card(rank, class, suit)

        Card-> str"""
        return "Card(" + repr(self.get_rank()) + ", " + repr(self.get_class()) + ", " + repr(self.get_suit()) +")"
    def __str__(self):
        """returns string in the format "rank of class suit

        Card->str"""
        return str(self.get_rank()) + " of " + self.get_class() + " " + self.get_suit()
    def numerize_class(self):
        """helper function that returns 1 if class is royal or 0 if class is common

        Card-> int"""
        if self.get_class()=="common":
            return 0
        else:
            return 1
    def numerize_suit(self):
        """helper function that returns 2 if suit is pentagon, 1 is suit is square or 0 if suit is triangles

        Card-> int"""
        if self.get_suit()=="pentagons":
            return 2
        elif self.get_suit() == "squares":
            return 1
        else:
            return 0 
    def __eq__(self,other):
        """returns True if self represents the same card as other

        Card, Card -> bool"""
        if self.get_rank() != other.get_rank():
            return False
        if self.get_suit() != other.get_suit():
            return False
        if self.get_class() != other.get_class():
            return False
        return True
    def __ge__(self, other):
        """returns True if self is a card higher than or equal to other

        Card, Card -> bool"""
        if self == other:
            return True
        if self.numerize_class() < other.numerize_class():
            return False
        if self.numerize_suit() < other.numerize_suit():
            return False
        if self.get_rank()< other.get_rank():
            return False
        else:
            return True
    def __gt__(self,other):
        """returns True if self is a card higher than other

        Card, Card -> bool"""
        if self == other:
            return False
        if self.numerize_class() < other.numerize_class():
            return False
        if self.numerize_suit() < other.numerize_suit():
            return False
        if self.get_rank()< other.get_rank():
            return False
        else:
            return True

        
class Deck:
    """stores information about collection of Cards

    atrributes: list of cards(lst)
    methods: .shuffle() and .deal()"""

    def __init__(self,card=None):
        """initializes self single card, sequence of cards, or None

        Card, seq of Card, None-> None"""
        lst_card = []
        try:
            card.get_suit()
            lst_card.append(card)
        except AttributeError:
            if card == None:
                lst_card =[Card(0, "common", "triangles"),Card(1, "common", "triangles"),Card(2, "common", "triangles"),Card(3, "common", "triangles"),Card(4, "common", "triangles"), Card(5, "common", "triangles"), Card(6, "common", "triangles"), Card(7, "common", "triangles"),Card(8, "common", "triangles"), Card(9, "common", "triangles"), Card(0, "royal", "triangles"), Card(1, "royal", "triangles"),       Card(2, "royal", "triangles"), Card(3, "royal", "triangles"), Card(4, "royal", "triangles"), Card(5, "royal", "triangles"),                      Card(6, "royal", "triangles"), Card(7, "royal", "triangles"), Card(8, "royal", "triangles"), Card(9, "royal", "triangles"),                      Card(0, "common", "squares"),Card(1, "common", "squares"),Card(2, "common", "squares"),Card(3, "common", "squares"),                      Card(4, "common", "squares"), Card(5, "common", "squares"), Card(6, "common", "squares"), Card(7, "common", "squares"),                      Card(8, "common", "squares"), Card(9, "common", "squares"), Card(0, "royal", "squares"), Card(1, "royal", "squares"),                     Card(2, "royal", "squares"), Card(3, "royal", "squares"), Card(4, "royal", "squares"), Card(5, "royal", "squares"),                      Card(6, "royal", "squares"), Card(7, "royal", "squares"), Card(8, "royal", "squares"), Card(9, "royal", "squares"),                     Card(0, "common", "pentagons"),Card(1, "common", "pentagons"),Card(2, "common", "pentagons"),Card(3, "common", "pentagons"),                       Card(4, "common", "pentagons"), Card(5, "common", "pentagons"), Card(6, "common", "pentagons"), Card(7, "common", "pentagons"),                      Card(8, "common", "pentagons"), Card(9, "common", "pentagons"), Card(0, "royal", "pentagons"), Card(1, "royal", "pentagons"),                    Card(2, "royal", "pentagons"), Card(3, "royal", "pentagons"), Card(4, "royal", "pentagons"), Card(5, "royal", "pentagons"),                      Card(6, "royal", "pentagons"), Card(7, "royal", "pentagons"), Card(8, "royal", "pentagons"), Card(9, "royal", "pentagons")]
            else:
                lst_card = card
        self.lst = lst_card
    def __repr__(self):
        """return a string of the form Deck(card, card, ...)

        Deck->str"""

        return "Deck(" + repr(self.lst) + ")"
    def __str__(self):
        """returns str of the form Card
                                    Card ...

        Deck-> str"""
        output = ""
        for card in self.lst:
            output = output + str(card) +","
        return output
             
    def shuffle(self):
        """randomizes order of the cards in the Deck's list

        Deck-> None"""
        random.shuffle(self.lst)
    def deal(self):
        """removes first card from the Deck and returns that card

        Deck-> Card"""
        card = self.lst[0]
        del self.lst[0]
        return card
    
    
    
        
                       
                       
                       
                
                
            
            
        

        
        
        
