class car:
    'This class illustrates a car'

    def __init__(self, manufacturer, model, make, transmission,color):

        self.manufacturer= manufacturer
        self.make= make
        self.transmission = transmission
        self.color= color
        self.model- model

    def accelerate(self):
        print(self.manufacturer + "" + self.model +"is moving")

    def stop(self):
        print(print(self.manufacturer + "" + self.model +"is stop" ))

        obj1= car("Maruti","Zen","2010","Manual","Silver")
        obj2= car("Hyndai","creta","2013","Manual","White")
        obj3= car("Kia","anni","2020","Manual","White")

        obj1.accelerate()
        obj2.stop()
        obj3.stop()





