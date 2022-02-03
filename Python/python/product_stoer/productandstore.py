class Product:
    def __init__(self,name,price,category):
        self.name=name
        self.price=price
        self.category=category
    def update_price(self,percent_change,is_increas):
        if(is_increas):
            self.price +=self.price*percent_change
        if(not is_increas):
            print("hh")
            self.price -=self.price*percent_change
    def print_info(self):
        print(self.price)
        print(self.name)
        print(self.category)
class Store:
    def __init__(self,name):
        self.name=name
        self.list_product = []
    def add_product(self, new_product):
        self.list_product.append(new_product)
    def sell_product(self, id):
        self.list_product[id].print_info()
        self.list_product[id]=0
    def inflation(self, percent_increase):
        for i in range(0,len(self.list_product)):
            self.list_product[i].update_price(percent_increase,True)
    def set_clearance(self, category, percent_discount):
        for i in range(0,len(self.list_product)):
            if self.list_product[i].category==category:
                print("**")
                self.list_product[i].update_price(percent_discount,False)

hat = Product("hat",30,"clothes")
shoes = Product("shoes",300,"clothes")
coat = Product("coat",12,"clothes")
banana = Product("banana",120,"veghtable")
alsma_store = Store("alsma")
alsma_store.add_product(hat)
alsma_store.add_product(shoes)
alsma_store.add_product(coat)
alsma_store.add_product(banana)
alsma_store.inflation(.05)
alsma_store.set_clearance("veghtable",.01)
hat.print_info()
shoes.print_info()
banana.print_info()