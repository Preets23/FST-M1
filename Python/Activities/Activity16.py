class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
            self.manufacturer=manufacturer
            self.model=model
            self.make=make
            self.transmission=transmission
            self.color=color
    def accelerate(self):
            print(self.manufacturer + " " + self.model +" is moving")
    def stop(self):
            print(self.manufacturer + " " + self.model + " has stopped")

obj1= Car("Honda","City","2019","Manual","White")
obj2= Car("Toyota","Corolla","2020","Auto","White")
obj3= Car("Maruthi","Breeza","2018","Manual","Red")

obj1.accelerate()
obj3.stop()
    

   
