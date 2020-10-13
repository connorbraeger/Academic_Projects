class Distance:
    """class for representing a distance

    attributes: distance in inches(num)"""
    def __init__(self, inches=0, feet=0):
        """creates a distance with the given number of inches and feet.
        Number of feet and inches both default to zero.
        Distance, num, num-> None"""
        self.inches = float(inches) + float(feet)*12
    def __repr__(self):
        """returns a string of the form Distance(inches)

        Distance-> str"""
        return "Distance(" + repr(self.inches) + ")"
    def to_inches(self):
        """takes no extra arguments and returns the distance as a number of
        inches.

        Distance->num"""
        return self.inches 
    def to_feet(self):
        """takes no extra arguments and returns the distance as a number of feet

        Distance->num"""
        return self.inches/12
    def to_inches_and_feet(self):
        """returns tuple of two numbers representing Distance in and inches and
        feet with inches first

        Distance->tup"""
        return (self.to_inches()%12, self.to_inches()//12)
        
    def __str__(self):
        """returns string in the format feet'inches"

        Distance-> str"""
        tup = self.to_inches_and_feet()
        inch = str(tup[0])
        feet = str(tup[1])
        return feet + "'" + inch + '"'
    def __eq__(self,other):
        """returns True if self and other represent the same distance

        Distance, Distance-> bool"""
        return self.to_inches() == other.to_inches()
    def __gt__(self, other):
        """returns True if self represents a larger distance than other

        Distance, Distance-> bool"""
        return self.to_inches() > other.to_inches()
    def __ge__(self, other):
        """returns True if self represents an equal or larger distance than
        other

        Distance, Distance-> bool"""
        return self.to_inches() >= other.to_inches()
    
    def __add__(self, other):
        """returns new Distance object representing sum of two Distances

        Distance, Distance->Distance"""
        dist = self.to_inches() + other.to_inches()
        return Distance(dist)
